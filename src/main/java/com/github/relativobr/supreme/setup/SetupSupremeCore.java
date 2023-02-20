package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerMagicalFabricator;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.resource.magical.SupremeCore;

public class SetupSupremeCore {

  public static void setup(Supreme sup) {

    registerMagicalFabricator(SupremeItems.CORE_OF_BLOCK, SupremeCore.RECIPE_CORE_OF_BLOCK);

    registerMagicalFabricator(SupremeItems.CORE_OF_DEATH, SupremeCore.RECIPE_CORE_OF_DEATH);

    registerMagicalFabricator(SupremeItems.CORE_OF_LIFE, SupremeCore.RECIPE_CORE_OF_LIFE);

    registerMagicalFabricator(SupremeItems.CORE_OF_COLOR, SupremeCore.RECIPE_CORE_OF_COLOR);

    registerMagicalFabricator(SupremeItems.CORE_OF_NATURE, SupremeCore.RECIPE_CORE_OF_NATURE);

    registerMagicalFabricator(SupremeItems.CORE_OF_ALLOY, SupremeCore.RECIPE_CORE_OF_ALLOY);
  }
}
