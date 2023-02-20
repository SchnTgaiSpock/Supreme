package com.github.relativobr.supreme.tools;

import com.github.relativobr.supreme.SupremeItems;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ToolsBasic {

  public static final ItemStack[] RECIPE_ADAMANTIUM_AXE = {SupremeItems.ADAMANTIUM_PLATE,
      SupremeItems.ADAMANTIUM_PLATE, null, SupremeItems.ADAMANTIUM_PLATE, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null};

  public static final ItemStack[] RECIPE_AURUM_AXE = {SupremeItems.AURUM_PLATE, SupremeItems.AURUM_PLATE,
      null, SupremeItems.AURUM_PLATE, new ItemStack(Material.STICK), null, null, new ItemStack(Material.STICK),
      null};

  public static final ItemStack[] RECIPE_TITANIUM_AXE = {SupremeItems.TITANIUM_PLATE,
      SupremeItems.TITANIUM_PLATE, null, SupremeItems.TITANIUM_PLATE, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null};

  public static final ItemStack[] RECIPE_ADAMANTIUM_PICKAXE = {SupremeItems.ADAMANTIUM_PLATE,
      SupremeItems.ADAMANTIUM_PLATE, SupremeItems.ADAMANTIUM_PLATE, null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null};

  public static final ItemStack[] RECIPE_AURUM_PICKAXE = {SupremeItems.AURUM_PLATE, SupremeItems.AURUM_PLATE,
      SupremeItems.AURUM_PLATE, null, new ItemStack(Material.STICK), null, null, new ItemStack(Material.STICK),
      null};

  public static final ItemStack[] RECIPE_TITANIUM_PICKAXE = {SupremeItems.TITANIUM_PLATE,
      SupremeItems.TITANIUM_PLATE, SupremeItems.TITANIUM_PLATE, null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null};

  public static final ItemStack[] RECIPE_ADAMANTIUM_SHOVEL = {null, SupremeItems.ADAMANTIUM_PLATE, null, null,
      new ItemStack(Material.STICK), null, null, new ItemStack(Material.STICK), null};

  public static final ItemStack[] RECIPE_AURUM_SHOVEL = {null, SupremeItems.AURUM_PLATE, null, null,
      new ItemStack(Material.STICK), null, null, new ItemStack(Material.STICK), null};

  public static final ItemStack[] RECIPE_TITANIUM_SHOVEL = {null, SupremeItems.TITANIUM_PLATE, null, null,
      new ItemStack(Material.STICK), null, null, new ItemStack(Material.STICK), null};
}
