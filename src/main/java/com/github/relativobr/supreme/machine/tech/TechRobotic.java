package com.github.relativobr.supreme.machine.tech;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.machine.SimpleItemContainerMachine;
import com.github.relativobr.supreme.generic.recipe.InventoryRecipe;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.util.ItemGroups;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nonnull;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class TechRobotic extends SimpleItemContainerMachine implements Radioactive {

  public static final ItemStack[] RECIPE_TECH_ROBOTIC = {SupremeItems.INDUCTIVE_MACHINE,
      SupremeItems.SYNTHETIC_RUBY, SupremeItems.INDUCTIVE_MACHINE, SlimefunItems.REINFORCED_PLATE,
      SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_PLATE, SupremeItems.RUSTLESS_MACHINE,
      SupremeItems.CORE_OF_BLOCK, SupremeItems.RUSTLESS_MACHINE};

  public static final ItemStack[] RECIPE_TECH_ROBOTIC_II = new ItemStack[]{SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.CONVEYANCE_MACHINE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.TECH_ROBOTIC, SupremeItems.INDUCTOR_MACHINE, SupremeItems.THORNERITE,
      SupremeItems.CETRUS_IGNIS, SupremeItems.THORNERITE};

  public static final ItemStack[] RECIPE_TECH_ROBOTIC_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeAttribute.getImpetus(), SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.TECH_ROBOTIC_II, SupremeItems.SUPREME, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final List<AbstractItemRecipe> recipes = new ArrayList<>();
  private Map<Block, ItemStack> processing = new HashMap<Block, ItemStack>();
  private Map<Block, Integer> progressTime = new HashMap<Block, Integer>();
  private int speed = 1;
  private int amoundUpgrade = 64;

  public TechRobotic(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  public static void addRecipe(ItemStack input, ItemStack output) {
    recipes.add(new AbstractItemRecipe(input, output));
  }

  private static void invalidProgressBar(BlockMenu menu, String txt) {
    for (int i : InventoryRecipe.TECH_ROBOTIC_PROGRESS_BAR_SLOT) {
      menu.replaceExistingItem(i, new CustomItemStack(Material.RED_STAINED_GLASS_PANE, txt));
    }
  }

  private static void invalidProgressBar(BlockMenu menu, Material material, String txt) {
    for (int i : InventoryRecipe.TECH_ROBOTIC_PROGRESS_BAR_SLOT) {
      menu.replaceExistingItem(i, new CustomItemStack(material, txt));
    }
  }

  @Override
  public int[] getInputSlots() {
    return InventoryRecipe.TECH_ROBOTIC_INPUT_SLOTS;
  }

  @Override
  public int[] getOutputSlots() {
    return InventoryRecipe.TECH_ROBOTIC_OUTPUT_SLOTS;
  }

  @Override
  protected void constructMenu(BlockMenuPreset preset) {

    for (int i : InventoryRecipe.TECH_ROBOTIC_BORDER) {
      preset.addItem(i, new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " ", new String[0]),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_ROBOTIC_BORDER_IN) {
      preset.addItem(i, new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE, " ", new String[0]),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_ROBOTIC_BORDER_OUT) {
      preset.addItem(i, new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE, " ", new String[0]),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_ROBOTIC_PROGRESS_BAR_SLOT) {
      preset.addItem(i, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " ", new String[0]),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_ROBOTIC_OUTPUT_SLOTS) {
      preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {
        @Override
        public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
          return false;
        }

        @Override
        public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, ClickAction action) {
          if (cursor == null) {
            return true;
          }
          return cursor.getType() == Material.AIR;
        }
      });
    }

  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      @Override
      public void tick(Block b, SlimefunItem sf, Config data) {
        TechRobotic.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  public void tick(Block b) {

    BlockMenu inv = BlockStorage.getInventory(b);

    final ItemStack itemProcess = processing.get(b);
    if (itemProcess == null) {

      final ItemStack itemOutput = validRecipeItem(inv);
      if (itemOutput != null) {

        invalidProgressBar(inv, itemOutput.getType(), " ");

        processing.put(b, itemOutput);
        progressTime.put(b, (getTimeProcess() * 2));

      } else {

        invalidProgressBar(inv, "&cTechRobotic unidentified recipe");

      }

    } else {

      if (this.getProgressTime(b) <= 0) {

        inv.pushItem(itemProcess.clone(), this.getOutputSlots());

        processing.put(b, null);
        progressTime.put(b, 0);
        invalidProgressBar(inv, Material.BLACK_STAINED_GLASS_PANE, " ");

      } else {

        this.processTicks(b, inv, itemProcess);

      }

    }

  }

  public int getProgressTime(Block b) {
    return progressTime.get(b) != null ? progressTime.get(b) : (getTimeProcess() * 2);
  }

  private void processTicks(Block b, BlockMenu inv, ItemStack result) {
    int ticksTotal = getTimeProcess() * 2;
    int ticksLeft = this.getProgressTime(b);
    if (ticksLeft > 0) {

      if (this.takeCharge(b.getLocation())) {

        int time = ticksLeft - this.getSpeed();
        if (time < 0) {
          time = 0;
        }
        progressTime.put(b, time);

        //todo adjust for partial progression in the 3 slots dynamically
        for (int i : InventoryRecipe.TECH_ROBOTIC_PROGRESS_BAR_SLOT) {
          ChestMenuUtils.updateProgressbar(inv, i, Math.round(ticksLeft / this.getSpeed()),
              Math.round(ticksTotal / this.getSpeed()), result);
        }
      } else {
        invalidProgressBar(inv, "&cNo power to machine");
      }
    } else {
      invalidProgressBar(inv, "&cMachine time failure");
    }
  }

  private ItemStack validRecipeItem(BlockMenu inv) {

    for (AbstractItemRecipe produce : this.recipes) {
      ItemStack itemStack = produce.getFirstItemInput().clone();
      itemStack.setAmount(getAmoundUpgrade());
      if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(getInputSlots()[0]), itemStack, false, true)) {
        inv.consumeItem(getInputSlots()[0], getAmoundUpgrade());
        return produce.getFirstItemOutput();
      }

    }
    return null;
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    List<ItemStack> displayRecipes = new ArrayList<>();
    this.recipes
        .stream().filter(Objects::nonNull)
        .forEach(recipe -> {
      ItemStack itemStack = recipe.getFirstItemOutput().clone();
      itemStack.setAmount(getAmoundUpgrade());
      displayRecipes.add(itemStack);
      displayRecipes.add(recipe.getFirstItemOutput());
    });
    return displayRecipes;
  }

  public int getSpeed() {
    return speed;
  }

  public TechRobotic setSpeed(int speed) {
    this.speed = speed;
    return this;
  }

  public int getAmoundUpgrade() {
    return amoundUpgrade;
  }

  public TechRobotic setAmoundUpgrade(int amoundUpgrade) {
    this.amoundUpgrade = amoundUpgrade;
    return this;
  }

  @Nonnull
  @Override
  public Radioactivity getRadioactivity() {
    return Radioactivity.VERY_HIGH;
  }

}