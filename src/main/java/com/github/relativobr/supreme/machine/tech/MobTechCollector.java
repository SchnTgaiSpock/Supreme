package com.github.relativobr.supreme.machine.tech;

import com.github.relativobr.supreme.generic.machine.SimpleItemWithLargeContainerMachine;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.machine.recipe.MobTechCollectorMachineRecipe;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.ZombieTech;
import com.github.relativobr.supreme.util.ItemUtil;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Entity;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class MobTechCollector extends SimpleItemWithLargeContainerMachine {

  public static final ItemStack[] RECIPE_MOB_TECH_COLLECTOR_MACHINE_I = new ItemStack[]{
      SupremeItems.RUSTLESS_MACHINE, SupremeItems.MOB_COLLECTOR_I, SupremeItems.RUSTLESS_MACHINE,
      SupremeItems.INDUCTIVE_MACHINE, SupremeItems.MOB_COLLECTOR_I, SupremeItems.INDUCTIVE_MACHINE,
      SupremeItems.AURUM_PLATE, SlimefunItems.PROGRAMMABLE_ANDROID_3_BUTCHER, SupremeItems.AURUM_PLATE};

  public static final ItemStack[] RECIPE_MOB_TECH_COLLECTOR_MACHINE_II = new ItemStack[]{
      SupremeItems.CONVEYANCE_MACHINE, SupremeItems.CETRUS_LUMIUM, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.MOB_TECH_COLLECTOR_MACHINE_I,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.THORNERITE, SupremeItems.CETRUS_IGNIS,
      SupremeItems.THORNERITE};

  public static final ItemStack[] RECIPE_MOB_TECH_COLLECTOR_MACHINE_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeItems.CETRUS_LUX, SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.MOB_TECH_COLLECTOR_MACHINE_II, SupremeItems.SUPREME, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};


  private final Set<MobTechCollectorMachineRecipe> MobTechCollectorMachineRecipes = new HashSet<>();
  private int mobRange = 4;

  @ParametersAreNonnullByDefault
  public MobTechCollector(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }


  @Override
  protected void registerDefaultRecipes() {
    this.recipes.clear();
    SupremeOptions supremeOptions = Supreme.getSupremeOptions();
    if (supremeOptions.isMobTechEnableBee()) {
      this.addProduce(new MobTechCollectorMachineRecipe(SupremeItems.EMPTY_MOBTECH,
          ItemUtil.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0), (n) -> n instanceof Bee));
    }
    if (supremeOptions.isMobTechEnableIronGolem()) {
      this.addProduce(new MobTechCollectorMachineRecipe(SupremeItems.EMPTY_MOBTECH,
          ItemUtil.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0), (n) -> n instanceof IronGolem));
    }
    if (supremeOptions.isMobTechEnableZombie()) {
      this.addProduce(new MobTechCollectorMachineRecipe(SupremeItems.EMPTY_MOBTECH,
          ItemUtil.buildItemFromMobTechDTO(ZombieTech.SIMPLE_ZOMBIE, 0), (n) -> n instanceof Zombie));
    }
  }


  public void addProduce(@Nonnull MobTechCollectorMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    this.MobTechCollectorMachineRecipes.add(produce);
  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      public void tick(Block b, SlimefunItem sf, Config data) {
        MobTechCollector.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    return MobTechCollectorMachineRecipe.getAllRecipe();
  }

  @Nonnull
  @Override
  public String getRecipeSectionLabel(@Nonnull Player p) {
    return "&7Collects:";
  }


  @Override
  protected MachineRecipe findNextRecipe(@Nonnull BlockMenu inv) {
    int[] inputSlots = this.getInputSlots();

    for (int i = 0; i < inputSlots.length; ++i) {
      int slot = inputSlots[i];
      Iterator iterator = this.MobTechCollectorMachineRecipes.iterator();

      while (iterator.hasNext()) {
        MobTechCollectorMachineRecipe produce = (MobTechCollectorMachineRecipe) iterator.next();
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        final ItemStack itemInInput = produce.getInput()[0];
        if (itemInSlot != null && itemInInput != null && SlimefunUtils.isItemSimilar(itemInSlot,
            SupremeItems.EMPTY_MOBTECH, false, false) && InvUtils.fits(inv.toInventory(), produce.getOutput()[0],
            this.getOutputSlots())) {
          Block invBlock = inv.getBlock();
          produce.getClass();
          if (this.isAnimalNearby(invBlock, produce::test)) {
            inv.consumeItem(slot, 1);
            return produce;
          }
        }
      }
    }

    return null;
  }

  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(Block b, Predicate<LivingEntity> predicate) {
    return !b.getWorld().getNearbyEntities(b.getLocation(), mobRange, mobRange, mobRange, (n) -> {
      final boolean validAnimal = this.isValidAnimal(n, predicate);
      if (validAnimal) {
        n.remove();
      }
      return validAnimal;
    }).isEmpty();
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n, Predicate<LivingEntity> predicate) {
    return n instanceof LivingEntity && predicate.test((LivingEntity) n);
  }

  @Nonnull
  @Override
  public String getMachineIdentifier() {
    return "MOB_TECH_COLLECTOR";
  }

  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(Material.IRON_SWORD);
  }

  public final MobTechCollector setMobRange(int value) {
    this.mobRange = value;
    return this;
  }

}
