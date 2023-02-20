package com.github.relativobr.supreme.tools;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockGearFabricator;
import com.github.relativobr.supreme.util.EnchantsAndEffectsUtil;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.inventory.ItemStack;

public class AbstractTools extends SlimefunItem implements Soulbound, NotPlaceable {

  @ParametersAreNonnullByDefault
  private AbstractTools(@Nonnull SlimefunItemStack stack, ItemStack[] recipe) {
    super(ItemGroups.TOOLS_CATEGORY, stack, MultiBlockGearFabricator.getMachine(), recipe);
  }

  public static void setup(Supreme sup) {

    // add Enchant
    EnchantsAndEffectsUtil.addGearBasicEnchants(SupremeItems.TITANIUM_PICKAXE, SupremeItems.AURUM_PICKAXE, SupremeItems.ADAMANTIUM_PICKAXE,
        SupremeItems.TITANIUM_AXE, SupremeItems.AURUM_AXE, SupremeItems.ADAMANTIUM_AXE, SupremeItems.TITANIUM_SHOVEL,
        SupremeItems.AURUM_SHOVEL, SupremeItems.ADAMANTIUM_SHOVEL);

    // add Enchant
    EnchantsAndEffectsUtil.addGearThorniumEnchants(SupremeItems.THORNIUM_AXE, SupremeItems.THORNIUM_AXE_MAGIC,
        SupremeItems.THORNIUM_AXE_RARE, SupremeItems.THORNIUM_AXE_EPIC, SupremeItems.THORNIUM_AXE_LEGENDARY,
        SupremeItems.THORNIUM_AXE_SUPREME, SupremeItems.THORNIUM_PICKAXE, SupremeItems.THORNIUM_PICKAXE_MAGIC,
        SupremeItems.THORNIUM_PICKAXE_RARE, SupremeItems.THORNIUM_PICKAXE_EPIC,
        SupremeItems.THORNIUM_PICKAXE_LEGENDARY, SupremeItems.THORNIUM_PICKAXE_SUPREME, SupremeItems.THORNIUM_SHOVEL,
        SupremeItems.THORNIUM_SHOVEL_MAGIC, SupremeItems.THORNIUM_SHOVEL_RARE, SupremeItems.THORNIUM_SHOVEL_EPIC,
        SupremeItems.THORNIUM_SHOVEL_LEGENDARY, SupremeItems.THORNIUM_SHOVEL_SUPREME);

    final AbstractTools titaniumAxe = new AbstractTools(SupremeItems.TITANIUM_AXE, ToolsBasic.RECIPE_TITANIUM_AXE);
    titaniumAxe.register(sup);
    final AbstractTools aurumAxe = new AbstractTools(SupremeItems.AURUM_AXE, ToolsBasic.RECIPE_AURUM_AXE);
    aurumAxe.register(sup);
    final AbstractTools adamantiumAxe = new AbstractTools(SupremeItems.ADAMANTIUM_AXE, ToolsBasic.RECIPE_ADAMANTIUM_AXE);
    adamantiumAxe.register(sup);
    final AbstractTools axe = new AbstractTools(SupremeItems.THORNIUM_AXE, ToolsThornium.RECIPE_THORNIUM_AXE);
    axe.register(sup);
    final AbstractTools axeMagic = new AbstractTools(SupremeItems.THORNIUM_AXE_MAGIC,
        ItemTier.getMagicRecipe(SupremeItems.THORNIUM_AXE));
    axeMagic.register(sup);
    final AbstractTools axeRare = new AbstractTools(SupremeItems.THORNIUM_AXE_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_AXE_MAGIC));
    axeRare.register(sup);
    final AbstractTools axeEpic = new AbstractTools(SupremeItems.THORNIUM_AXE_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_AXE_RARE));
    axeEpic.register(sup);
    final AbstractTools axeLegendary = new AbstractTools(SupremeItems.THORNIUM_AXE_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_AXE_EPIC));
    axeLegendary.register(sup);
    final AbstractTools axeSupreme = new AbstractTools(SupremeItems.THORNIUM_AXE_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_AXE_LEGENDARY));
    axeSupreme.register(sup);

    final AbstractTools titaniumPickaxe = new AbstractTools(SupremeItems.TITANIUM_PICKAXE,
        ToolsBasic.RECIPE_TITANIUM_PICKAXE);
    titaniumPickaxe.register(sup);
    final AbstractTools aurumPickaxe = new AbstractTools(SupremeItems.AURUM_PICKAXE, ToolsBasic.RECIPE_AURUM_PICKAXE);
    aurumPickaxe.register(sup);
    final AbstractTools adamantiumPickaxe = new AbstractTools(SupremeItems.ADAMANTIUM_PICKAXE,
        ToolsBasic.RECIPE_ADAMANTIUM_PICKAXE);
    adamantiumPickaxe.register(sup);
    final AbstractTools pickaxe = new AbstractTools(SupremeItems.THORNIUM_PICKAXE,
        ToolsThornium.RECIPE_THORNIUM_PICKAXE);
    pickaxe.register(sup);
    final AbstractTools pickaxeMagic = new AbstractTools(SupremeItems.THORNIUM_PICKAXE_MAGIC,
        ItemTier.getMagicRecipe(SupremeItems.THORNIUM_PICKAXE));
    pickaxeMagic.register(sup);
    final AbstractTools pickaxeRare = new AbstractTools(SupremeItems.THORNIUM_PICKAXE_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_PICKAXE_MAGIC));
    pickaxeRare.register(sup);
    final AbstractTools pickaxeEpic = new AbstractTools(SupremeItems.THORNIUM_PICKAXE_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_PICKAXE_RARE));
    pickaxeEpic.register(sup);
    final AbstractTools pickaxeLegendary = new AbstractTools(SupremeItems.THORNIUM_PICKAXE_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_PICKAXE_EPIC));
    pickaxeLegendary.register(sup);
    final AbstractTools pickaxeSupreme = new AbstractTools(SupremeItems.THORNIUM_PICKAXE_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_PICKAXE_LEGENDARY));
    pickaxeSupreme.register(sup);

    final AbstractTools titaniumShovel = new AbstractTools(SupremeItems.TITANIUM_SHOVEL,
        ToolsBasic.RECIPE_TITANIUM_SHOVEL);
    titaniumShovel.register(sup);
    final AbstractTools aurumShovel = new AbstractTools(SupremeItems.AURUM_SHOVEL, ToolsBasic.RECIPE_AURUM_SHOVEL);
    aurumShovel.register(sup);
    final AbstractTools adamantiumShovel = new AbstractTools(SupremeItems.ADAMANTIUM_SHOVEL,
        ToolsBasic.RECIPE_ADAMANTIUM_SHOVEL);
    adamantiumShovel.register(sup);
    final AbstractTools shovel = new AbstractTools(SupremeItems.THORNIUM_SHOVEL, ToolsThornium.RECIPE_THORNIUM_SHOVEL);
    shovel.register(sup);
    final AbstractTools shovelMagic = new AbstractTools(SupremeItems.THORNIUM_SHOVEL_MAGIC,
        ItemTier.getMagicRecipe(SupremeItems.THORNIUM_SHOVEL));
    shovelMagic.register(sup);
    final AbstractTools shovelRare = new AbstractTools(SupremeItems.THORNIUM_SHOVEL_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_SHOVEL_MAGIC));
    shovelRare.register(sup);
    final AbstractTools shovelEpic = new AbstractTools(SupremeItems.THORNIUM_SHOVEL_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_SHOVEL_RARE));
    shovelEpic.register(sup);
    final AbstractTools shovelLegendary = new AbstractTools(SupremeItems.THORNIUM_SHOVEL_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_SHOVEL_EPIC));
    shovelLegendary.register(sup);
    final AbstractTools shovelSupreme = new AbstractTools(SupremeItems.THORNIUM_SHOVEL_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_SHOVEL_LEGENDARY));
    shovelSupreme.register(sup);

    if (getSupremeOptions().isEnableTech()) {
      MobCollectorTools.setup(sup);
    }
  }
}
