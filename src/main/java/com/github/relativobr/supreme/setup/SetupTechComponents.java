package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;
import static com.github.relativobr.supreme.util.RegisterItem.registerEnhancedCraft;
import static com.github.relativobr.supreme.util.RegisterItem.registerGrindStone;
import static com.github.relativobr.supreme.util.RegisterItem.registerTechMutation;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.machine.tech.TechMutation;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.ZombieTech;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class SetupTechComponents {

  public static void setup(Supreme sup) {

    SupremeOptions supremeOptions = getSupremeOptions();

    if (supremeOptions.isEnableTech()) {

      registerEnhancedCraft(SupremeItems.CENTER_CARD_SIMPLE, SupremeComponents.RECIPE_CENTER_CARD_SIMPLE);
      registerEnhancedCraft(SupremeItems.CENTER_CARD_ADVANCED, SupremeComponents.RECIPE_CENTER_CARD_ADVANCED);
      registerEnhancedCraft(SupremeItems.CENTER_CARD_ULTIMATE, SupremeComponents.RECIPE_CENTER_CARD_ULTIMATE);

      registerGrindStone(SupremeItems.DUST_NETHERITE, SupremeComponents.RECIPE_DUST_NETHERITE, 4);
      registerGrindStone(SupremeItems.DUST_GLOW_INK, SupremeComponents.RECIPE_DUST_GLOW_INK, 4);
      registerGrindStone(SupremeItems.DUST_AMETHYST, SupremeComponents.RECIPE_DUST_AMETHYST, 4);

      registerTechMutation(SupremeItems.GENE_BERSERK);
      registerTechMutation(SupremeItems.GENE_LUCK);
      registerTechMutation(SupremeItems.GENE_INTELLIGENCE);

      registerEnhancedCraft(SupremeItems.EMPTY_MOBTECH, SupremeComponents.RECIPE_EMPTY_MOBTECH);

      TechMutation.addRecipeTechMutation(SupremeItems.DUST_NETHERITE, SlimefunItems.FIRE_RUNE,
          SupremeItems.GENE_BERSERK);
      TechMutation.addRecipeTechMutation(SupremeItems.DUST_GLOW_INK, SlimefunItems.LIGHTNING_RUNE,
          SupremeItems.GENE_LUCK);
      TechMutation.addRecipeTechMutation(SupremeItems.DUST_AMETHYST, SlimefunItems.RAINBOW_RUNE,
          SupremeItems.GENE_INTELLIGENCE);
      TechMutation.addRecipeTechMutation(SlimefunItems.URANIUM, SlimefunItems.URANIUM, SlimefunItems.NEPTUNIUM);
      TechMutation.addRecipeTechMutation(SlimefunItems.NEPTUNIUM, SlimefunItems.NEPTUNIUM, SlimefunItems.PLUTONIUM);
      TechMutation.addRecipeTechMutation(SlimefunItems.PLUTONIUM, SlimefunItems.URANIUM, SlimefunItems.BOOSTED_URANIUM);

      if (supremeOptions.isMobTechEnableBee()) {
        BeeTech.setup(sup);
      }
      if (supremeOptions.isMobTechEnableIronGolem()) {
        IronGolemTech.setup(sup);
      }
      if (supremeOptions.isMobTechEnableZombie()) {
        ZombieTech.setup(sup);
      }

      SetupSimpleCard.setup(sup);
      SetupAdvancedCard.setup(sup);
    }
  }

}
