package com.github.relativobr.supreme.util;

import com.github.relativobr.supreme.SupremeItems;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemTier {

  public static ItemStack[] getMagicRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{SupremeItems.THORNIUM_BIT_SYNTHETIC, preItem, SupremeItems.THORNIUM_BIT_SYNTHETIC,
        SupremeItems.THORNIUM_BIT_SYNTHETIC, new ItemStack(SupremeItems.CETRUS_IGNIS),
        SupremeItems.THORNIUM_BIT_SYNTHETIC, SupremeItems.THORNIUM_BIT_SYNTHETIC, preItem,
        SupremeItems.THORNIUM_BIT_SYNTHETIC};
  }

  public static ItemStack[] getRareRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{SupremeItems.THORNIUM_DUST_SYNTHETIC, preItem,
        SupremeItems.THORNIUM_DUST_SYNTHETIC, SupremeItems.THORNIUM_DUST_SYNTHETIC,
        new ItemStack(SupremeItems.CETRUS_VENTUS), SupremeItems.THORNIUM_DUST_SYNTHETIC,
        SupremeItems.THORNIUM_DUST_SYNTHETIC, preItem, SupremeItems.THORNIUM_DUST_SYNTHETIC};
  }

  public static ItemStack[] getEpicRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{SupremeItems.THORNIUM_INGOT_SYNTHETIC, preItem,
        SupremeItems.THORNIUM_INGOT_SYNTHETIC, SupremeItems.THORNIUM_INGOT_SYNTHETIC,
        new ItemStack(SupremeItems.CETRUS_LUX), SupremeItems.THORNIUM_INGOT_SYNTHETIC,
        SupremeItems.THORNIUM_INGOT_SYNTHETIC, preItem, SupremeItems.THORNIUM_INGOT_SYNTHETIC};
  }

  public static ItemStack[] getLegendaryRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{SupremeItems.THORNIUM_CARBONADO, preItem, SupremeItems.THORNIUM_CARBONADO,
        SupremeItems.THORNIUM_CARBONADO, new ItemStack(SupremeItems.CETRUS_LUMIUM),
        SupremeItems.THORNIUM_CARBONADO, SupremeItems.THORNIUM_CARBONADO, preItem,
        SupremeItems.THORNIUM_CARBONADO};
  }

  public static ItemStack[] getSupremeRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{SupremeItems.THORNIUM_ENERGIZED, preItem, SupremeItems.THORNIUM_ENERGIZED,
        SupremeItems.THORNIUM_ENERGIZED, SupremeItems.SUPREME, SupremeItems.THORNIUM_ENERGIZED,
        SupremeItems.THORNIUM_ENERGIZED, preItem, SupremeItems.THORNIUM_ENERGIZED};
  }

}
