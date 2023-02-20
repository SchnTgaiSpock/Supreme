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
public class ForgeIngot extends SimpleItemWithLargeContainerMachine {

  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE = new ItemStack[]{SupremeItems.RUSTLESS_MACHINE,
      new ItemStack(Material.BLAST_FURNACE), SupremeItems.RUSTLESS_MACHINE, SupremeItems.INDUCTIVE_MACHINE,
      SupremeItems.PETRIFIER_MACHINE, SupremeItems.INDUCTIVE_MACHINE, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
      SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.CARBON_PRESS_3};

  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE_II = new ItemStack[]{SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.CETRUS_IGNIS, SupremeItems.CONVEYANCE_MACHINE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.FORGE_INGOT_MACHINE, SupremeItems.INDUCTOR_MACHINE, SupremeItems.THORNERITE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.THORNERITE};

  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeAttribute.getBomb(), SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.FORGE_INGOT_MACHINE_II, SupremeItems.SUPREME, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_LEAD = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.LEAD_DUST, 32), new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_ALUMINUM = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SILVER = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.SILVER_DUST, 32), new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_COPPER = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.COPPER_DUST, 32), new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_MAGNESIUM = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 32),
      new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_IRON = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.IRON_DUST, 32), new ItemStack(Material.IRON_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_TIN = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.TIN_DUST, 32), new SlimefunItemStack(SlimefunItems.TIN_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_ZINC = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.ZINC_DUST, 32), new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_4K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_DUST, 32), new SlimefunItemStack(SlimefunItems.GOLD_4K, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_6K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_4K, 32), new SlimefunItemStack(SlimefunItems.GOLD_6K, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_8K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_6K, 32), new SlimefunItemStack(SlimefunItems.GOLD_8K, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_10K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_8K, 32), new SlimefunItemStack(SlimefunItems.GOLD_10K, 30));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_12K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_10K, 32), new SlimefunItemStack(SlimefunItems.GOLD_12K, 28));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_14K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_12K, 32), new SlimefunItemStack(SlimefunItems.GOLD_14K, 26));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_16K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_14K, 32), new SlimefunItemStack(SlimefunItems.GOLD_16K, 24));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_18K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_16K, 32), new SlimefunItemStack(SlimefunItems.GOLD_18K, 22));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_20K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_18K, 32), new SlimefunItemStack(SlimefunItems.GOLD_20K, 20));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_22K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_20K, 32), new SlimefunItemStack(SlimefunItems.GOLD_22K, 18));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_24K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_22K, 32), new SlimefunItemStack(SlimefunItems.GOLD_24K, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_COBALT_INGOT = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.NICKEL_INGOT, 32), new SlimefunItemStack(SlimefunItems.COBALT_INGOT, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_DAMASCUS_STEEL_INGOT = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SILICON = new AbstractItemRecipe(
      new ItemStack(Material.QUARTZ_BLOCK, 32), new SlimefunItemStack(SlimefunItems.SILICON, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_FERROSILICON = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.SILICON, 32), new SlimefunItemStack(SlimefunItems.FERROSILICON, 16));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SULFATE = new AbstractItemRecipe(
      new ItemStack(Material.NETHERRACK, 64), new SlimefunItemStack(SlimefunItems.SULFATE, 8));

  public ForgeIngot(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_FORGE_INGOT_LEAD);
    list.add(RECIPE_FORGE_INGOT_ALUMINUM);
    list.add(RECIPE_FORGE_INGOT_SILVER);
    list.add(RECIPE_FORGE_INGOT_COPPER);
    list.add(RECIPE_FORGE_INGOT_MAGNESIUM);
    list.add(RECIPE_FORGE_INGOT_IRON);
    list.add(RECIPE_FORGE_INGOT_TIN);
    list.add(RECIPE_FORGE_INGOT_ZINC);
    list.add(RECIPE_FORGE_INGOT_GOLD_4K);
    list.add(RECIPE_FORGE_INGOT_GOLD_6K);
    list.add(RECIPE_FORGE_INGOT_GOLD_8K);
    list.add(RECIPE_FORGE_INGOT_GOLD_10K);
    list.add(RECIPE_FORGE_INGOT_GOLD_12K);
    list.add(RECIPE_FORGE_INGOT_GOLD_14K);
    list.add(RECIPE_FORGE_INGOT_GOLD_16K);
    list.add(RECIPE_FORGE_INGOT_GOLD_18K);
    list.add(RECIPE_FORGE_INGOT_GOLD_20K);
    list.add(RECIPE_FORGE_INGOT_GOLD_22K);
    list.add(RECIPE_FORGE_INGOT_GOLD_24K);
    list.add(RECIPE_FORGE_INGOT_COBALT_INGOT);
    list.add(RECIPE_FORGE_INGOT_DAMASCUS_STEEL_INGOT);
    list.add(RECIPE_FORGE_INGOT_SILICON);
    list.add(RECIPE_FORGE_INGOT_FERROSILICON);
    list.add(RECIPE_FORGE_INGOT_SULFATE);
    return list;
  }

}
