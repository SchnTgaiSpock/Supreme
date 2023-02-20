package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.SupremeItems;

import lombok.experimental.UtilityClass;

import org.bukkit.inventory.ItemStack;

@UtilityClass
public class WeaponsThornium {

  public static final ItemStack[] RECIPE_THORNIUM_BOW = {null, SupremeItems.THORNIUM_INGOT,
      SupremeItems.RESOURCE_CORE_STRING, SupremeItems.CETRUS_LUMIUM, null, SupremeItems.RESOURCE_CORE_STRING,
      null, SupremeItems.THORNIUM_INGOT, SupremeItems.RESOURCE_CORE_STRING};

  public static final ItemStack[] RECIPE_THORNIUM_SHIELD = {SupremeItems.RESOURCE_CORE_OAK_LOG,
      SupremeItems.THORNIUM_INGOT, SupremeItems.RESOURCE_CORE_OAK_LOG,
      SupremeItems.RESOURCE_CORE_OAK_LOG, SupremeItems.CETRUS_LUX, SupremeItems.RESOURCE_CORE_OAK_LOG, null,
      SupremeItems.RESOURCE_CORE_OAK_LOG, null};

  public static final ItemStack[] RECIPE_THORNIUM_SWORD = {null, SupremeItems.THORNIUM_INGOT, null, null,
      SupremeItems.THORNIUM_INGOT, null, null, SupremeItems.CETRUS_LUMIUM, null};
}
