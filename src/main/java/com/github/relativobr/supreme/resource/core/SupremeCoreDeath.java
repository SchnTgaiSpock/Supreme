package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreDeath {

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_PORKCHOP = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_PORKCHOP,
      Material.PORKCHOP, Material.BLAZE_ROD);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BEEF = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_BEEF,
      Material.BEEF, Material.BLAZE_ROD);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_MUTTON = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_MUTTON,
      Material.MUTTON, Material.BLAZE_ROD);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CHICKEN = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_CHICKEN,
      Material.CHICKEN, Material.BLAZE_ROD);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SALMON = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_SALMON,
      Material.SALMON, Material.NETHER_STAR);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_COD = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_COD, Material.COD,
      Material.NETHER_STAR);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_STRING = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_STRING,
      Material.STRING, Material.ROTTEN_FLESH);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SPIDER_EYE = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_SPIDER_EYE,
      Material.SPIDER_EYE, Material.BONE);

  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_TEAR = new CustomCoreRecipe(SupremeItems.RESOURCE_CORE_TEAR,
      Material.GHAST_TEAR, Material.SLIME_BALL);
}
