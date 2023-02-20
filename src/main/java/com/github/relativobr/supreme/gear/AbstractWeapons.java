package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockGearFabricator;
import com.github.relativobr.supreme.util.EnchantsAndEffectsUtil;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.inventory.ItemStack;

public class AbstractWeapons extends SlimefunItem implements Soulbound, NotPlaceable {

  @ParametersAreNonnullByDefault
  public AbstractWeapons(@Nonnull SlimefunItemStack stack, ItemStack[] recipe) {
    super(ItemGroups.WEAPONS_CATEGORY, stack, MultiBlockGearFabricator.getMachine(), recipe);
  }

  public static void setup(Supreme sup) {

    // add Enchant
    EnchantsAndEffectsUtil.addGearBasicEnchants(SupremeItems.TITANIUM_SWORD, SupremeItems.AURUM_SWORD, SupremeItems.ADAMANTIUM_SWORD);

    // add Enchant
    EnchantsAndEffectsUtil.addGearThorniumEnchants(SupremeItems.THORNIUM_BOW, SupremeItems.THORNIUM_BOW_MAGIC,
        SupremeItems.THORNIUM_BOW_RARE, SupremeItems.THORNIUM_BOW_EPIC, SupremeItems.THORNIUM_BOW_LEGENDARY,
        SupremeItems.THORNIUM_BOW_SUPREME, SupremeItems.THORNIUM_SWORD, SupremeItems.THORNIUM_SWORD_MAGIC,
        SupremeItems.THORNIUM_SWORD_RARE, SupremeItems.THORNIUM_SWORD_EPIC,
        SupremeItems.THORNIUM_SWORD_LEGENDARY, SupremeItems.THORNIUM_SWORD_SUPREME,
        SupremeItems.THORNIUM_SHIELD, SupremeItems.THORNIUM_SHIELD_MAGIC, SupremeItems.THORNIUM_SHIELD_RARE,
        SupremeItems.THORNIUM_SHIELD_EPIC, SupremeItems.THORNIUM_SHIELD_LEGENDARY,
        SupremeItems.THORNIUM_SHIELD_SUPREME);

    final AbstractWeapons bow = new AbstractWeapons(SupremeItems.THORNIUM_BOW, WeaponsThornium.RECIPE_THORNIUM_BOW);
    bow.register(sup);
    final AbstractWeapons bowMagic = new AbstractWeapons(SupremeItems.THORNIUM_BOW_MAGIC,
        ItemTier.getMagicRecipe(SupremeItems.THORNIUM_BOW));
    bowMagic.register(sup);
    final AbstractWeapons bowRare = new AbstractWeapons(SupremeItems.THORNIUM_BOW_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_BOW_MAGIC));
    bowRare.register(sup);
    final AbstractWeapons bowEpic = new AbstractWeapons(SupremeItems.THORNIUM_BOW_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_BOW_RARE));
    bowEpic.register(sup);
    final AbstractWeapons bowLegendary = new AbstractWeapons(SupremeItems.THORNIUM_BOW_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_BOW_EPIC));
    bowLegendary.register(sup);
    final AbstractWeapons bowSupreme = new AbstractWeapons(SupremeItems.THORNIUM_BOW_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_BOW_LEGENDARY));
    bowSupreme.register(sup);

    final AbstractWeapons titaniumSword = new AbstractWeapons(SupremeItems.TITANIUM_SWORD,
        WeaponsBasic.RECIPE_TITANIUM_SWORD);
    titaniumSword.register(sup);
    final AbstractWeapons aurumSword = new AbstractWeapons(SupremeItems.AURUM_SWORD, WeaponsBasic.RECIPE_AURUM_SWORD);
    aurumSword.register(sup);
    final AbstractWeapons adamantiumSword = new AbstractWeapons(SupremeItems.ADAMANTIUM_SWORD,
        WeaponsBasic.RECIPE_ADAMANTIUM_SWORD);
    adamantiumSword.register(sup);

    final AbstractWeapons sword = new AbstractWeapons(SupremeItems.THORNIUM_SWORD,
        WeaponsThornium.RECIPE_THORNIUM_SWORD);
    sword.register(sup);
    final AbstractWeapons swordMagic = new AbstractWeapons(SupremeItems.THORNIUM_SWORD_MAGIC,
        ItemTier.getMagicRecipe(SupremeItems.THORNIUM_SWORD));
    swordMagic.register(sup);
    final AbstractWeapons swordRare = new AbstractWeapons(SupremeItems.THORNIUM_SWORD_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_SWORD_MAGIC));
    swordRare.register(sup);
    final AbstractWeapons swordEpic = new AbstractWeapons(SupremeItems.THORNIUM_SWORD_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_SWORD_RARE));
    swordEpic.register(sup);
    final AbstractWeapons swordLegendary = new AbstractWeapons(SupremeItems.THORNIUM_SWORD_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_SWORD_EPIC));
    swordLegendary.register(sup);
    final AbstractWeapons swordSupreme = new AbstractWeapons(SupremeItems.THORNIUM_SWORD_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_SWORD_LEGENDARY));
    swordSupreme.register(sup);

    final AbstractWeapons shield = new AbstractWeapons(SupremeItems.THORNIUM_SHIELD,
        WeaponsThornium.RECIPE_THORNIUM_SHIELD);
    shield.register(sup);
    final AbstractWeapons shieldMagic = new AbstractWeapons(SupremeItems.THORNIUM_SHIELD_MAGIC,
        ItemTier.getMagicRecipe(SupremeItems.THORNIUM_SHIELD));
    shieldMagic.register(sup);
    final AbstractWeapons shieldRare = new AbstractWeapons(SupremeItems.THORNIUM_SHIELD_RARE,
        ItemTier.getRareRecipe(SupremeItems.THORNIUM_SHIELD_MAGIC));
    shieldRare.register(sup);
    final AbstractWeapons shieldEpic = new AbstractWeapons(SupremeItems.THORNIUM_SHIELD_EPIC,
        ItemTier.getEpicRecipe(SupremeItems.THORNIUM_SHIELD_RARE));
    shieldEpic.register(sup);
    final AbstractWeapons shieldLegendary = new AbstractWeapons(SupremeItems.THORNIUM_SHIELD_LEGENDARY,
        ItemTier.getLegendaryRecipe(SupremeItems.THORNIUM_SHIELD_EPIC));
    shieldLegendary.register(sup);
    final AbstractWeapons shieldSupreme = new AbstractWeapons(SupremeItems.THORNIUM_SHIELD_SUPREME,
        ItemTier.getSupremeRecipe(SupremeItems.THORNIUM_SHIELD_LEGENDARY));
    shieldSupreme.register(sup);
  }
}
