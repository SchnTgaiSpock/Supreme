package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.machine.tech.TechGenerator;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SetupAdvancedCard {

  public static void setup(Supreme plugin) {

    TechGenerator.preSetup(plugin, SupremeItems.CARD_SOLDER_INGOT, SlimefunItems.SOLDER_INGOT,
        SlimefunItems.SOLDER_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_BILLON_INGOT, SlimefunItems.BILLON_INGOT,
        SlimefunItems.BILLON_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_BRONZE_INGOT, SlimefunItems.BRONZE_INGOT,
        SlimefunItems.BRONZE_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_BRASS_INGOT, SlimefunItems.BRASS_INGOT, SlimefunItems.BRASS_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_SULFATE, SlimefunItems.SULFATE, SlimefunItems.SULFATE);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_CARBON, SlimefunItems.CARBON, SlimefunItems.CARBON);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_SILICON, SlimefunItems.SILICON, SlimefunItems.SILICON);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_STEEL, SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_NICKEL, SlimefunItems.NICKEL_INGOT, SlimefunItems.NICKEL_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT,
        SlimefunItems.DURALUMIN_INGOT);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_FERROSILICON, SlimefunItems.FERROSILICON,
        SlimefunItems.FERROSILICON);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_DAMASCUS, SlimefunItems.DAMASCUS_STEEL_INGOT,
        SlimefunItems.DAMASCUS_STEEL_INGOT);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_COBALT, SlimefunItems.COBALT_INGOT, SlimefunItems.COBALT_INGOT);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT,
        SlimefunItems.ALUMINUM_BRONZE_INGOT);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT,
        SlimefunItems.ALUMINUM_BRASS_INGOT);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_CORINTHIAN_BRONZE_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT,
        SlimefunItems.CORINTHIAN_BRONZE_INGOT);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_GOLD24K, SlimefunItems.GOLD_24K, SlimefunItems.GOLD_24K);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_CARBON_PRESS, SlimefunItems.COMPRESSED_CARBON,
        SlimefunItems.COMPRESSED_CARBON);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_SAPPHIRE,
        SlimefunItems.SYNTHETIC_SAPPHIRE);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD,
        SlimefunItems.SYNTHETIC_EMERALD);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_BATTERY, SlimefunItems.BATTERY, SlimefunItems.BATTERY);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_MAGNET, SlimefunItems.MAGNET, SlimefunItems.MAGNET);

    TechGenerator.preSetup(plugin, 2, SupremeItems.CARD_PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET,
        SlimefunItems.PLASTIC_SHEET);

    TechGenerator.preSetup(plugin, 3, SupremeItems.CARD_HARDENED_METAL_INGOT, SlimefunItems.HARDENED_METAL_INGOT,
        SupremeItems.TITANIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT);

    TechGenerator.preSetup(plugin, 3, SupremeItems.CARD_REDSTONE_ALLOY, SlimefunItems.REDSTONE_ALLOY,
        SupremeItems.TITANIUM_PLATE, SlimefunItems.REDSTONE_ALLOY);

    TechGenerator.preSetup(plugin, 3, SupremeItems.CARD_ELECTRO_MAGNET, SlimefunItems.ELECTRO_MAGNET,
        SupremeItems.IRIDIUM_PLATE, SlimefunItems.ELECTRO_MAGNET);

    TechGenerator.preSetup(plugin, 3, SupremeItems.CARD_ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_MOTOR,
        SupremeItems.AURUM_PLATE, SlimefunItems.ELECTRIC_MOTOR);

    TechGenerator.preSetup(plugin, 3, SupremeItems.CARD_HEATING_COIL, SlimefunItems.HEATING_COIL,
        SupremeItems.AURUM_PLATE, SlimefunItems.HEATING_COIL);

    TechGenerator.preSetup(plugin, 3, SupremeItems.CARD_SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_DIAMOND,
        SupremeItems.ADAMANTIUM_PLATE, SlimefunItems.SYNTHETIC_DIAMOND);

    TechGenerator.preSetup(plugin, 3, SupremeItems.CARD_CARBONADO, SlimefunItems.CARBONADO,
        SupremeItems.ADAMANTIUM_PLATE, SlimefunItems.CARBONADO);

    TechGenerator.preSetup(plugin, 3, SupremeItems.CARD_REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,
        SupremeItems.ADAMANTIUM_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT);

  }
}
