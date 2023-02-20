package com.github.relativobr.supreme.resource.magical;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.SupremeItems;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeAttribute {

  public static final ItemStack[] RECIPE_ATTRIBUTE_MAGIC = {new SlimefunItemStack(SupremeItems.CETRUS_LUX, 1),
      new SlimefunItemStack(SupremeItems.CETRUS_VENTUS, 1), new SlimefunItemStack(SupremeItems.CETRUS_LUX, 1),
      new SlimefunItemStack(SupremeItems.CETRUS_AQUA, 1), new ItemStack(Material.NETHER_WART, 64),
      new SlimefunItemStack(SupremeItems.CETRUS_AQUA, 1), new SlimefunItemStack(SupremeItems.CORE_OF_LIFE, 1),
      new SlimefunItemStack(SupremeItems.CETRUS_VENTUS, 1), new SlimefunItemStack(SupremeItems.CORE_OF_NATURE, 1)};

  public static final ItemStack[] RECIPE_ATTRIBUTE_BOMB = {new SlimefunItemStack(SupremeItems.CETRUS_IGNIS, 1),
      new SlimefunItemStack(SupremeItems.CORE_OF_BLOCK, 1), new SlimefunItemStack(SupremeItems.CETRUS_IGNIS, 1),
      new SlimefunItemStack(SupremeItems.CORE_OF_BLOCK, 1), new ItemStack(Material.GUNPOWDER, 64),
      new SlimefunItemStack(SupremeItems.CORE_OF_BLOCK, 1), new SlimefunItemStack(SupremeItems.CETRUS_IGNIS, 1),
      new SlimefunItemStack(SupremeItems.CORE_OF_BLOCK, 1), new SlimefunItemStack(SupremeItems.CETRUS_IGNIS, 1)};

  public static final ItemStack[] RECIPE_ATTRIBUTE_FORTUNE = {new ItemStack(Material.DIAMOND_BLOCK, 64),
      new ItemStack(Material.GOLD_BLOCK, 64), new ItemStack(Material.NETHERITE_BLOCK, 64),
      new SlimefunItemStack(SupremeAttribute.getMagic(), 1), new SlimefunItemStack(SupremeItems.CORE_OF_ALLOY, 1),
      new SlimefunItemStack(SupremeAttribute.getMagic(), 1), new ItemStack(Material.OBSIDIAN, 64),
      new ItemStack(Material.REDSTONE_BLOCK, 64), new ItemStack(Material.NETHER_STAR, 64)};

  public static final ItemStack[] RECIPE_ATTRIBUTE_IMPETUS = {new SlimefunItemStack(SupremeAttribute.getMagic(), 1),
      new SlimefunItemStack(SupremeAttribute.getBomb(), 1), new SlimefunItemStack(SupremeItems.CETRUS_AQUA, 1),
      new SlimefunItemStack(SupremeItems.CORE_OF_DEATH, 1), new SlimefunItemStack(SupremeItems.CETRUS_IGNIS, 1),
      new SlimefunItemStack(SupremeItems.CORE_OF_DEATH, 1), new SlimefunItemStack(SupremeItems.CETRUS_VENTUS, 1),
      new SlimefunItemStack(SupremeAttribute.getFortune(), 1), new SlimefunItemStack(SupremeItems.CETRUS_LUMIUM, 1)};

  public static SlimefunItemStack getMagic() {
    final SlimefunItemStack attributeMagic = SupremeItems.ATTRIBUTE_MAGIC;
    attributeMagic.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, getSupremeOptions().isCustomBc() ? 10 : 20);
    attributeMagic.addUnsafeEnchantment(Enchantment.DURABILITY, getSupremeOptions().isCustomBc() ? 10 : 20);
    attributeMagic.addUnsafeEnchantment(Enchantment.MENDING, getSupremeOptions().isCustomBc() ? 2 : 10);
    return attributeMagic;
  }

  public static SlimefunItemStack getBomb() {
    final SlimefunItemStack attributeBomb = SupremeItems.ATTRIBUTE_BOMB;
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, getSupremeOptions().isCustomBc() ? 10 : 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, getSupremeOptions().isCustomBc() ? 10 : 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, getSupremeOptions().isCustomBc() ? 10 : 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.THORNS, getSupremeOptions().isCustomBc() ? 5 : 10);
    return attributeBomb;
  }

  public static SlimefunItemStack getFortune() {
    final SlimefunItemStack attributeFortune = SupremeItems.ATTRIBUTE_FORTUNE;
    attributeFortune.addUnsafeEnchantment(Enchantment.DIG_SPEED, getSupremeOptions().isCustomBc() ? 10 : 20);
    attributeFortune.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, getSupremeOptions().isCustomBc() ? 3 : 10);
    return attributeFortune;
  }

  public static SlimefunItemStack getImpetus() {
    final SlimefunItemStack attributeImpetus = SupremeItems.ATTRIBUTE_IMPETUS;
    attributeImpetus.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, getSupremeOptions().isCustomBc() ? 10 : 20);
    attributeImpetus.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, getSupremeOptions().isCustomBc() ? 5 : 10);
    attributeImpetus.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, getSupremeOptions().isCustomBc() ? 3 : 10);
    return attributeImpetus;
  }
}
