package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.machine.FlexItemContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ElectricCrafter extends FlexItemContainerMachine {

  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE = new ItemStack[]{SupremeItems.RUSTLESS_MACHINE,
      SlimefunItems.VANILLA_AUTO_CRAFTER, SupremeItems.RUSTLESS_MACHINE, SupremeItems.INDUCTIVE_MACHINE,
      SupremeItems.SYNTHETIC_RUBY, SupremeItems.INDUCTIVE_MACHINE, SupremeItems.ADAMANTIUM_PLATE,
      SlimefunItems.ENHANCED_AUTO_CRAFTER, SupremeItems.ADAMANTIUM_PLATE};

  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE_II = new ItemStack[]{
      SupremeItems.CONVEYANCE_MACHINE, SupremeItems.BLEND_MACHINE, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.ELECTRIC_CRAFTER_MACHINE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.CRYSTALLIZER_MACHINE, SupremeItems.CETRUS_IGNIS, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeItems.CETRUS_LUX, SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.ELECTRIC_CRAFTER_MACHINE_II, SupremeItems.SUPREME, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final AbstractItemRecipe RECIPE_BATTERY = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.ZINC_INGOT), new ItemStack(SlimefunItems.SULFATE),
          new ItemStack(SlimefunItems.COPPER_INGOT), new ItemStack(SlimefunItems.ZINC_INGOT),
          new ItemStack(SlimefunItems.SULFATE), new ItemStack(SlimefunItems.COPPER_INGOT),
          new ItemStack(Material.REDSTONE), null, null}, new SlimefunItemStack(SlimefunItems.BATTERY, 1));
  public static final AbstractItemRecipe RECIPE_BLAZE_POWDER = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.BLAZE_ROD), null, null, null, null, null, null, null, null},
      new ItemStack(Material.BLAZE_POWDER, 2));
  public static final AbstractItemRecipe RECIPE_ENDER_EYE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.ENDER_PEARL), null, null, null, null,
          null, null, null}, new ItemStack(Material.ENDER_EYE, 1));
  public static final AbstractItemRecipe RECIPE_GLASS_BOTTLE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), null,
          null, null, null, null, null}, new ItemStack(Material.GLASS_BOTTLE, 3));
  public static final AbstractItemRecipe RECIPE_FISHING_ROD = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.STICK), new ItemStack(Material.STRING), new ItemStack(Material.STRING),
          new ItemStack(Material.STICK), null, null, null, null, null}, new ItemStack(Material.FISHING_ROD, 1));
  public static final AbstractItemRecipe RECIPE_FLINT_AND_STEEL = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.IRON_INGOT), new ItemStack(Material.FLINT), null, null, null, null, null,
          null, null}, new ItemStack(Material.FLINT_AND_STEEL, 1));
  public static final AbstractItemRecipe RECIPE_SHEARS = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT),
          new ItemStack(Material.IRON_INGOT), null, null, null, null, null, null}, new ItemStack(Material.SHEARS, 1));
  public static final AbstractItemRecipe RECIPE_IRON_SWORD = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.STICK), new ItemStack(Material.IRON_INGOT),
          new ItemStack(Material.IRON_INGOT), null, null, null, null, null, null},
      new ItemStack(Material.IRON_SWORD, 1));
  public static final AbstractItemRecipe RECIPE_BARREL = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_SLAB),
          new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), null,
          new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_SLAB),
          new ItemStack(Material.OAK_PLANKS)}, new ItemStack(Material.BARREL, 1));
  public static final AbstractItemRecipe RECIPE_SYNTHETIC_AMETHYST = new AbstractItemRecipe(
      SupremeComponents.RECIPE_SYNTHETIC_AMETHYST, SupremeItems.SYNTHETIC_AMETHYST);
  public static final AbstractItemRecipe RECIPE_SYNTHETIC_RUBY = new AbstractItemRecipe(
      SupremeComponents.RECIPE_SYNTHETIC_RUBY, SupremeItems.SYNTHETIC_RUBY);

  public ElectricCrafter(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_BATTERY);
    list.add(RECIPE_BLAZE_POWDER);
    list.add(RECIPE_ENDER_EYE);
    list.add(RECIPE_GLASS_BOTTLE);
    list.add(RECIPE_FISHING_ROD);
    list.add(RECIPE_FLINT_AND_STEEL);
    list.add(RECIPE_SHEARS);
    list.add(RECIPE_IRON_SWORD);
    list.add(RECIPE_BARREL);
    list.add(RECIPE_SYNTHETIC_AMETHYST);
    list.add(RECIPE_SYNTHETIC_RUBY);
    return list;
  }

}
