package com.github.relativobr.supreme.generators;

import com.github.relativobr.supreme.SupremeItems;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeCapacitor {

  public static final int AURUM_CAPACITY = 1000000;
  public static final int TITANIUM_CAPACITY = 4000000;
  public static final int ADAMANTIUM_CAPACITY = 16000000;
  public static final int THORNIUM_CAPACITY = 100000000;
  public static final int SUPREME_CAPACITY = 1600000000; // infinity

  public static final ItemStack[] MACHINE_AURUM_CAPACITOR = new ItemStack[]{SupremeItems.AURUM_PLATE,
      SlimefunItems.ENERGIZED_CAPACITOR, SupremeItems.AURUM_PLATE, SupremeItems.AURUM_PLATE,
      SupremeItems.RESOURCE_CORE_IRON, SupremeItems.AURUM_PLATE, SupremeItems.INDUCTOR_MACHINE,
      SlimefunItems.ENERGIZED_CAPACITOR, SupremeItems.INDUCTOR_MACHINE};

  public static final ItemStack[] MACHINE_TITANIUM_CAPACITOR = new ItemStack[]{SupremeItems.TITANIUM_PLATE,
      SupremeItems.AURUM_CAPACITOR, SupremeItems.TITANIUM_PLATE, SupremeItems.TITANIUM_PLATE,
      SupremeItems.RESOURCE_CORE_REDSTONE, SupremeItems.TITANIUM_PLATE, SupremeItems.STAINLESS_MACHINE,
      SupremeItems.AURUM_CAPACITOR, SupremeItems.STAINLESS_MACHINE};

  public static final ItemStack[] MACHINE_ADAMANTIUM_CAPACITOR = new ItemStack[]{SupremeItems.ADAMANTIUM_PLATE,
      SupremeItems.TITANIUM_CAPACITOR, SupremeItems.ADAMANTIUM_PLATE, SupremeItems.ADAMANTIUM_PLATE,
      SupremeItems.RESOURCE_CORE_EMERALD, SupremeItems.ADAMANTIUM_PLATE, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.TITANIUM_CAPACITOR, SupremeItems.CONVEYANCE_MACHINE};

  public static final ItemStack[] MACHINE_THORNIUM_CAPACITOR = new ItemStack[]{SupremeItems.THORNIUM_ENERGIZED,
      SupremeItems.ADAMANTIUM_CAPACITOR, SupremeItems.THORNIUM_ENERGIZED, SupremeItems.THORNIUM_ENERGIZED,
      SupremeItems.CETRUS_LUMIUM, SupremeItems.THORNIUM_ENERGIZED, SupremeItems.CRYSTALLIZER_MACHINE,
      SupremeItems.ADAMANTIUM_CAPACITOR, SupremeItems.CRYSTALLIZER_MACHINE};

  public static final ItemStack[] MACHINE_SUPREME_CAPACITOR = new ItemStack[]{SupremeItems.SUPREME,
      SupremeItems.THORNIUM_CAPACITOR, SupremeItems.SUPREME, SupremeItems.SUPREME, SupremeItems.CETRUS_LUMIUM,
      SupremeItems.SUPREME, SupremeItems.THORNERITE, SupremeItems.THORNIUM_CAPACITOR, SupremeItems.THORNERITE};
}
