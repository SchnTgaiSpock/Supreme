package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.ItemUtil.getOutputQuarry;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.machine.AbstractQuarry;
import com.github.relativobr.supreme.machine.SupremeQuarry;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemUtil;

public class SetupSupremeQuarry {

  public static void setup(Supreme sup) {

    AbstractQuarry quarryCobblestone = new AbstractQuarry(ItemGroups.MACHINES_CATEGORY, SupremeItems.STONE_QUARRY,
        SupremeQuarry.RECIPE_STONE_QUARRY).setOutput(getOutputQuarry(SupremeItems.STONE_QUARRY)).setCapacity(1000)
        .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryCobblestone);
    quarryCobblestone.register(sup);

    AbstractQuarry quarryCoal = new AbstractQuarry(ItemGroups.MACHINES_CATEGORY, SupremeItems.COAL_QUARRY,
        SupremeQuarry.RECIPE_COAL_QUARRY).setOutput(getOutputQuarry(SupremeItems.COAL_QUARRY)).setCapacity(1000)
        .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryCoal);
    quarryCoal.register(sup);

    AbstractQuarry quarryIron = new AbstractQuarry(ItemGroups.MACHINES_CATEGORY, SupremeItems.IRON_QUARRY,
        SupremeQuarry.RECIPE_IRON_QUARRY).setOutput(getOutputQuarry(SupremeItems.IRON_QUARRY)).setCapacity(1000)
        .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryIron);
    quarryIron.register(sup);

    AbstractQuarry quarryGold = new AbstractQuarry(ItemGroups.MACHINES_CATEGORY, SupremeItems.GOLD_QUARRY,
        SupremeQuarry.RECIPE_GOLD_QUARRY).setOutput(getOutputQuarry(SupremeItems.GOLD_QUARRY)).setCapacity(1000)
        .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryGold);
    quarryGold.register(sup);

    AbstractQuarry quarryDiamond = new AbstractQuarry(ItemGroups.MACHINES_CATEGORY, SupremeItems.DIAMOND_QUARRY,
        SupremeQuarry.RECIPE_DIAMOND_QUARRY).setOutput(getOutputQuarry(SupremeItems.DIAMOND_QUARRY)).setCapacity(1000)
        .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryDiamond);
    quarryDiamond.register(sup);

    AbstractQuarry quarryThornium = new AbstractQuarry(ItemGroups.MACHINES_CATEGORY, SupremeItems.THORNIUM_QUARRY,
        SupremeQuarry.RECIPE_THORNIUM_QUARRY).setOutput(getOutputQuarry(SupremeItems.THORNIUM_QUARRY))
        .setCapacity(1000).setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryThornium);
    quarryThornium.register(sup);

    AbstractQuarry quarrySupremeNuggets = new AbstractQuarry(ItemGroups.MACHINES_CATEGORY,
        SupremeItems.SUPREME_NUGGETS_QUARRY, SupremeQuarry.RECIPE_SUPREME_NUGGETS_QUARRY).setOutput(
        getOutputQuarry(SupremeItems.SUPREME_NUGGETS_QUARRY)).setCapacity(1000).setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarrySupremeNuggets);
    quarrySupremeNuggets.register(sup);
  }
}
