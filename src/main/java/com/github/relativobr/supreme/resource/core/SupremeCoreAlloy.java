package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreAlloy {

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_COAL = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_COAL,
      Material.COAL);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_IRON = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_IRON,
      Material.IRON_INGOT);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GOLD = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_GOLD,
      Material.GOLD_INGOT);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_REDSTONE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_REDSTONE,
      Material.REDSTONE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_LAPIS = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_LAPIS,
      Material.LAPIS_LAZULI);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_DIAMOND = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_DIAMOND,
      Material.DIAMOND);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_EMERALD = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_EMERALD,
      Material.EMERALD);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_QUARTZ = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_QUARTZ,
      Material.QUARTZ_BLOCK);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_NETHERITE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_NETHERITE,
      Material.NETHERITE_INGOT);
}
