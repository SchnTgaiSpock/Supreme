package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockGearFabricator;
import com.github.relativobr.supreme.util.EnchantsAndEffectsUtil;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemTier;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectiveArmor;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class AbstractArmor extends SlimefunArmorPiece implements ProtectiveArmor, Soulbound, NotPlaceable {

  @ParametersAreNonnullByDefault
  private AbstractArmor(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.ARMOR_CATEGORY, item, MultiBlockGearFabricator.getMachine(), recipe,
            EnchantsAndEffectsUtil.getPotionEffects(item));
  }

  public static void setup(Supreme sup) {

    // add Enchant
    EnchantsAndEffectsUtil.addGearBasicEnchants(SupremeItems.TITANIUM_HELMET, SupremeItems.AURUM_HELMET, SupremeItems.ADAMANTIUM_HELMET,
        SupremeItems.TITANIUM_CHESTPLATE, SupremeItems.AURUM_CHESTPLATE, SupremeItems.ADAMANTIUM_CHESTPLATE,
        SupremeItems.TITANIUM_LEGGINGS, SupremeItems.AURUM_LEGGINGS, SupremeItems.ADAMANTIUM_LEGGINGS,
        SupremeItems.TITANIUM_BOOTS, SupremeItems.AURUM_BOOTS, SupremeItems.ADAMANTIUM_BOOTS);

    // add Enchant
    EnchantsAndEffectsUtil.addGearThorniumEnchants(SupremeItems.THORNIUM_HELMET, SupremeItems.THORNIUM_HELMET_MAGIC,
        SupremeItems.THORNIUM_HELMET_RARE, SupremeItems.THORNIUM_HELMET_EPIC, SupremeItems.THORNIUM_HELMET_LEGENDARY,
        SupremeItems.THORNIUM_HELMET_SUPREME, SupremeItems.THORNIUM_CHESTPLATE,
        SupremeItems.THORNIUM_CHESTPLATE_MAGIC, SupremeItems.THORNIUM_CHESTPLATE_RARE,
        SupremeItems.THORNIUM_CHESTPLATE_EPIC, SupremeItems.THORNIUM_CHESTPLATE_LEGENDARY,
        SupremeItems.THORNIUM_CHESTPLATE_SUPREME, SupremeItems.THORNIUM_LEGGINGS,
        SupremeItems.THORNIUM_LEGGINGS_MAGIC, SupremeItems.THORNIUM_LEGGINGS_RARE,
        SupremeItems.THORNIUM_LEGGINGS_EPIC, SupremeItems.THORNIUM_LEGGINGS_LEGENDARY,
        SupremeItems.THORNIUM_LEGGINGS_SUPREME, SupremeItems.THORNIUM_BOOTS, SupremeItems.THORNIUM_BOOTS_MAGIC,
        SupremeItems.THORNIUM_BOOTS_RARE, SupremeItems.THORNIUM_BOOTS_EPIC, SupremeItems.THORNIUM_BOOTS_LEGENDARY,
        SupremeItems.THORNIUM_BOOTS_SUPREME);

    new AbstractArmor(SupremeItems.TITANIUM_HELMET, ArmorBasic.RECIPE_TITANIUM_HELMET).register(sup);
    new AbstractArmor(SupremeItems.AURUM_HELMET, ArmorBasic.RECIPE_AURUM_HELMET).register(sup);
    new AbstractArmor(SupremeItems.ADAMANTIUM_HELMET, ArmorBasic.RECIPE_ADAMANTIUM_HELMET).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_HELMET, ArmorThornium.RECIPE_THORNIUM_HELMET).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_HELMET_MAGIC, ItemTier.getMagicRecipe(SupremeItems.THORNIUM_HELMET)).register(
        sup);
    new AbstractArmor(SupremeItems.THORNIUM_HELMET_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_HELMET_MAGIC)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_HELMET_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_HELMET_RARE)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_HELMET_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_HELMET_EPIC)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_HELMET_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_HELMET_LEGENDARY)).register(sup);

    new AbstractArmor(SupremeItems.TITANIUM_CHESTPLATE, ArmorBasic.RECIPE_TITANIUM_CHESTPLATE).register(sup);
    new AbstractArmor(SupremeItems.AURUM_CHESTPLATE, ArmorBasic.RECIPE_AURUM_CHESTPLATE).register(sup);
    new AbstractArmor(SupremeItems.ADAMANTIUM_CHESTPLATE, ArmorBasic.RECIPE_ADAMANTIUM_CHESTPLATE).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_CHESTPLATE, ArmorThornium.RECIPE_THORNIUM_CHESTPLATE).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_CHESTPLATE_MAGIC,
        ItemTier.getMagicRecipe(SupremeItems.THORNIUM_CHESTPLATE)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_CHESTPLATE_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_CHESTPLATE_MAGIC)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_CHESTPLATE_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_CHESTPLATE_RARE)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_CHESTPLATE_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_CHESTPLATE_EPIC)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_CHESTPLATE_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_CHESTPLATE_LEGENDARY)).register(sup);

    new AbstractArmor(SupremeItems.TITANIUM_LEGGINGS, ArmorBasic.RECIPE_TITANIUM_LEGGINGS).register(sup);
    new AbstractArmor(SupremeItems.AURUM_LEGGINGS, ArmorBasic.RECIPE_AURUM_LEGGINGS).register(sup);
    new AbstractArmor(SupremeItems.ADAMANTIUM_LEGGINGS, ArmorBasic.RECIPE_ADAMANTIUM_LEGGINGS).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_LEGGINGS, ArmorThornium.RECIPE_THORNIUM_LEGGINGS).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_LEGGINGS_MAGIC,
        ItemTier.getMagicRecipe(SupremeItems.THORNIUM_LEGGINGS)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_LEGGINGS_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_LEGGINGS_MAGIC)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_LEGGINGS_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_LEGGINGS_RARE)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_LEGGINGS_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_LEGGINGS_EPIC)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_LEGGINGS_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_LEGGINGS_LEGENDARY)).register(sup);

    new AbstractArmor(SupremeItems.TITANIUM_BOOTS, ArmorBasic.RECIPE_TITANIUM_BOOTS).register(sup);
    new AbstractArmor(SupremeItems.AURUM_BOOTS, ArmorBasic.RECIPE_AURUM_BOOTS).register(sup);
    new AbstractArmor(SupremeItems.ADAMANTIUM_BOOTS, ArmorBasic.RECIPE_ADAMANTIUM_BOOTS).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_BOOTS, ArmorThornium.RECIPE_THORNIUM_BOOTS).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_BOOTS_MAGIC, ItemTier.getMagicRecipe(SupremeItems.THORNIUM_BOOTS)).register(
        sup);
    new AbstractArmor(SupremeItems.THORNIUM_BOOTS_RARE, ItemTier.getRareRecipe(SupremeItems.THORNIUM_BOOTS_MAGIC)).register(
        sup);
    new AbstractArmor(SupremeItems.THORNIUM_BOOTS_EPIC, ItemTier.getEpicRecipe(SupremeItems.THORNIUM_BOOTS_RARE)).register(
        sup);
    new AbstractArmor(SupremeItems.THORNIUM_BOOTS_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_BOOTS_EPIC)).register(sup);
    new AbstractArmor(SupremeItems.THORNIUM_BOOTS_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_BOOTS_LEGENDARY)).register(sup);
  }

  @Nonnull
  @Override
  public ProtectionType[] getProtectionTypes() {
    return new ProtectionType[]{ProtectionType.BEES, ProtectionType.RADIATION, ProtectionType.FLYING_INTO_WALL};
  }

  @Override
  public boolean isFullSetRequired() {
    return false;
  }

  @Nonnull
  @Override
  public NamespacedKey getArmorSetId() {
    return new NamespacedKey(getAddon().getJavaPlugin(), "supreme_armor");
  }
}
