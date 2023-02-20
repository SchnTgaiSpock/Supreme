package com.github.relativobr.supreme.generators;

import com.github.relativobr.supreme.SupremeItems;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;

import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeGenerator {

  // BASIC TIER
  public static final int BASIC_IGNIS_ENERGY = 2500;
  public static final int BASIC_IGNIS_BUFFER = 5000;
  public static final int BASIC_VENTUS_ENERGY = 2500;
  public static final int BASIC_VENTUS_BUFFER = 5000;
  public static final int BASIC_AQUA_ENERGY = 2500;
  public static final int BASIC_AQUA_BUFFER = 5000;
  public static final int BASIC_LUX_ENERGY = 2500;
  public static final int BASIC_LUX_BUFFER = 5000;
  public static final int BASIC_LUMIUM_ENERGY = 5000;
  public static final int BASIC_LUMIUM_BUFFER = 10000;
  // ADVANCED TIER
  public static final int IGNIS_ENERGY = 25000;
  public static final int IGNIS_BUFFER = 50000;
  public static final int VENTUS_ENERGY = 25000;
  public static final int VENTUS_BUFFER = 50000;
  public static final int AQUA_ENERGY = 25000;
  public static final int AQUA_BUFFER = 50000;
  public static final int LUX_ENERGY = 25000;
  public static final int LUX_BUFFER = 50000;
  public static final int LUMIUM_ENERGY = 75000;
  public static final int LUMIUM_BUFFER = 500000;
  // END_GAME TIER
  public static final int THORNIUM_ENERGY = 1000000; //  (IGNIS + AQUA + VENTUS)
  public static final int THORNIUM_BUFFER = 6000000;
  public static final int SUPREME_ENERGY = 2000000; //  (LUX + LUMIUM + THORNIUM)
  public static final int SUPREME_BUFFER = 12000000;

  public static final ItemStack[] RECIPE_BASIC_IGNIS_GENERATOR = new ItemStack[]{SupremeItems.ALLOY_AURUM,
      SupremeItems.RESOURCE_CORE_REDSTONE, SupremeItems.ALLOY_AURUM, SupremeItems.INDUCTIVE_MACHINE,
      SlimefunItems.COAL_GENERATOR_2, SupremeItems.INDUCTIVE_MACHINE, SupremeItems.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_FIRE, SupremeItems.CARRIAGE_MACHINE};

  public static final ItemStack[] RECIPE_IGNIS_GENERATOR = new ItemStack[]{SupremeItems.AURUM_PLATE,
      SupremeItems.CETRUS_IGNIS, SupremeItems.AURUM_PLATE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.BASIC_IGNIS_GENERATOR, SupremeItems.INDUCTOR_MACHINE, SupremeItems.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_FIRE, SupremeItems.CONVEYANCE_MACHINE};

  public static final ItemStack[] RECIPE_BASIC_VENTUS_GENERATOR = new ItemStack[]{SupremeItems.ALLOY_IRIDIUM,
      SupremeItems.RESOURCE_CORE_LAPIS, SupremeItems.ALLOY_IRIDIUM, SupremeItems.INDUCTIVE_MACHINE,
      SlimefunItems.BIO_REACTOR, SupremeItems.INDUCTIVE_MACHINE, SupremeItems.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_WIND, SupremeItems.CARRIAGE_MACHINE};

  public static final ItemStack[] RECIPE_VENTUS_GENERATOR = new ItemStack[]{SupremeItems.IRIDIUM_PLATE,
      SupremeItems.CETRUS_VENTUS, SupremeItems.IRIDIUM_PLATE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.BASIC_VENTUS_GENERATOR, SupremeItems.INDUCTOR_MACHINE, SupremeItems.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_WIND, SupremeItems.CONVEYANCE_MACHINE};

  public static final ItemStack[] RECIPE_BASIC_AQUA_GENERATOR = new ItemStack[]{SupremeItems.ALLOY_MANGANESE,
      SupremeItems.RESOURCE_CORE_DIAMOND, SupremeItems.ALLOY_MANGANESE, SupremeItems.INDUCTIVE_MACHINE,
      SlimefunItems.MAGNESIUM_GENERATOR, SupremeItems.INDUCTIVE_MACHINE, SupremeItems.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_WATER, SupremeItems.CARRIAGE_MACHINE};

  public static final ItemStack[] RECIPE_AQUA_GENERATOR = new ItemStack[]{SupremeItems.MANGANESE_PLATE,
      SupremeItems.CETRUS_AQUA, SupremeItems.MANGANESE_PLATE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.BASIC_AQUA_GENERATOR, SupremeItems.INDUCTOR_MACHINE, SupremeItems.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_WATER, SupremeItems.CONVEYANCE_MACHINE};

  public static final ItemStack[] RECIPE_BASIC_LUX_GENERATOR = new ItemStack[]{SupremeItems.ALLOY_TITANIUM,
      SupremeItems.RESOURCE_CORE_QUARTZ, SupremeItems.TITANIUM_PLATE, SupremeItems.INDUCTIVE_MACHINE,
      SlimefunItems.SOLAR_GENERATOR_4, SupremeItems.INDUCTIVE_MACHINE, SupremeItems.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_STORM, SupremeItems.CARRIAGE_MACHINE};

  public static final ItemStack[] RECIPE_LUX_GENERATOR = new ItemStack[]{SupremeItems.TITANIUM_PLATE,
      SupremeItems.CETRUS_LUX, SupremeItems.TITANIUM_PLATE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.BASIC_LUX_GENERATOR, SupremeItems.INDUCTOR_MACHINE, SupremeItems.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_STORM, SupremeItems.CONVEYANCE_MACHINE};

  public static final ItemStack[] RECIPE_BASIC_LUMIUM_GENERATOR = new ItemStack[]{SupremeItems.ALLOY_ADAMANTIUM,
      SupremeItems.RESOURCE_CORE_NETHERITE, SupremeItems.ALLOY_ADAMANTIUM, SupremeItems.INDUCTIVE_MACHINE,
      SlimefunItems.LAVA_GENERATOR_2, SupremeItems.INDUCTIVE_MACHINE, SupremeItems.PETRIFIER_MACHINE,
      SlimefunItems.GEO_MINER, SupremeItems.PETRIFIER_MACHINE};

  public static final ItemStack[] RECIPE_LUMIUM_GENERATOR = new ItemStack[]{SupremeItems.ADAMANTIUM_PLATE,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.ADAMANTIUM_PLATE, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.BASIC_LUMIUM_GENERATOR, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.CRYSTALLIZER_MACHINE, SlimefunItems.GEO_MINER, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final ItemStack[] RECIPE_THORNIUM_GENERATOR = new ItemStack[]{SupremeItems.THORNIUM_ENERGIZED,
      SupremeItems.IGNIS_GENERATOR, SupremeItems.THORNIUM_ENERGIZED, SupremeItems.THORNIUM_ENERGIZED,
      SupremeItems.AQUA_GENERATOR, SupremeItems.THORNIUM_ENERGIZED, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.VENTUS_GENERATOR, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final ItemStack[] RECIPE_SUPREME_GENERATOR = new ItemStack[]{SupremeItems.SUPREME,
      SupremeItems.LUX_GENERATOR, SupremeItems.SUPREME, SupremeItems.SUPREME,
      SupremeItems.LUMIUM_GENERATOR, SupremeItems.SUPREME, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.THORNIUM_GENERATOR, SupremeItems.CRYSTALLIZER_MACHINE};

}
