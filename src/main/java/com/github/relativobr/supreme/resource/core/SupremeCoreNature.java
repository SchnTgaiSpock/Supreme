package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreNature {

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_OAK_LOG = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_OAK_LOG,
      Material.OAK_LOG, Material.OAK_LEAVES);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SPRUCE_LOG = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_SPRUCE_LOG,
      Material.SPRUCE_LOG, Material.SPRUCE_LEAVES);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BIRCH_LOG = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_BIRCH_LOG,
      Material.BIRCH_LOG, Material.BIRCH_LEAVES);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_JUNGLE_LOG = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_JUNGLE_LOG,
      Material.JUNGLE_LOG, Material.JUNGLE_LEAVES);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_ACACIA_LOG = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_ACACIA_LOG,
      Material.ACACIA_LOG, Material.ACACIA_LEAVES);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_DARK_OAK_LOG = new CustomCoreRecipe(
      SupremeItems.RESOURCE_CORE_DARK_OAK_LOG, Material.DARK_OAK_LOG, Material.DARK_OAK_LEAVES);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CRIMSON_STEM = new CustomCoreRecipe(
      SupremeItems.RESOURCE_CORE_CRIMSON_STEM, Material.CRIMSON_STEM);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_WARPED_STEM = new CustomCoreRecipe(
      SupremeItems.RESOURCE_CORE_WARPED_STEM, Material.WARPED_STEM);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_WITHER_ROSE = new CustomCoreRecipe(
      SupremeItems.RESOURCE_CORE_WITHER_ROSE, Material.WITHER_ROSE);
}
