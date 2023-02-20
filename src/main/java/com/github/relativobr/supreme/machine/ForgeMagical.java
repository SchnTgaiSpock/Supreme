package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.machine.SimpleItemWithLargeContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class ForgeMagical extends SimpleItemWithLargeContainerMachine {

  public static final ItemStack[] RECIPE_FORGE_MAGICAL_MACHINE = new ItemStack[]{SupremeItems.RUSTLESS_MACHINE,
      new ItemStack(Material.ENCHANTING_TABLE), SupremeItems.RUSTLESS_MACHINE, SupremeItems.INDUCTIVE_MACHINE,
      SupremeItems.SYNTHETIC_RUBY, SupremeItems.INDUCTIVE_MACHINE, SlimefunItems.ELECTRIC_GOLD_PAN_3,
      SlimefunItems.PROGRAMMABLE_ANDROID_3, SlimefunItems.ELECTRIC_ORE_GRINDER_3};

  public static final ItemStack[] RECIPE_FORGE_MAGICAL_MACHINE_II = new ItemStack[]{
      SupremeItems.CONVEYANCE_MACHINE, SupremeItems.CETRUS_LUX, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.FORGE_MAGICAL_MACHINE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.THORNERITE, SupremeItems.CETRUS_LUMIUM, SupremeItems.THORNERITE};

  public static final ItemStack[] RECIPE_FORGE_MAGICAL_MACHINE_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeAttribute.getMagic(), SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.FORGE_MAGICAL_MACHINE_II, SupremeItems.SUPREME, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_GRAVEL = new AbstractItemRecipe(
      new ItemStack(Material.COBBLESTONE, 32), new ItemStack(Material.GRAVEL, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_SAND = new AbstractItemRecipe(
      new ItemStack(Material.GRAVEL, 32), new ItemStack(Material.SAND, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_SOUL_SAND = new AbstractItemRecipe(
      new ItemStack(Material.SAND, 32), new ItemStack(Material.SOUL_SAND, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_QUARTZ = new AbstractItemRecipe(
      new ItemStack(Material.SOUL_SAND, 32), new ItemStack(Material.QUARTZ, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_NETHERRACK = new AbstractItemRecipe(
      new ItemStack(Material.STONE, 32), new ItemStack(Material.NETHERRACK, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_NETHER_WART = new AbstractItemRecipe(
      new ItemStack(Material.WHEAT, 32), new ItemStack(Material.NETHER_WART, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_MAGICLUMP_1 = new AbstractItemRecipe(
      new ItemStack(Material.NETHER_WART, 32), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_MAGICLUMP_2 = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 32), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_MAGICLUMP_3 = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 32), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_ENDER_EYE = new AbstractItemRecipe(
      new ItemStack(Material.ENDER_PEARL, 16), new ItemStack(Material.ENDER_EYE, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_ENDERLUMP_1 = new AbstractItemRecipe(
      new ItemStack(Material.ENDER_EYE, 32), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_ENDERLUMP_2 = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 32), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_ENDERLUMP_3 = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 32), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_SYNTHETIC_SAPPHIRE = new AbstractItemRecipe(
      new ItemStack(Material.LAPIS_LAZULI, 32), new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_SYNTHETIC_EMERALD = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE, 32),
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_EMERALD, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_CARBON = new AbstractItemRecipe(
      new ItemStack(Material.COAL, 32), new SlimefunItemStack(SlimefunItems.CARBON, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_COMPRESSED_CARBON = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.CARBON, 32), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_CARBON_CHUNK = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON, 32), new SlimefunItemStack(SlimefunItems.CARBON_CHUNK, 4));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_SYNTHETIC_DIAMOND = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.CARBON_CHUNK, 16),
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_DIAMOND, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_CARBONADO = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_DIAMOND, 16), new SlimefunItemStack(SlimefunItems.CARBONADO, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_SOLAR_PANEL = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.FERROSILICON, 32), new SlimefunItemStack(SlimefunItems.SOLAR_PANEL, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_MAGNET = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.COBALT_INGOT, 32), new SlimefunItemStack(SlimefunItems.MAGNET, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_ELECTRO_MAGNET = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGNET, 32), new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_ELECTRIC_MOTOR = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 32), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_HEATING_COIL = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 32), new SlimefunItemStack(SlimefunItems.HEATING_COIL, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_TINY_URANIUM = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.CRUSHED_ORE, 32), new SlimefunItemStack(SlimefunItems.TINY_URANIUM, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_SMALL_URANIUM = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.TINY_URANIUM, 32), new SlimefunItemStack(SlimefunItems.SMALL_URANIUM, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_URANIUM = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.SMALL_URANIUM, 32), new SlimefunItemStack(SlimefunItems.URANIUM, 8));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_BLISTERING_INGOT = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.URANIUM, 32), new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_BLISTERING_INGOT_2 = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_2, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_BLISTERING_INGOT_3 = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_2, 32),
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_STEEL_PLATE = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 32), new SlimefunItemStack(SlimefunItems.STEEL_PLATE, 4));
  public static final AbstractItemRecipe RECIPE_FORGE_MAGICAL_REINFORCED_PLATE = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE, 4));

  public ForgeMagical(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_FORGE_MAGICAL_GRAVEL);
    list.add(RECIPE_FORGE_MAGICAL_SAND);
    list.add(RECIPE_FORGE_MAGICAL_SOUL_SAND);
    list.add(RECIPE_FORGE_MAGICAL_QUARTZ);
    list.add(RECIPE_FORGE_MAGICAL_NETHERRACK);
    list.add(RECIPE_FORGE_MAGICAL_NETHER_WART);
    list.add(RECIPE_FORGE_MAGICAL_MAGICLUMP_1);
    list.add(RECIPE_FORGE_MAGICAL_MAGICLUMP_2);
    list.add(RECIPE_FORGE_MAGICAL_MAGICLUMP_3);
    list.add(RECIPE_FORGE_MAGICAL_ENDER_EYE);
    list.add(RECIPE_FORGE_MAGICAL_ENDERLUMP_1);
    list.add(RECIPE_FORGE_MAGICAL_ENDERLUMP_2);
    list.add(RECIPE_FORGE_MAGICAL_ENDERLUMP_3);
    list.add(RECIPE_FORGE_MAGICAL_SYNTHETIC_SAPPHIRE);
    list.add(RECIPE_FORGE_MAGICAL_SYNTHETIC_EMERALD);
    list.add(RECIPE_FORGE_MAGICAL_CARBON);
    list.add(RECIPE_FORGE_MAGICAL_COMPRESSED_CARBON);
    list.add(RECIPE_FORGE_MAGICAL_CARBON_CHUNK);
    list.add(RECIPE_FORGE_MAGICAL_SYNTHETIC_DIAMOND);
    list.add(RECIPE_FORGE_MAGICAL_CARBONADO);
    list.add(RECIPE_FORGE_MAGICAL_SOLAR_PANEL);
    list.add(RECIPE_FORGE_MAGICAL_MAGNET);
    list.add(RECIPE_FORGE_MAGICAL_ELECTRO_MAGNET);
    list.add(RECIPE_FORGE_MAGICAL_ELECTRIC_MOTOR);
    list.add(RECIPE_FORGE_MAGICAL_HEATING_COIL);
    list.add(RECIPE_FORGE_MAGICAL_TINY_URANIUM);
    list.add(RECIPE_FORGE_MAGICAL_SMALL_URANIUM);
    list.add(RECIPE_FORGE_MAGICAL_URANIUM);
    list.add(RECIPE_FORGE_MAGICAL_BLISTERING_INGOT);
    list.add(RECIPE_FORGE_MAGICAL_BLISTERING_INGOT_2);
    list.add(RECIPE_FORGE_MAGICAL_BLISTERING_INGOT_3);
    list.add(RECIPE_FORGE_MAGICAL_STEEL_PLATE);
    list.add(RECIPE_FORGE_MAGICAL_REINFORCED_PLATE);
    return list;
  }

}
