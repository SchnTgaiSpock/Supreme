package com.github.relativobr.supreme.machine.multiblock;

import com.github.relativobr.supreme.generic.machine.FlexItemContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.util.ItemTier;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ElectricGearFabricator extends FlexItemContainerMachine {

  public static final ItemStack[] RECIPE_ELECTRIC_GEAR_MACHINE = new ItemStack[]{
      new ItemStack(Material.ENCHANTING_TABLE), new ItemStack(Material.ANVIL), new ItemStack(Material.SMITHING_TABLE),
      SupremeItems.PETRIFIER_MACHINE, SupremeItems.SYNTHETIC_RUBY, SupremeItems.PETRIFIER_MACHINE,
      SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR};

  public static final ItemStack[] RECIPE_ELECTRIC_GEAR_MACHINE_II = new ItemStack[]{
      SupremeItems.CONVEYANCE_MACHINE, SupremeItems.CETRUS_LUX, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.ELECTRIC_GEAR_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.BLEND_MACHINE, SupremeItems.CETRUS_IGNIS,
      SupremeItems.BLEND_MACHINE};

  public static final ItemStack[] RECIPE_ELECTRIC_GEAR_MACHINE_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeItems.CETRUS_LUX, SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.ELECTRIC_GEAR_MACHINE_II, SupremeItems.SUPREME,
      SupremeItems.CRYSTALLIZER_MACHINE, SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};

  @ParametersAreNonnullByDefault
  public ElectricGearFabricator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_TITANIUM_HELMET, ArmorBasic.TITANIUM_HELMET));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_AURUM_HELMET, ArmorBasic.AURUM_HELMET));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_ADAMANTIUM_HELMET, ArmorBasic.ADAMANTIUM_HELMET));
//    list.add(new AbstractItemRecipe(ArmorThornium.RECIPE_THORNIUM_HELMET, ArmorThornium.THORNIUM_HELMET));
    list.add(
        new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_HELMET), SupremeItems.THORNIUM_HELMET_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_HELMET_MAGIC),
        SupremeItems.THORNIUM_HELMET_RARE));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_HELMET_RARE),
        SupremeItems.THORNIUM_HELMET_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_HELMET_EPIC),
        SupremeItems.THORNIUM_HELMET_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_HELMET_LEGENDARY),
        SupremeItems.THORNIUM_HELMET_SUPREME));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_TITANIUM_CHESTPLATE, ArmorBasic.TITANIUM_CHESTPLATE));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_AURUM_CHESTPLATE, ArmorBasic.AURUM_CHESTPLATE));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_ADAMANTIUM_CHESTPLATE, ArmorBasic.ADAMANTIUM_CHESTPLATE));
//    list.add(new AbstractItemRecipe(ArmorThornium.RECIPE_THORNIUM_CHESTPLATE, ArmorThornium.THORNIUM_CHESTPLATE));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_CHESTPLATE),
        SupremeItems.THORNIUM_CHESTPLATE_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_CHESTPLATE_MAGIC),
        SupremeItems.THORNIUM_CHESTPLATE_RARE));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_CHESTPLATE_RARE),
        SupremeItems.THORNIUM_CHESTPLATE_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_CHESTPLATE_EPIC),
        SupremeItems.THORNIUM_CHESTPLATE_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_CHESTPLATE_LEGENDARY),
        SupremeItems.THORNIUM_CHESTPLATE_SUPREME));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_TITANIUM_LEGGINGS, ArmorBasic.TITANIUM_LEGGINGS));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_AURUM_LEGGINGS, ArmorBasic.AURUM_LEGGINGS));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_ADAMANTIUM_LEGGINGS, ArmorBasic.ADAMANTIUM_LEGGINGS));
//    list.add(new AbstractItemRecipe(ArmorThornium.RECIPE_THORNIUM_LEGGINGS, ArmorThornium.THORNIUM_LEGGINGS));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_LEGGINGS),
        SupremeItems.THORNIUM_LEGGINGS_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_LEGGINGS_MAGIC),
        SupremeItems.THORNIUM_LEGGINGS_RARE));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_LEGGINGS_RARE),
        SupremeItems.THORNIUM_LEGGINGS_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_LEGGINGS_EPIC),
        SupremeItems.THORNIUM_LEGGINGS_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_LEGGINGS_LEGENDARY),
        SupremeItems.THORNIUM_LEGGINGS_SUPREME));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_TITANIUM_BOOTS, ArmorBasic.TITANIUM_BOOTS));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_AURUM_BOOTS, ArmorBasic.AURUM_BOOTS));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_ADAMANTIUM_BOOTS, ArmorBasic.ADAMANTIUM_BOOTS));
//    list.add(new AbstractItemRecipe(ArmorThornium.RECIPE_THORNIUM_BOOTS, ArmorThornium.THORNIUM_BOOTS));
    list.add(
        new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_BOOTS), SupremeItems.THORNIUM_BOOTS_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_BOOTS_MAGIC),
        SupremeItems.THORNIUM_BOOTS_RARE));
    list.add(
        new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_BOOTS_RARE), SupremeItems.THORNIUM_BOOTS_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_BOOTS_EPIC),
        SupremeItems.THORNIUM_BOOTS_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_BOOTS_LEGENDARY),
        SupremeItems.THORNIUM_BOOTS_SUPREME));
//    list.add(new AbstractItemRecipe(WeaponsThornium.RECIPE_THORNIUM_BOW, WeaponsThornium.THORNIUM_BOW));
    list.add(
        new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_BOW), SupremeItems.THORNIUM_BOW_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_BOW_MAGIC),
        SupremeItems.THORNIUM_BOW_RARE));
    list.add(
        new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_BOW_RARE), SupremeItems.THORNIUM_BOW_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_BOW_EPIC),
        SupremeItems.THORNIUM_BOW_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_BOW_LEGENDARY),
        SupremeItems.THORNIUM_BOW_SUPREME));
//    list.add(new AbstractItemRecipe(WeaponsBasic.RECIPE_TITANIUM_SWORD, WeaponsBasic.TITANIUM_SWORD));
//    list.add(new AbstractItemRecipe(WeaponsBasic.RECIPE_AURUM_SWORD, WeaponsBasic.AURUM_SWORD));
//    list.add(new AbstractItemRecipe(WeaponsBasic.RECIPE_ADAMANTIUM_SWORD, WeaponsBasic.ADAMANTIUM_SWORD));
//    list.add(new AbstractItemRecipe(WeaponsThornium.RECIPE_THORNIUM_SWORD, WeaponsThornium.THORNIUM_SWORD));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_SWORD),
        SupremeItems.THORNIUM_SWORD_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_SWORD_MAGIC),
        SupremeItems.THORNIUM_SWORD_RARE));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_SWORD_RARE),
        SupremeItems.THORNIUM_SWORD_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_SWORD_EPIC),
        SupremeItems.THORNIUM_SWORD_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_SWORD_LEGENDARY),
        SupremeItems.THORNIUM_SWORD_SUPREME));
//    list.add(new AbstractItemRecipe(WeaponsThornium.RECIPE_THORNIUM_SHIELD, WeaponsThornium.THORNIUM_SHIELD));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_SHIELD),
        SupremeItems.THORNIUM_SHIELD_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_SHIELD_MAGIC),
        SupremeItems.THORNIUM_SHIELD_RARE));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_SHIELD_RARE),
        SupremeItems.THORNIUM_SHIELD_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_SHIELD_EPIC),
        SupremeItems.THORNIUM_SHIELD_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_SHIELD_LEGENDARY),
        SupremeItems.THORNIUM_SHIELD_SUPREME));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_TITANIUM_AXE, ToolsBasic.TITANIUM_AXE));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_AURUM_AXE, ToolsBasic.AURUM_AXE));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_ADAMANTIUM_AXE, ToolsBasic.ADAMANTIUM_AXE));
//    list.add(new AbstractItemRecipe(ToolsThornium.RECIPE_THORNIUM_AXE, ToolsThornium.THORNIUM_AXE));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_AXE), SupremeItems.THORNIUM_AXE_MAGIC));
    list.add(
        new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_AXE_MAGIC), SupremeItems.THORNIUM_AXE_RARE));
    list.add(
        new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_AXE_RARE), SupremeItems.THORNIUM_AXE_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_AXE_EPIC),
        SupremeItems.THORNIUM_AXE_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_AXE_LEGENDARY),
        SupremeItems.THORNIUM_AXE_SUPREME));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_TITANIUM_PICKAXE, ToolsBasic.TITANIUM_PICKAXE));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_AURUM_PICKAXE, ToolsBasic.AURUM_PICKAXE));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_ADAMANTIUM_PICKAXE, ToolsBasic.ADAMANTIUM_PICKAXE));
//    list.add(new AbstractItemRecipe(ToolsThornium.RECIPE_THORNIUM_PICKAXE, ToolsThornium.THORNIUM_PICKAXE));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_PICKAXE),
        SupremeItems.THORNIUM_PICKAXE_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_PICKAXE_MAGIC),
        SupremeItems.THORNIUM_PICKAXE_RARE));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_PICKAXE_RARE),
        SupremeItems.THORNIUM_PICKAXE_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_PICKAXE_EPIC),
        SupremeItems.THORNIUM_PICKAXE_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_PICKAXE_LEGENDARY),
        SupremeItems.THORNIUM_PICKAXE_SUPREME));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_TITANIUM_SHOVEL, ToolsBasic.TITANIUM_SHOVEL));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_AURUM_SHOVEL, ToolsBasic.AURUM_SHOVEL));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_ADAMANTIUM_SHOVEL, ToolsBasic.ADAMANTIUM_SHOVEL));
//    list.add(new AbstractItemRecipe(ToolsThornium.RECIPE_THORNIUM_SHOVEL, ToolsThornium.THORNIUM_SHOVEL));
    list.add(
        new AbstractItemRecipe(ItemTier.getMagicRecipe(SupremeItems.THORNIUM_SHOVEL), SupremeItems.THORNIUM_SHOVEL_MAGIC));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(SupremeItems.THORNIUM_SHOVEL_MAGIC),
        SupremeItems.THORNIUM_SHOVEL_RARE));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(SupremeItems.THORNIUM_SHOVEL_RARE),
        SupremeItems.THORNIUM_SHOVEL_EPIC));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_SHOVEL_EPIC),
        SupremeItems.THORNIUM_SHOVEL_LEGENDARY));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_SHOVEL_LEGENDARY),
        SupremeItems.THORNIUM_SHOVEL_SUPREME));

    return list;

  }

}
