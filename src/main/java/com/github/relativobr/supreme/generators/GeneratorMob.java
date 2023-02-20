package com.github.relativobr.supreme.generators;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.SupremeItems;
import com.github.relativobr.supreme.util.ItemGroups;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.AbstractEnergyProvider;

import java.util.concurrent.Future;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Sheep;
import org.bukkit.inventory.ItemStack;

public class GeneratorMob extends AbstractEnergyProvider {

  public static final int BASIC_GENERATOR_MOB_ENERGY = 50;
  public static final int BASIC_GENERATOR_MOB_BUFFER = 1000;
  public static final int MEDIUM_GENERATOR_MOB_ENERGY = 200;
  public static final int MEDIUM_GENERATOR_MOB_BUFFER = 4000;
  public static final int ADVANCED_GENERATOR_MOB_ENERGY = 800;
  public static final int ADVANCED_GENERATOR_MOB_BUFFER = 16000;

  public static final ItemStack[] RECIPE_GENERATOR_MOB_BASIC = new ItemStack[]{SlimefunItems.SMALL_CAPACITOR,
      SlimefunItems.SILICON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRIC_MOTOR,
      SlimefunItems.ALUMINUM_INGOT, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ALUMINUM_INGOT,
      SlimefunItems.SMALL_CAPACITOR};

  public static final ItemStack[] RECIPE_GENERATOR_MOB_MEDIUM = new ItemStack[]{SupremeItems.GENERATOR_MOB_BASIC,
      SlimefunItems.FERROSILICON, SupremeItems.GENERATOR_MOB_BASIC, SlimefunItems.REINFORCED_PLATE,
      SupremeItems.SYNTHETIC_RUBY, SlimefunItems.REINFORCED_PLATE, SupremeItems.GENERATOR_MOB_BASIC,
      SlimefunItems.ALUMINUM_BRONZE_INGOT, SupremeItems.GENERATOR_MOB_BASIC};

  public static final ItemStack[] RECIPE_GENERATOR_MOB_ADVANCED = new ItemStack[]{SupremeItems.GENERATOR_MOB_MEDIUM,
      SlimefunItems.CARBONADO, SupremeItems.GENERATOR_MOB_MEDIUM, SlimefunItems.HEATING_COIL, SlimefunItems.PLUTONIUM,
      SlimefunItems.HEATING_COIL, SupremeItems.GENERATOR_MOB_MEDIUM, SupremeItems.INDUCTIVE_MACHINE,
      SupremeItems.GENERATOR_MOB_MEDIUM};

  private int energy;
  private int buffer;
  private int mobRange = 3;

  public GeneratorMob(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.ELECTRIC_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(Location l) {
    try {
      Predicate<Entity> predicate = this::isValidAnimal;
      Future<Boolean> task = Bukkit.getScheduler().callSyncMethod(Supreme.inst(),
          () -> l.getWorld().getNearbyEntities(l, mobRange, mobRange, mobRange, predicate).isEmpty());
      return !task.get();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n) {
    return n instanceof Cow || n instanceof Sheep || n instanceof Pig;
  }

  public final GeneratorMob setEnergy(int value) {
    this.energy = value;
    return this;
  }

  public final GeneratorMob setBuffer(int value) {
    this.buffer = value;
    return this;
  }

  public final GeneratorMob setMobRange(int value) {
    this.mobRange = value;
    return this;
  }

  @Nonnull
  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(Material.OBSERVER);
  }

  @Override
  public int getEnergyProduction() {
    return energy;
  }

  @Override
  protected void registerDefaultFuelTypes() {
  }

  @Override
  public int getGeneratedOutput(Location l, Config config) {
    if (l != null) {
      return isAnimalNearby(l) ? getEnergyProduction() : 0;
    }
    return 0;
  }

  @Override
  public int getCapacity() {
    return this.buffer;
  }

  @Override
  public int[] getInputSlots() {
    return new int[0];
  }

  @Override
  public int[] getOutputSlots() {
    return new int[0];
  }
}
