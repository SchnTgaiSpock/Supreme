package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.SupremeItems;

import lombok.experimental.UtilityClass;

import org.bukkit.inventory.ItemStack;

@UtilityClass
public class ArmorThornium {

  public static final ItemStack[] RECIPE_THORNIUM_BOOTS = {null, null, null, SupremeItems.CETRUS_IGNIS, null,
      SupremeItems.CETRUS_IGNIS, SupremeItems.THORNIUM_INGOT, null, SupremeItems.THORNIUM_INGOT};

  public static final ItemStack[] RECIPE_THORNIUM_CHESTPLATE = {SupremeItems.THORNIUM_INGOT, null,
      SupremeItems.THORNIUM_INGOT, SupremeItems.THORNIUM_INGOT, SupremeItems.CETRUS_LUMIUM,
      SupremeItems.THORNIUM_INGOT, SupremeItems.THORNIUM_INGOT, SupremeItems.THORNIUM_INGOT,
      SupremeItems.THORNIUM_INGOT};

  public static final ItemStack[] RECIPE_THORNIUM_HELMET = {SupremeItems.THORNIUM_INGOT, SupremeItems.CETRUS_AQUA,
      SupremeItems.THORNIUM_INGOT, SupremeItems.THORNIUM_INGOT, null, SupremeItems.THORNIUM_INGOT, null,
      null, null};

  public static final ItemStack[] RECIPE_THORNIUM_LEGGINGS = {SupremeItems.CETRUS_VENTUS,
      SupremeItems.THORNIUM_INGOT, SupremeItems.CETRUS_VENTUS, SupremeItems.THORNIUM_INGOT, null,
      SupremeItems.THORNIUM_INGOT, SupremeItems.THORNIUM_INGOT, null, SupremeItems.THORNIUM_INGOT};
}
