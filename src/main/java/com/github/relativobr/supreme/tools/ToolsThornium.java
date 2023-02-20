package com.github.relativobr.supreme.tools;

import com.github.relativobr.supreme.SupremeItems;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;

import org.bukkit.inventory.ItemStack;

@UtilityClass
public class ToolsThornium {

  public static final ItemStack[] RECIPE_THORNIUM_AXE = {SupremeItems.THORNIUM_INGOT, SupremeItems.CETRUS_VENTUS,
      null, SupremeItems.THORNIUM_INGOT, SlimefunItems.STAFF_ELEMENTAL, null, null, SlimefunItems.STAFF_ELEMENTAL,
      null};

  public static final ItemStack[] RECIPE_THORNIUM_PICKAXE = {SupremeItems.THORNIUM_INGOT,
      SupremeItems.CETRUS_IGNIS, SupremeItems.THORNIUM_INGOT, null, SlimefunItems.STAFF_ELEMENTAL, null, null,
      SlimefunItems.STAFF_ELEMENTAL, null};

  public static final ItemStack[] RECIPE_THORNIUM_SHOVEL = {null, SupremeItems.THORNIUM_INGOT, null, null,
      SupremeItems.CETRUS_AQUA, null, null, SlimefunItems.STAFF_ELEMENTAL, null};
}
