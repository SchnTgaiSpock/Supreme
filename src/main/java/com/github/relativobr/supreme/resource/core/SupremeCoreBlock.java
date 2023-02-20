package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreBlock {

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_STONE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_STONE,
      Material.COBBLESTONE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GRANITE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_GRANITE,
      Material.GRANITE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_DIORITE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_DIORITE,
      Material.DIORITE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_ANDESITE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_ANDESITE,
      Material.ANDESITE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GRAVEL = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_GRAVEL,
      Material.GRAVEL);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SAND = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_SAND,
      Material.SAND);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_ENDSTONE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_ENDSTONE,
      Material.END_STONE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CLAY = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_CLAY,
      Material.CLAY);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SNOW = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_SNOW,
      Material.SNOW_BLOCK);
}
