package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.machine.tech.TechGenerator;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SetupSimpleCard {

  public static void setup(Supreme plugin) {

    boolean customBc = getSupremeOptions().isCustomBc();

    // setup cards
    TechGenerator.preSetup(plugin, SupremeItems.CARD_STONE, Material.STONE, Material.COBBLESTONE);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_GRANITE, Material.POLISHED_GRANITE, Material.GRANITE);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_DIORITE, Material.POLISHED_DIORITE, Material.DIORITE);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_ANDESITE, Material.POLISHED_ANDESITE, Material.ANDESITE);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_GRAVEL, Material.GRAVEL, Material.GRAVEL);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_SAND, Material.SANDSTONE, Material.SAND);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_ENDSTONE, Material.END_STONE_BRICKS, Material.END_STONE);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_CLAY, Material.CLAY, Material.CLAY);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_SNOW, Material.SNOW_BLOCK, Material.SNOW_BLOCK);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_COAL, Material.COAL_BLOCK, Material.COAL);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_IRON, Material.IRON_BLOCK, Material.IRON_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_COPPER, Material.COPPER_BLOCK, Material.COPPER_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_GOLD, Material.GOLD_BLOCK, Material.GOLD_INGOT);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_QUARTZ, Material.QUARTZ, Material.QUARTZ);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_QUARTZ_BLOCK, Material.QUARTZ_BLOCK, Material.QUARTZ_BLOCK);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_LAPIS, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_REDSTONE, Material.REDSTONE_BLOCK, Material.REDSTONE);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_DIAMOND, Material.DIAMOND_BLOCK, Material.DIAMOND);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_EMERALD, Material.EMERALD_BLOCK, Material.EMERALD);

    if(customBc){
      TechGenerator.preSetup(plugin, SupremeItems.CARD_NETHERITE, Material.NETHERITE_BLOCK, Material.NETHERITE_SCRAP);
    } else {
      TechGenerator.preSetup(plugin, SupremeItems.CARD_NETHERITE, Material.NETHERITE_BLOCK, Material.NETHERITE_INGOT);
    }

    TechGenerator.preSetup(plugin, SupremeItems.CARD_AMETHYST, Material.AMETHYST_BLOCK, Material.AMETHYST_SHARD);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_IRON_DUST, SlimefunItems.IRON_DUST, SlimefunItems.IRON_DUST);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_LEAD_DUST, SlimefunItems.LEAD_DUST, SlimefunItems.LEAD_DUST);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_GOLD_DUST, SlimefunItems.GOLD_DUST, SlimefunItems.GOLD_DUST);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_COPPER_DUST, SlimefunItems.COPPER_DUST, SlimefunItems.COPPER_DUST);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_MAGNESIUM_DUST, SlimefunItems.MAGNESIUM_DUST,
        SlimefunItems.MAGNESIUM_DUST);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_ALUMINUM_DUST, SlimefunItems.ALUMINUM_DUST,
        SlimefunItems.ALUMINUM_DUST);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_SILVER_DUST, SlimefunItems.SILVER_DUST, SlimefunItems.SILVER_DUST);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_TIN_DUST, SlimefunItems.TIN_DUST, SlimefunItems.TIN_DUST);

    TechGenerator.preSetup(plugin, SupremeItems.CARD_ZINC_DUST, SlimefunItems.ZINC_DUST, SlimefunItems.ZINC_DUST);

  }
}
