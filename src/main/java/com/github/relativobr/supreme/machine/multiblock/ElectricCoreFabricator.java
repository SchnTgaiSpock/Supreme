package com.github.relativobr.supreme.machine.multiblock;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.machine.MediumContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.resource.core.SupremeCoreColor;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreLife;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

public class ElectricCoreFabricator extends MediumContainerMachine {

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE = new ItemStack[]{SupremeItems.RUSTLESS_MACHINE,
      SlimefunItems.PROGRAMMABLE_ANDROID_3, SupremeItems.RUSTLESS_MACHINE, SupremeItems.INDUCTIVE_MACHINE,
      SupremeItems.SYNTHETIC_RUBY, SupremeItems.INDUCTIVE_MACHINE, SlimefunItems.ELECTRIC_MOTOR,
      SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR};

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE_II = new ItemStack[]{
      SupremeItems.CONVEYANCE_MACHINE, SupremeItems.CETRUS_LUX, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.ELECTRIC_CORE_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.BLEND_MACHINE, SupremeItems.CETRUS_IGNIS,
      SupremeItems.BLEND_MACHINE};

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeItems.CETRUS_LUX, SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.ELECTRIC_CORE_MACHINE_II, SupremeItems.SUPREME,
      SupremeItems.CRYSTALLIZER_MACHINE, SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};

  @ParametersAreNonnullByDefault
  public ElectricCoreFabricator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_STONE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRANITE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_DIORITE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SAND));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_CLAY));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SNOW));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_RED));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_YELLOW));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PURPLE));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLUE));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLACK));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GREEN));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PINK));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GRAY));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_CYAN));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_BEEF));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_MUTTON));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SALMON));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_COD));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_STRING));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_TEAR));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_POTATO));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_APPLE));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_BEETROOT));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_WHEAT));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_MELON));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_CARROT));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_COAL));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_IRON));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_GOLD));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));
    return list;
  }

  private static AbstractItemRecipe addRecipe(CustomCoreRecipe customCoreRecipe) {
    final ItemStack itemStack1 = new ItemStack(customCoreRecipe.getMainItem(),
        customCoreRecipe.getMainItem().getMaxStackSize());
    final ItemStack itemStack2 = new ItemStack(customCoreRecipe.getSecondItem(),
        customCoreRecipe.getSecondItem().getMaxStackSize());
    final ItemStack itemStack3 = new ItemStack(customCoreRecipe.getLastItem(),
        customCoreRecipe.getLastItem().getMaxStackSize());
    return new AbstractItemRecipe(
        new ItemStack[]{itemStack1, itemStack1, itemStack1, itemStack2, itemStack2, itemStack2, itemStack3, itemStack3,
            itemStack3}, customCoreRecipe.getMaterial());
  }
}
