package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.machine.MediumContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class Foundry extends MediumContainerMachine {

  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE = new ItemStack[]{SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
      SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
      SupremeItems.INDUCTIVE_MACHINE, SupremeItems.SYNTHETIC_RUBY, SupremeItems.INDUCTIVE_MACHINE,
      SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.PROGRAMMABLE_ANDROID_3, SlimefunItems.ELECTRIC_SMELTERY_2};

  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE_II = new ItemStack[]{SupremeItems.BLEND_MACHINE,
      SupremeItems.CETRUS_AQUA, SupremeItems.BLEND_MACHINE, SupremeItems.CETRUS_VENTUS, SupremeItems.FOUNDRY_MACHINE,
      SupremeItems.CETRUS_LUX, SupremeItems.CORE_OF_ALLOY, SupremeItems.CETRUS_IGNIS, SupremeItems.CORE_OF_ALLOY};

  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeAttribute.getFortune(), SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.FOUNDRY_MACHINE_II, SupremeItems.SUPREME, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final AbstractItemRecipe RECIPE_BLISTERING_INGOT_3 = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SupremeItems.RESOURCE_CORE_EMERALD),
          new ItemStack(SupremeItems.RESOURCE_CORE_EMERALD), new ItemStack(SupremeItems.RESOURCE_CORE_EMERALD),
          new ItemStack(SupremeItems.RESOURCE_CORE_GOLD), new ItemStack(SupremeItems.RESOURCE_CORE_GOLD),
          new ItemStack(SupremeItems.RESOURCE_CORE_GOLD), new ItemStack(SupremeItems.RESOURCE_CORE_EMERALD),
          new ItemStack(SupremeItems.RESOURCE_CORE_EMERALD),
          new ItemStack(SupremeItems.RESOURCE_CORE_EMERALD)},
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 64));
  public static final AbstractItemRecipe RECIPE_REDSTONE_ALLOY = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SupremeItems.RESOURCE_CORE_REDSTONE),
          new ItemStack(SupremeItems.RESOURCE_CORE_REDSTONE),
          new ItemStack(SupremeItems.RESOURCE_CORE_REDSTONE), new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND),
          new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND), new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND),
          new ItemStack(SupremeItems.RESOURCE_CORE_REDSTONE),
          new ItemStack(SupremeItems.RESOURCE_CORE_REDSTONE),
          new ItemStack(SupremeItems.RESOURCE_CORE_REDSTONE)},
      new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY, 64));
  public static final AbstractItemRecipe RECIPE_HARDENED_METAL_INGOT = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SupremeItems.RESOURCE_CORE_LAPIS),
          new ItemStack(SupremeItems.RESOURCE_CORE_LAPIS), new ItemStack(SupremeItems.RESOURCE_CORE_LAPIS),
          new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND), new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND),
          new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND), new ItemStack(SupremeItems.RESOURCE_CORE_LAPIS),
          new ItemStack(SupremeItems.RESOURCE_CORE_LAPIS), new ItemStack(SupremeItems.RESOURCE_CORE_LAPIS)},
      new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT, 64));
  public static final AbstractItemRecipe RECIPE_REINFORCED_ALLOY_INGOT = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SupremeItems.RESOURCE_CORE_NETHERITE),
          new ItemStack(SupremeItems.RESOURCE_CORE_NETHERITE),
          new ItemStack(SupremeItems.RESOURCE_CORE_NETHERITE),
          new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND), new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND),
          new ItemStack(SupremeItems.RESOURCE_CORE_DIAMOND),
          new ItemStack(SupremeItems.RESOURCE_CORE_NETHERITE),
          new ItemStack(SupremeItems.RESOURCE_CORE_NETHERITE),
          new ItemStack(SupremeItems.RESOURCE_CORE_NETHERITE)},
      new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 64));
  public static final AbstractItemRecipe RECIPE_ENCHANTED_GOLDEN_APPLE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SupremeItems.RESOURCE_CORE_GOLD),
          new ItemStack(SupremeItems.RESOURCE_CORE_GOLD), new ItemStack(SupremeItems.RESOURCE_CORE_GOLD),
          new ItemStack(SupremeItems.RESOURCE_CORE_APPLE), new ItemStack(SupremeItems.RESOURCE_CORE_APPLE),
          new ItemStack(SupremeItems.RESOURCE_CORE_APPLE), new ItemStack(SupremeItems.RESOURCE_CORE_GOLD),
          new ItemStack(SupremeItems.RESOURCE_CORE_GOLD), new ItemStack(SupremeItems.RESOURCE_CORE_GOLD)},
      new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 64));
  public static final AbstractItemRecipe RECIPE_SOLAR_PANEL = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SupremeItems.RESOURCE_CORE_QUARTZ),
          new ItemStack(SupremeItems.RESOURCE_CORE_QUARTZ), new ItemStack(SupremeItems.RESOURCE_CORE_QUARTZ),
          new ItemStack(SupremeItems.RESOURCE_CORE_STRING), new ItemStack(SupremeItems.RESOURCE_CORE_STRING),
          new ItemStack(SupremeItems.RESOURCE_CORE_STRING), new ItemStack(SupremeItems.RESOURCE_CORE_QUARTZ),
          new ItemStack(SupremeItems.RESOURCE_CORE_QUARTZ), new ItemStack(SupremeItems.RESOURCE_CORE_QUARTZ)},
      new SlimefunItemStack(SlimefunItems.SOLAR_PANEL, 64));
  public static final AbstractItemRecipe RECIPE_OIL_BUCKET = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SupremeItems.RESOURCE_CORE_BLACK),
          new ItemStack(SupremeItems.RESOURCE_CORE_BLACK), new ItemStack(SupremeItems.RESOURCE_CORE_BLACK),
          new ItemStack(SupremeItems.RESOURCE_CORE_IRON), new ItemStack(SupremeItems.RESOURCE_CORE_IRON),
          new ItemStack(SupremeItems.RESOURCE_CORE_IRON), new ItemStack(SupremeItems.RESOURCE_CORE_BLACK),
          new ItemStack(SupremeItems.RESOURCE_CORE_BLACK), new ItemStack(SupremeItems.RESOURCE_CORE_BLACK)},
      new SlimefunItemStack(SlimefunItems.OIL_BUCKET, 64));
  public static final AbstractItemRecipe RECIPE_PLASTIC_SHEET = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SupremeItems.RESOURCE_CORE_STRING),
          new ItemStack(SupremeItems.RESOURCE_CORE_STRING), new ItemStack(SupremeItems.RESOURCE_CORE_STRING),
          new ItemStack(SupremeItems.RESOURCE_CORE_GRAVEL), new ItemStack(SupremeItems.RESOURCE_CORE_GRAVEL),
          new ItemStack(SupremeItems.RESOURCE_CORE_GRAVEL), new ItemStack(SupremeItems.RESOURCE_CORE_STRING),
          new ItemStack(SupremeItems.RESOURCE_CORE_STRING), new ItemStack(SupremeItems.RESOURCE_CORE_STRING)},
      new SlimefunItemStack(SlimefunItems.PLASTIC_SHEET, 64));

  public Foundry(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_BLISTERING_INGOT_3);
    list.add(RECIPE_REDSTONE_ALLOY);
    list.add(RECIPE_HARDENED_METAL_INGOT);
    list.add(RECIPE_REINFORCED_ALLOY_INGOT);
    list.add(RECIPE_ENCHANTED_GOLDEN_APPLE);
    list.add(RECIPE_SOLAR_PANEL);
    list.add(RECIPE_OIL_BUCKET);
    list.add(RECIPE_PLASTIC_SHEET);
    return list;
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    List<ItemStack> displayRecipes = new ArrayList<>();
    machineRecipes
        .stream().filter(Objects::nonNull)
        .forEach(recipe -> {
      ItemStack itemStack1 = new CustomItemStack(Material.WHITE_STAINED_GLASS_PANE, " ");
      ItemStack itemStack2 = new CustomItemStack(Material.WHITE_STAINED_GLASS_PANE, " ");
      if (recipe.getItemInput(0) != null) {
        itemStack1 = recipe.getItemInput(0).clone();
        itemStack1.setAmount(6);
      }
      if (recipe.getItemInput(3) != null) {
        itemStack2 = recipe.getItemInput(3).clone();
        itemStack2.setAmount(3);
      }
      displayRecipes.add(itemStack1);
      displayRecipes.add(recipe.getFirstItemOutput());
      displayRecipes.add(itemStack2);
      displayRecipes.add(recipe.getFirstItemOutput());
      displayRecipes.add(new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "));
      displayRecipes.add(new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "));
    });
    return displayRecipes;
  }

}
