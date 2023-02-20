package com.github.relativobr.supreme.resource;

import com.github.relativobr.supreme.SupremeItems;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeComponents {

  public static final ItemStack[] RECIPE_SUPREME_NUGGET = {null, null, null, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_SUPREME = {SupremeItems.SUPREME_NUGGET, SupremeItems.SUPREME_NUGGET,
      SupremeItems.SUPREME_NUGGET, SupremeItems.SUPREME_NUGGET, SupremeItems.SUPREME_NUGGET,
      SupremeItems.SUPREME_NUGGET, SupremeItems.SUPREME_NUGGET, SupremeItems.SUPREME_NUGGET,
      SupremeItems.SUPREME_NUGGET};

  public static final ItemStack[] RECIPE_THORNIUM_BIT = {null, null, null, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_THORNIUM_DUST = {SupremeItems.THORNIUM_BIT,
      SupremeItems.THORNIUM_BIT, SupremeItems.THORNIUM_BIT, SupremeItems.THORNIUM_BIT,
      SupremeItems.THORNIUM_BIT, SupremeItems.THORNIUM_BIT, SupremeItems.THORNIUM_BIT,
      SupremeItems.THORNIUM_BIT, SupremeItems.THORNIUM_BIT};

  public static final ItemStack[] RECIPE_THORNIUM_INGOT = {SupremeItems.THORNIUM_DUST,
      SupremeItems.THORNIUM_DUST, SupremeItems.THORNIUM_DUST, SupremeItems.THORNIUM_DUST,
      SupremeItems.THORNIUM_DUST, SupremeItems.THORNIUM_DUST, SupremeItems.THORNIUM_DUST,
      SupremeItems.THORNIUM_DUST, SupremeItems.THORNIUM_DUST};

  public static final ItemStack[] RECIPE_THORNIUM_BIT_SYNTHETIC = {SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.DAMASCUS_STEEL_INGOT,
      SupremeItems.THORNIUM_BIT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE};

  public static final ItemStack[] RECIPE_THORNIUM_DUST_SYNTHETIC = {SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeItems.THORNIUM_DUST, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD};

  public static final ItemStack[] RECIPE_THORNIUM_INGOT_SYNTHETIC = {SlimefunItems.SYNTHETIC_DIAMOND,
      SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.STEEL_PLATE,
      SupremeItems.THORNIUM_INGOT, SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND,
      SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND};

  public static final ItemStack[] RECIPE_THORNIUM_CARBONADO = {SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE,
      SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE, SupremeItems.THORNIUM_INGOT,
      SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARBONADO};

  public static final ItemStack[] RECIPE_THORNIUM_ENERGIZED = {SlimefunItems.BLISTERING_INGOT_3,
      SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.REDSTONE_ALLOY,
      SupremeItems.THORNIUM_CARBONADO, SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3,
      SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3};

  public static final ItemStack[] RECIPE_ALLOY_ZIRCONIUM = {SlimefunItems.ZINC_DUST, SlimefunItems.SOLDER_INGOT,
      SlimefunItems.ZINC_INGOT, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_ZIRCONIUM_PLATE = {SupremeItems.ALLOY_ZIRCONIUM,
      SupremeItems.ALLOY_ZIRCONIUM, SupremeItems.ALLOY_ZIRCONIUM, SupremeItems.RESOURCE_CORE_DIORITE,
      SupremeItems.RESOURCE_CORE_DIORITE, SupremeItems.RESOURCE_CORE_DIORITE, SupremeItems.ALLOY_ZIRCONIUM,
      SupremeItems.ALLOY_ZIRCONIUM, SupremeItems.ALLOY_ZIRCONIUM};

  public static final ItemStack[] RECIPE_ALLOY_TITANIUM = {SlimefunItems.TIN_DUST, SlimefunItems.DAMASCUS_STEEL_INGOT,
      SlimefunItems.TIN_INGOT, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_TITANIUM_PLATE = {SupremeItems.ALLOY_TITANIUM,
      SupremeItems.ALLOY_TITANIUM, SupremeItems.ALLOY_TITANIUM, SupremeItems.RESOURCE_CORE_ANDESITE,
      SupremeItems.RESOURCE_CORE_ANDESITE, SupremeItems.RESOURCE_CORE_ANDESITE,
      SupremeItems.ALLOY_TITANIUM, SupremeItems.ALLOY_TITANIUM, SupremeItems.ALLOY_TITANIUM};

  public static final ItemStack[] RECIPE_ALLOY_IRIDIUM = {SlimefunItems.SILVER_DUST, SlimefunItems.BILLON_INGOT,
      SlimefunItems.SILVER_INGOT, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_IRIDIUM_PLATE = {SupremeItems.ALLOY_IRIDIUM,
      SupremeItems.ALLOY_IRIDIUM, SupremeItems.ALLOY_IRIDIUM, SupremeItems.RESOURCE_CORE_GRAVEL,
      SupremeItems.RESOURCE_CORE_GRAVEL, SupremeItems.RESOURCE_CORE_GRAVEL, SupremeItems.ALLOY_IRIDIUM,
      SupremeItems.ALLOY_IRIDIUM, SupremeItems.ALLOY_IRIDIUM};

  public static final ItemStack[] RECIPE_ALLOY_AURUM = {SlimefunItems.GOLD_DUST, SlimefunItems.COBALT_INGOT,
      SlimefunItems.GOLD_24K, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_AURUM_PLATE = {SupremeItems.ALLOY_AURUM, SupremeItems.ALLOY_AURUM,
      SupremeItems.ALLOY_AURUM, SupremeItems.RESOURCE_CORE_SAND, SupremeItems.RESOURCE_CORE_SAND,
      SupremeItems.RESOURCE_CORE_SAND, SupremeItems.ALLOY_AURUM, SupremeItems.ALLOY_AURUM,
      SupremeItems.ALLOY_AURUM};

  public static final ItemStack[] RECIPE_ALLOY_MANGANESE = {SlimefunItems.MAGNESIUM_DUST, SlimefunItems.DURALUMIN_INGOT,
      SlimefunItems.MAGNESIUM_INGOT, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_MANGANESE_PLATE = {SupremeItems.ALLOY_MANGANESE,
      SupremeItems.ALLOY_MANGANESE, SupremeItems.ALLOY_MANGANESE, SupremeItems.RESOURCE_CORE_GRANITE,
      SupremeItems.RESOURCE_CORE_GRANITE, SupremeItems.RESOURCE_CORE_GRANITE, SupremeItems.ALLOY_MANGANESE,
      SupremeItems.ALLOY_MANGANESE, SupremeItems.ALLOY_MANGANESE};

  public static final ItemStack[] RECIPE_ALLOY_PLATINUM = {SlimefunItems.LEAD_DUST, SlimefunItems.BRASS_INGOT,
      SlimefunItems.LEAD_INGOT, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_PLATINUM_PLATE = {SupremeItems.ALLOY_PLATINUM,
      SupremeItems.ALLOY_PLATINUM, SupremeItems.ALLOY_PLATINUM, SupremeItems.RESOURCE_CORE_CLAY,
      SupremeItems.RESOURCE_CORE_CLAY, SupremeItems.RESOURCE_CORE_CLAY, SupremeItems.ALLOY_PLATINUM,
      SupremeItems.ALLOY_PLATINUM, SupremeItems.ALLOY_PLATINUM};

  public static final ItemStack[] RECIPE_ALLOY_ADAMANTIUM = {SlimefunItems.ALUMINUM_DUST,
      SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ALUMINUM_INGOT, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_ADAMANTIUM_PLATE = {SupremeItems.ALLOY_ADAMANTIUM,
      SupremeItems.ALLOY_ADAMANTIUM, SupremeItems.ALLOY_ADAMANTIUM, SupremeItems.RESOURCE_CORE_STONE,
      SupremeItems.RESOURCE_CORE_STONE, SupremeItems.RESOURCE_CORE_STONE, SupremeItems.ALLOY_ADAMANTIUM,
      SupremeItems.ALLOY_ADAMANTIUM, SupremeItems.ALLOY_ADAMANTIUM};

  public static final ItemStack[] RECIPE_SYNTHETIC_AMETHYST = {SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.MAGIC_LUMP_3,
      new ItemStack(Material.AMETHYST_SHARD), SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE};

  public static final ItemStack[] RECIPE_SYNTHETIC_RUBY = {SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND,
      SupremeItems.SYNTHETIC_AMETHYST, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD};

  public static final ItemStack[] RECIPE_THORNERITE = {SupremeItems.THORNIUM_INGOT,
      SupremeItems.ALLOY_ADAMANTIUM, SupremeItems.ALLOY_IRIDIUM, SupremeItems.ALLOY_PLATINUM,
      SupremeItems.ALLOY_TITANIUM, SupremeItems.ALLOY_ZIRCONIUM, null, null, null};

  public static final ItemStack[] RECIPE_INDUCTIVE_MACHINE = {SlimefunItems.REDSTONE_ALLOY,
      SupremeItems.ALLOY_PLATINUM, SlimefunItems.REDSTONE_ALLOY, SupremeItems.ALLOY_IRIDIUM,
      SlimefunItems.ELECTRO_MAGNET, SupremeItems.ALLOY_IRIDIUM, SlimefunItems.REDSTONE_ALLOY,
      SupremeItems.ALLOY_PLATINUM, SlimefunItems.REDSTONE_ALLOY};

  public static final ItemStack[] RECIPE_INDUCTOR_MACHINE = {SlimefunItems.REDSTONE_ALLOY,
      SupremeItems.PLATINUM_PLATE, SlimefunItems.REDSTONE_ALLOY, SupremeItems.IRIDIUM_PLATE,
      SupremeItems.INDUCTIVE_MACHINE, SupremeItems.IRIDIUM_PLATE, SlimefunItems.REDSTONE_ALLOY,
      SupremeItems.PLATINUM_PLATE, SlimefunItems.REDSTONE_ALLOY};

  public static final ItemStack[] RECIPE_RUSTLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT,
      SupremeItems.ALLOY_ZIRCONIUM, SlimefunItems.HARDENED_METAL_INGOT, SupremeItems.ALLOY_MANGANESE,
      SlimefunItems.ELECTRO_MAGNET, SupremeItems.ALLOY_MANGANESE, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeItems.ALLOY_ZIRCONIUM, SlimefunItems.HARDENED_METAL_INGOT};

  public static final ItemStack[] RECIPE_STAINLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT,
      SupremeItems.ZIRCONIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT, SupremeItems.MANGANESE_PLATE,
      SupremeItems.RUSTLESS_MACHINE, SupremeItems.MANGANESE_PLATE, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeItems.ZIRCONIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT};

  public static final ItemStack[] RECIPE_CARRIAGE_MACHINE = {SlimefunItems.GILDED_IRON, SupremeItems.ALLOY_AURUM,
      SlimefunItems.GILDED_IRON, SupremeItems.ALLOY_TITANIUM, SlimefunItems.ELECTRO_MAGNET,
      SupremeItems.ALLOY_TITANIUM, SlimefunItems.GILDED_IRON, SupremeItems.ALLOY_AURUM,
      SlimefunItems.GILDED_IRON};

  public static final ItemStack[] RECIPE_CONVEYANCE_MACHINE = {SlimefunItems.GILDED_IRON, SupremeItems.AURUM_PLATE,
      SlimefunItems.GILDED_IRON, SupremeItems.TITANIUM_PLATE, SupremeItems.CARRIAGE_MACHINE,
      SupremeItems.TITANIUM_PLATE, SlimefunItems.GILDED_IRON, SupremeItems.AURUM_PLATE,
      SlimefunItems.GILDED_IRON};

  public static final ItemStack[] RECIPE_PETRIFIER_MACHINE = {SupremeItems.RESOURCE_CORE_COAL,
      SupremeItems.RUSTLESS_MACHINE, SupremeItems.RESOURCE_CORE_COAL, SupremeItems.ALLOY_ADAMANTIUM,
      SupremeItems.CARRIAGE_MACHINE, SupremeItems.ALLOY_ADAMANTIUM, SupremeItems.RESOURCE_CORE_STONE,
      SupremeItems.INDUCTIVE_MACHINE, SupremeItems.RESOURCE_CORE_STONE};

  public static final ItemStack[] RECIPE_CRYSTALLIZER_MACHINE = {SupremeItems.RESOURCE_CORE_DIAMOND,
      new ItemStack(SupremeItems.STAINLESS_MACHINE), SupremeItems.RESOURCE_CORE_DIAMOND, SupremeItems.SYNTHETIC_RUBY,
      SupremeItems.PETRIFIER_MACHINE, SupremeItems.SYNTHETIC_RUBY, SupremeItems.RESOURCE_CORE_EMERALD,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.RESOURCE_CORE_EMERALD};

  public static final ItemStack[] RECIPE_BLEND_MACHINE = {SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.RESOURCE_CORE_DIAMOND, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.CRYSTALLIZER_MACHINE, SupremeItems.RESOURCE_CORE_EMERALD,
      SupremeItems.CRYSTALLIZER_MACHINE, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.RESOURCE_CORE_NETHERITE, SupremeItems.CONVEYANCE_MACHINE};

  public static final ItemStack[] RECIPE_CENTER_CARD_SIMPLE = new ItemStack[]{SlimefunItems.BASIC_CIRCUIT_BOARD,
      SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
      SupremeItems.SYNTHETIC_AMETHYST, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD,
      SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD};

  public static final ItemStack[] RECIPE_CENTER_CARD_ADVANCED = new ItemStack[]{SlimefunItems.ADVANCED_CIRCUIT_BOARD,
      SupremeItems.CENTER_CARD_SIMPLE, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SupremeItems.CENTER_CARD_SIMPLE,
      SupremeItems.SYNTHETIC_RUBY, SupremeItems.CENTER_CARD_SIMPLE, SlimefunItems.HEATING_COIL,
      SupremeItems.CENTER_CARD_SIMPLE, SlimefunItems.HEATING_COIL};

  public static final ItemStack[] RECIPE_CENTER_CARD_ULTIMATE = new ItemStack[]{SupremeItems.SYNTHETIC_RUBY,
      SupremeItems.CENTER_CARD_ADVANCED, SupremeItems.SYNTHETIC_RUBY, SupremeItems.CENTER_CARD_ADVANCED,
      SupremeItems.PETRIFIER_MACHINE, SupremeItems.CENTER_CARD_ADVANCED, SlimefunItems.REINFORCED_PLATE,
      SupremeItems.CENTER_CARD_ADVANCED, SlimefunItems.REINFORCED_PLATE};

  public static final ItemStack[] RECIPE_DUST_NETHERITE = new ItemStack[]{new ItemStack(Material.NETHERITE_INGOT), null,
      null, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_DUST_GLOW_INK = new ItemStack[]{new ItemStack(Material.GLOW_INK_SAC), null,
      null, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_DUST_AMETHYST = new ItemStack[]{new ItemStack(Material.AMETHYST_SHARD), null,
      null, null, null, null, null, null, null};

  public static final ItemStack[] RECIPE_EMPTY_MOBTECH = new ItemStack[]{SlimefunItems.MAGIC_LUMP_2,
      SlimefunItems.STONE_CHUNK, SlimefunItems.ENDER_LUMP_2, null, null, null, null, null, null};

}
