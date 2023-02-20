package com.github.relativobr.supreme.resource.magical;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.github.relativobr.supreme.SupremeItems;

@UtilityClass
public class SupremeCetrus {

  public static final ItemStack[] RECIPE_CETRUS_LUX = {new ItemStack(Material.FLINT, 64),
      new ItemStack(Material.GLOWSTONE, 64), new ItemStack(Material.TORCH, 64), new ItemStack(Material.CAMPFIRE, 64),
      new SlimefunItemStack(SupremeItems.CORE_OF_LIFE, 1), new ItemStack(Material.SEA_LANTERN, 64),
      new ItemStack(Material.REDSTONE_LAMP, 64), new ItemStack(Material.SOUL_CAMPFIRE, 64),
      new ItemStack(Material.SHROOMLIGHT, 64)};

  public static final ItemStack[] RECIPE_CETRUS_VENTUS = {new ItemStack(Material.FEATHER, 64),
      new ItemStack(Material.LEATHER, 64), new ItemStack(Material.CHORUS_FRUIT, 64),
      new ItemStack(Material.COBBLESTONE, 64), new SlimefunItemStack(SupremeItems.CORE_OF_NATURE, 1),
      new ItemStack(Material.SAND, 64), new ItemStack(Material.ARROW, 64), new ItemStack(Material.PHANTOM_MEMBRANE, 64),
      new ItemStack(Material.ENDER_PEARL, 16)};

  public static final ItemStack[] RECIPE_CETRUS_LUMIUM = {new ItemStack(Material.DIRT, 64),
      new SlimefunItemStack(SupremeItems.CORE_OF_BLOCK, 1), new ItemStack(Material.GRASS_BLOCK, 64),
      new SlimefunItemStack(SupremeItems.CORE_OF_LIFE, 1), new ItemStack(Material.OBSIDIAN, 64),
      new SlimefunItemStack(SupremeItems.CORE_OF_DEATH, 1), new ItemStack(Material.WITHER_SKELETON_SKULL, 64),
      new SlimefunItemStack(SupremeItems.CORE_OF_ALLOY, 1), new ItemStack(Material.NETHER_STAR, 64)};

  public static final ItemStack[] RECIPE_CETRUS_AQUA = {new ItemStack(Material.ICE, 64),
      new ItemStack(Material.LILY_PAD, 64), new ItemStack(Material.SALMON, 64), new ItemStack(Material.COD, 64),
      new SlimefunItemStack(SupremeItems.CORE_OF_DEATH, 1), new ItemStack(Material.TROPICAL_FISH, 64),
      new ItemStack(Material.PUFFERFISH, 64), new ItemStack(Material.NAUTILUS_SHELL, 64),
      new ItemStack(Material.WATER_BUCKET, 1)};

  public static final ItemStack[] RECIPE_CETRUS_IGNIS = {new ItemStack(Material.NETHERRACK, 64),
      new ItemStack(Material.BLAZE_ROD, 64), new ItemStack(Material.SOUL_SAND, 64),
      new ItemStack(Material.QUARTZ_BLOCK, 64), new SlimefunItemStack(SupremeItems.CORE_OF_BLOCK, 1),
      new ItemStack(Material.MAGMA_CREAM, 64), new ItemStack(Material.GUNPOWDER, 64),
      new ItemStack(Material.OBSIDIAN, 64), new ItemStack(Material.LAVA_BUCKET, 1)};
}
