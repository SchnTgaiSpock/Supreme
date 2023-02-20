package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.SupremeItems;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class WeaponsBasic {

    public static final ItemStack[] RECIPE_ADAMANTIUM_SWORD = { null, SupremeItems.ADAMANTIUM_PLATE, null, null,
            SupremeItems.ADAMANTIUM_PLATE, null, null, new ItemStack(Material.STICK), null };

    public static final ItemStack[] RECIPE_AURUM_SWORD = { null, SupremeItems.AURUM_PLATE, null, null,
            SupremeItems.AURUM_PLATE, null, null, new ItemStack(Material.STICK), null };

    public static final ItemStack[] RECIPE_TITANIUM_SWORD = { null, SupremeItems.TITANIUM_PLATE, null, null,
            SupremeItems.TITANIUM_PLATE, null, null, new ItemStack(Material.STICK), null };
}
