package com.github.relativobr.supreme.machine.multiblock;

import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.generic.machine.MediumContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ElectricMagicalFabricator extends MediumContainerMachine {

  public static final ItemStack[] RECIPE_ELECTRIC_MAGICAL_MACHINE = new ItemStack[]{
      SupremeItems.RESOURCE_CORE_NETHERITE, new ItemStack(Material.CRYING_OBSIDIAN),
      SupremeItems.RESOURCE_CORE_NETHERITE, SupremeItems.INDUCTOR_MACHINE, SupremeItems.SYNTHETIC_RUBY,
      SupremeItems.INDUCTOR_MACHINE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.CARBONADO_EDGED_CAPACITOR,
      SlimefunItems.ELECTRIC_MOTOR};

  public static final ItemStack[] RECIPE_ELECTRIC_MAGICAL_MACHINE_II = new ItemStack[]{
      SupremeItems.CONVEYANCE_MACHINE, SupremeItems.CETRUS_LUX, SupremeItems.CONVEYANCE_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.ELECTRIC_MAGICAL_MACHINE,
      SupremeItems.INDUCTOR_MACHINE, SupremeItems.BLEND_MACHINE, SupremeItems.CETRUS_IGNIS,
      SupremeItems.BLEND_MACHINE};

  public static final ItemStack[] RECIPE_ELECTRIC_MAGICAL_MACHINE_III = new ItemStack[]{SupremeItems.THORNERITE,
      SupremeItems.CETRUS_LUX, SupremeItems.THORNERITE, SupremeItems.SUPREME,
      SupremeItems.ELECTRIC_MAGICAL_MACHINE_II, SupremeItems.SUPREME,
      SupremeItems.CRYSTALLIZER_MACHINE, SupremeItems.CETRUS_LUMIUM, SupremeItems.CRYSTALLIZER_MACHINE};

  @ParametersAreNonnullByDefault
  public ElectricMagicalFabricator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(new AbstractItemRecipe(SupremeComponents.RECIPE_BLEND_MACHINE, SupremeItems.BLEND_MACHINE));
    list.add(new AbstractItemRecipe(SupremeCore.RECIPE_CORE_OF_BLOCK, SupremeItems.CORE_OF_BLOCK));
    list.add(new AbstractItemRecipe(SupremeCore.RECIPE_CORE_OF_DEATH, SupremeItems.CORE_OF_DEATH));
    list.add(new AbstractItemRecipe(SupremeCore.RECIPE_CORE_OF_LIFE, SupremeItems.CORE_OF_LIFE));
    list.add(new AbstractItemRecipe(SupremeCore.RECIPE_CORE_OF_COLOR, SupremeItems.CORE_OF_COLOR));
    list.add(new AbstractItemRecipe(SupremeCore.RECIPE_CORE_OF_NATURE, SupremeItems.CORE_OF_NATURE));
    list.add(new AbstractItemRecipe(SupremeCore.RECIPE_CORE_OF_ALLOY, SupremeItems.CORE_OF_ALLOY));
    list.add(new AbstractItemRecipe(SupremeCetrus.RECIPE_CETRUS_IGNIS, SupremeItems.CETRUS_IGNIS));
    list.add(new AbstractItemRecipe(SupremeCetrus.RECIPE_CETRUS_LUX, SupremeItems.CETRUS_LUX));
    list.add(new AbstractItemRecipe(SupremeCetrus.RECIPE_CETRUS_VENTUS, SupremeItems.CETRUS_VENTUS));
    list.add(new AbstractItemRecipe(SupremeCetrus.RECIPE_CETRUS_AQUA, SupremeItems.CETRUS_AQUA));
    list.add(new AbstractItemRecipe(SupremeCetrus.RECIPE_CETRUS_LUMIUM, SupremeItems.CETRUS_LUMIUM));
    list.add(new AbstractItemRecipe(SupremeComponents.RECIPE_SUPREME, SupremeItems.SUPREME));
    list.add(new AbstractItemRecipe(SupremeAttribute.RECIPE_ATTRIBUTE_MAGIC, SupremeAttribute.getMagic()));
    list.add(new AbstractItemRecipe(SupremeAttribute.RECIPE_ATTRIBUTE_BOMB, SupremeAttribute.getBomb()));
    list.add(new AbstractItemRecipe(SupremeAttribute.RECIPE_ATTRIBUTE_FORTUNE, SupremeAttribute.getFortune()));
    list.add(new AbstractItemRecipe(SupremeAttribute.RECIPE_ATTRIBUTE_IMPETUS, SupremeAttribute.getImpetus()));
    return list;
  }

}
