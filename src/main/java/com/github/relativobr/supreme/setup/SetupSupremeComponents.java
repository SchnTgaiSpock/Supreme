package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerEnhancedCraft;
import static com.github.relativobr.supreme.util.RegisterItem.registerMagicalFabricator;
import static com.github.relativobr.supreme.util.RegisterItem.registerNullRecipe;
import static com.github.relativobr.supreme.util.RegisterItem.registerSmeltery;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.resource.SupremeComponents;

public class SetupSupremeComponents {

  public static void setup(Supreme sup) {

    registerSmeltery(SupremeItems.ALLOY_ZIRCONIUM, SupremeComponents.RECIPE_ALLOY_ZIRCONIUM);

    registerSmeltery(SupremeItems.ALLOY_TITANIUM, SupremeComponents.RECIPE_ALLOY_TITANIUM);

    registerSmeltery(SupremeItems.ALLOY_IRIDIUM, SupremeComponents.RECIPE_ALLOY_IRIDIUM);

    registerSmeltery(SupremeItems.ALLOY_AURUM, SupremeComponents.RECIPE_ALLOY_AURUM);

    registerSmeltery(SupremeItems.ALLOY_MANGANESE, SupremeComponents.RECIPE_ALLOY_MANGANESE);

    registerSmeltery(SupremeItems.ALLOY_PLATINUM, SupremeComponents.RECIPE_ALLOY_PLATINUM);

    registerSmeltery(SupremeItems.ALLOY_ADAMANTIUM, SupremeComponents.RECIPE_ALLOY_ADAMANTIUM);

    registerEnhancedCraft(SupremeItems.ZIRCONIUM_PLATE, SupremeComponents.RECIPE_ZIRCONIUM_PLATE);

    registerEnhancedCraft(SupremeItems.TITANIUM_PLATE, SupremeComponents.RECIPE_TITANIUM_PLATE);

    registerEnhancedCraft(SupremeItems.IRIDIUM_PLATE, SupremeComponents.RECIPE_IRIDIUM_PLATE);

    registerEnhancedCraft(SupremeItems.AURUM_PLATE, SupremeComponents.RECIPE_AURUM_PLATE);

    registerEnhancedCraft(SupremeItems.MANGANESE_PLATE, SupremeComponents.RECIPE_MANGANESE_PLATE);

    registerEnhancedCraft(SupremeItems.PLATINUM_PLATE, SupremeComponents.RECIPE_PLATINUM_PLATE);

    registerEnhancedCraft(SupremeItems.ADAMANTIUM_PLATE, SupremeComponents.RECIPE_ADAMANTIUM_PLATE);

    registerEnhancedCraft(SupremeItems.SYNTHETIC_AMETHYST, SupremeComponents.RECIPE_SYNTHETIC_AMETHYST);

    registerEnhancedCraft(SupremeItems.SYNTHETIC_RUBY, SupremeComponents.RECIPE_SYNTHETIC_RUBY);

    registerNullRecipe(SupremeItems.THORNIUM_BIT, SupremeComponents.RECIPE_THORNIUM_BIT);

    registerEnhancedCraft(SupremeItems.THORNIUM_DUST, SupremeComponents.RECIPE_THORNIUM_DUST);

    registerEnhancedCraft(SupremeItems.THORNIUM_INGOT, SupremeComponents.RECIPE_THORNIUM_INGOT);

    registerEnhancedCraft(SupremeItems.THORNIUM_BIT_SYNTHETIC, SupremeComponents.RECIPE_THORNIUM_BIT_SYNTHETIC);

    registerEnhancedCraft(SupremeItems.THORNIUM_DUST_SYNTHETIC, SupremeComponents.RECIPE_THORNIUM_DUST_SYNTHETIC);

    registerEnhancedCraft(SupremeItems.THORNIUM_INGOT_SYNTHETIC,
        SupremeComponents.RECIPE_THORNIUM_INGOT_SYNTHETIC);

    registerEnhancedCraft(SupremeItems.THORNIUM_CARBONADO, SupremeComponents.RECIPE_THORNIUM_CARBONADO);

    registerEnhancedCraft(SupremeItems.THORNIUM_ENERGIZED, SupremeComponents.RECIPE_THORNIUM_ENERGIZED);

    registerSmeltery(SupremeItems.THORNERITE, SupremeComponents.RECIPE_THORNERITE);

    registerNullRecipe(SupremeItems.SUPREME_NUGGET, SupremeComponents.RECIPE_SUPREME_NUGGET);

    registerMagicalFabricator(SupremeItems.SUPREME, SupremeComponents.RECIPE_SUPREME);

    registerEnhancedCraft(SupremeItems.INDUCTIVE_MACHINE, SupremeComponents.RECIPE_INDUCTIVE_MACHINE);

    registerEnhancedCraft(SupremeItems.INDUCTOR_MACHINE, SupremeComponents.RECIPE_INDUCTOR_MACHINE);

    registerEnhancedCraft(SupremeItems.RUSTLESS_MACHINE, SupremeComponents.RECIPE_RUSTLESS_MACHINE);

    registerEnhancedCraft(SupremeItems.STAINLESS_MACHINE, SupremeComponents.RECIPE_STAINLESS_MACHINE);

    registerEnhancedCraft(SupremeItems.CARRIAGE_MACHINE, SupremeComponents.RECIPE_CARRIAGE_MACHINE);

    registerEnhancedCraft(SupremeItems.CONVEYANCE_MACHINE, SupremeComponents.RECIPE_CONVEYANCE_MACHINE);

    registerEnhancedCraft(SupremeItems.PETRIFIER_MACHINE, SupremeComponents.RECIPE_PETRIFIER_MACHINE);

    registerEnhancedCraft(SupremeItems.CRYSTALLIZER_MACHINE, SupremeComponents.RECIPE_CRYSTALLIZER_MACHINE);

    registerMagicalFabricator(SupremeItems.BLEND_MACHINE, SupremeComponents.RECIPE_BLEND_MACHINE);

    SetupSupremeCore.setup(sup);

    SetupMagicalComponents.setup(sup);

    SetupTechComponents.setup(sup);
  }

}
