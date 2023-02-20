package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerCoreFabricator;

import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.resource.core.SupremeCoreColor;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreLife;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;

public class SetupResourceCore {

  public static void setup(Supreme sup) {

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_STONE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_STONE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_GRANITE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRANITE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_DIORITE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_DIORITE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_ANDESITE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_GRAVEL,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_SAND,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SAND));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_ENDSTONE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_CLAY,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_CLAY));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_SNOW,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SNOW));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_PORKCHOP,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_BEEF,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_BEEF));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_MUTTON,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_MUTTON));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_CHICKEN,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_SALMON,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SALMON));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_COD,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_COD));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_STRING,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_STRING));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_SPIDER_EYE,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_TEAR,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_TEAR));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_POTATO,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_POTATO));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_APPLE,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_APPLE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_BEETROOT,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_BEETROOT));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_WHEAT,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_WHEAT));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_SUGAR_CANE,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_SWEET_BERRIES,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_MELON,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_MELON));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_CARROT,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_CARROT));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_PUMPKIN,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_RED,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_RED));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_YELLOW,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_YELLOW));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_PURPLE,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PURPLE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_BLUE,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLUE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_BLACK,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLACK));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_GREEN,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GREEN));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_PINK,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PINK));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_GRAY,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GRAY));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_CYAN,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_CYAN));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_OAK_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_SPRUCE_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_BIRCH_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_JUNGLE_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_ACACIA_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_DARK_OAK_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_CRIMSON_STEM,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_WARPED_STEM,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_WITHER_ROSE,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_COAL,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_COAL));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_IRON,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_IRON));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_GOLD,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_GOLD));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_REDSTONE,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_LAPIS,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_DIAMOND,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_EMERALD,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_QUARTZ,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));

    registerCoreFabricator(SupremeItems.RESOURCE_CORE_NETHERITE,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));

  }

}
