package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.SupremeItems;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeQuarry {


  public static final ItemStack[] RECIPE_STONE_QUARRY = new ItemStack[]{SupremeItems.ADAMANTIUM_PLATE,
      SupremeItems.INDUCTIVE_MACHINE, SupremeItems.ADAMANTIUM_PLATE, new ItemStack(Material.DIAMOND_PICKAXE),
      SlimefunItems.PROGRAMMABLE_ANDROID_MINER, new ItemStack(Material.DIAMOND_PICKAXE),
      SupremeItems.ADAMANTIUM_PLATE, SlimefunItems.COAL_GENERATOR, SupremeItems.ADAMANTIUM_PLATE};

  public static final ItemStack[] RECIPE_COAL_QUARRY = new ItemStack[]{SupremeItems.CETRUS_IGNIS,
      SupremeItems.ALLOY_PLATINUM, SupremeItems.CETRUS_IGNIS, new ItemStack(Material.DIAMOND_PICKAXE),
      SupremeItems.STONE_QUARRY, new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.COAL_GENERATOR,
      SlimefunItems.GEO_MINER, SlimefunItems.LARGE_CAPACITOR};

  public static final ItemStack[] RECIPE_IRON_QUARRY = new ItemStack[]{SupremeItems.CETRUS_VENTUS,
      SupremeItems.ALLOY_IRIDIUM, SupremeItems.CETRUS_VENTUS, SupremeItems.STAINLESS_MACHINE,
      SupremeItems.COAL_QUARRY, SupremeItems.STAINLESS_MACHINE, SlimefunItems.ELECTRO_MAGNET,
      SlimefunItems.IRON_GOLEM_ASSEMBLER, SlimefunItems.ELECTRO_MAGNET};

  public static final ItemStack[] RECIPE_GOLD_QUARRY = new ItemStack[]{SupremeItems.CETRUS_LUX,
      SupremeItems.ALLOY_AURUM, SupremeItems.CETRUS_LUX, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.IRON_QUARRY, SupremeItems.CONVEYANCE_MACHINE, SlimefunItems.ELECTRO_MAGNET,
      SlimefunItems.ELECTRIC_SMELTERY, SlimefunItems.ELECTRO_MAGNET};

  public static final ItemStack[] RECIPE_DIAMOND_QUARRY = new ItemStack[]{SupremeItems.CETRUS_AQUA,
      SupremeItems.ALLOY_TITANIUM, SupremeItems.CETRUS_AQUA, SupremeItems.INDUCTOR_MACHINE,
      SupremeItems.GOLD_QUARRY, SupremeItems.INDUCTOR_MACHINE, SlimefunItems.ELECTRIC_MOTOR,
      SlimefunItems.HEATED_PRESSURE_CHAMBER, SlimefunItems.ELECTRIC_MOTOR};

  public static final ItemStack[] RECIPE_THORNIUM_QUARRY = new ItemStack[]{SupremeItems.CETRUS_LUMIUM,
      SupremeItems.ALLOY_ADAMANTIUM, SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.DIAMOND_QUARRY, SupremeItems.CRYSTALLIZER_MACHINE, SlimefunItems.ELECTRIC_MOTOR,
      SlimefunItems.WITHER_ASSEMBLER, SlimefunItems.ELECTRIC_MOTOR};

  public static final ItemStack[] RECIPE_SUPREME_NUGGETS_QUARRY = new ItemStack[]{SupremeItems.CETRUS_LUMIUM,
      SupremeItems.THORNERITE, SupremeItems.CETRUS_LUMIUM, SupremeItems.CORE_OF_NATURE,
      SupremeItems.THORNIUM_QUARRY, SupremeItems.CORE_OF_BLOCK, SupremeItems.CORE_OF_LIFE, SlimefunItems.NUCLEAR_REACTOR,
      SupremeItems.CORE_OF_DEATH};

}
