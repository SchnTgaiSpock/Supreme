package com.github.relativobr.supreme.tools;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.ZombieTech;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemUtil;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.EntityInteractHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;

import org.bukkit.Sound;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Golem;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

public class MobCollectorTools extends SlimefunItem implements Rechargeable, NotPlaceable {

  public static final ItemStack[] RECIPE_MOB_COLLECTOR_I = new ItemStack[]{null, SupremeItems.SYNTHETIC_RUBY, null,
      null, SupremeItems.AURUM_SWORD, null, null, SlimefunItems.MEDIUM_CAPACITOR, null};

  public static final ItemStack[] RECIPE_MOB_COLLECTOR_II = new ItemStack[]{null, SupremeItems.CORE_OF_LIFE, null, null,
      SupremeItems.MOB_COLLECTOR_I, null, null, SupremeItems.CETRUS_VENTUS, null};

  public static final ItemStack[] RECIPE_MOB_COLLECTOR_III = new ItemStack[]{null, SupremeAttribute.getBomb(), null,
      null, SupremeItems.MOB_COLLECTOR_II, null, null, SupremeItems.CETRUS_LUMIUM, null};
  int charge;
  int maxCharge;
  public MobCollectorTools(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(itemGroup, item, recipeType, recipe);
    addItemHandler(getItemHandler());
  }

  public static void setup(Supreme plugin) {

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, SupremeItems.MOB_COLLECTOR_I,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_I).setCharge(50).setMaxCharge(500)
        .register(plugin);

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, SupremeItems.MOB_COLLECTOR_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_II).setCharge(50).setMaxCharge(5000)
        .register(plugin);

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, SupremeItems.MOB_COLLECTOR_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_III).setCharge(50).setMaxCharge(5000)
        .register(plugin);

  }

  public int getCharge() {
    return this.charge;
  }

  public final MobCollectorTools setCharge(int value) {
    this.charge = value;
    return this;
  }

  public int getMaxCharge() {
    return this.maxCharge;
  }

  public final MobCollectorTools setMaxCharge(int value) {
    this.maxCharge = value;
    return this;
  }

  public EntityInteractHandler getItemHandler() {
    return (e, item, offhand) -> {
      if (getItemCharge(item) < getCharge()) {
        return;
      }
      Entity entity = e.getRightClicked();
      if (e.isCancelled() || !Slimefun.getProtectionManager()
          .hasPermission(e.getPlayer(), entity.getLocation(), Interaction.INTERACT_ENTITY)) {
        return;
      }
      Player p = e.getPlayer();
      if (entity instanceof Bee) {
        entity.getWorld()
            .dropItemNaturally(entity.getLocation(), ItemUtil.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0));
        entity.remove();
        removeItemCharge(item, getCharge());
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 1, 1);
      }
      if (entity instanceof Golem) {
        entity.getWorld()
            .dropItemNaturally(entity.getLocation(), ItemUtil.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0));
        entity.remove();
        removeItemCharge(item, getCharge());
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 1, 1);
      }
      if (entity instanceof Zombie) {
        entity.getWorld()
            .dropItemNaturally(entity.getLocation(), ItemUtil.buildItemFromMobTechDTO(ZombieTech.SIMPLE_ZOMBIE, 0));
        entity.remove();
        removeItemCharge(item, getCharge());
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 1, 1);
      }

    };

  }

  @Override
  public float getMaxItemCharge(ItemStack item) {
    return getMaxCharge();
  }

}
