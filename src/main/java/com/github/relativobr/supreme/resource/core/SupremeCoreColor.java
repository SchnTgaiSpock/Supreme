package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreColor {

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_RED = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_RED,
      Material.RED_DYE, Material.BROWN_DYE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_YELLOW = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_YELLOW,
      Material.YELLOW_DYE, Material.ORANGE_DYE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_PURPLE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_PURPLE,
      Material.PURPLE_DYE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BLUE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_BLUE,
      Material.BLUE_DYE, Material.LIGHT_BLUE_DYE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BLACK = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_BLACK,
      Material.BLACK_DYE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GREEN = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_GREEN,
      Material.GREEN_DYE, Material.LIME_DYE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_PINK = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_PINK,
      Material.PINK_DYE, Material.MAGENTA_DYE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GRAY = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_GRAY,
      Material.GRAY_DYE, Material.LIGHT_GRAY_DYE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CYAN = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_CYAN,
      Material.CYAN_DYE, Material.WHITE_DYE);
}
