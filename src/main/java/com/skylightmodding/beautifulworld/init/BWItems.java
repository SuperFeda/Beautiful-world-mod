package com.skylightmodding.beautifulworld.init;

import com.skylightmodding.beautifulworld.BeautifulWorld;
import com.skylightmodding.beautifulworld.items.BWRarity;
import com.skylightmodding.beautifulworld.items.custom.BaikalWater;
import com.skylightmodding.beautifulworld.items.custom.PitahayaItem;
import com.skylightmodding.beautifulworld.items.custom.RhodiumMultitool;
import com.skylightmodding.beautifulworld.items.custom.RhodiumSword;
import com.skylightmodding.beautifulworld.items.config.BWArmorMaterials;
import com.skylightmodding.beautifulworld.items.config.BWFoodItemsConfig;
import com.skylightmodding.beautifulworld.items.config.BWToolsTiers;
import com.skylightmodding.beautifulworld.items.type.MultiToolItem;

import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BWItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeautifulWorld.MODID);

    /* Ore, other */
    /**/ public static final RegistryObject<Item> OVERLOUD_INGOT = ITEMS.register("overloud_ingot", () -> new Item(new Item.Properties()));
    /**/ public static final RegistryObject<Item> RAW_OVERLOUD = ITEMS.register("raw_overloud", () -> new Item(new Item.Properties()));
    /**/ public static final RegistryObject<Item> RHODIUM_INGOT = ITEMS.register("rhodium_ingot", () -> new Item(new Item.Properties()));
    /**/ public static final RegistryObject<Item> CRYSTALLITE = ITEMS.register("crystallite", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    /* Armor */
    /**/ public static final RegistryObject<Item> OVERLOUD_HELMET = ITEMS.register("overloud_helmet", () -> new ArmorItem(BWArmorMaterials.OVERLOUD, ArmorItem.Type.HELMET, new Item.Properties()));
    /**/ public static final RegistryObject<Item> OVERLOUD_CHESTPLATE = ITEMS.register("overloud_chestplate", () -> new ArmorItem(BWArmorMaterials.OVERLOUD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    /**/ public static final RegistryObject<Item> OVERLOUD_LEGGINGS = ITEMS.register("overloud_leggings", () -> new ArmorItem(BWArmorMaterials.OVERLOUD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    /**/ public static final RegistryObject<Item> OVERLOUD_BOOTS = ITEMS.register("overloud_boots", () -> new ArmorItem(BWArmorMaterials.OVERLOUD, ArmorItem.Type.BOOTS, new Item.Properties()));

    /* Infected items */
    /**/ public static final RegistryObject<Item> INFECTED_FRAGMENT = ITEMS.register("infected_fragment", () -> new Item(new Item.Properties().rarity(BWRarity.VIRUS)));

    /* Pitahaya tree items */
    /**/ public static final RegistryObject<Item> PITAHAYA = ITEMS.register("pitahaya", () -> new PitahayaItem(new Item.Properties().food(BWFoodItemsConfig.PITAHAYA).stacksTo(16)));
    ///**/ public static final RegistryObject<Item> PITAHAYA_TREE_BOAT = ITEMS.register("pitahaya_tree_boat", () -> new BoatItem(false, Boat.Type.DARK_OAK, (new Item.Properties().stacksTo(1))));
    ///**/ public static final RegistryObject<Item> PITAHAYA_TREE_CHEST_BOAT = ITEMS.register("pitahaya_tree_chest_boat", () -> new BoatItem(true, Boat.Type.DARK_OAK, (new Item.Properties().stacksTo(1))));

    /* Tools */
    /**/ public static final RegistryObject<Item> OVERLOUD_SWORD = ITEMS.register("overloud_sword", () -> new SwordItem(BWToolsTiers.OVERLOUD, 8, -2.65F, new Item.Properties().durability(3999)));
    /**/ public static final RegistryObject<Item> OVERLOUD_PICKAXE = ITEMS.register("overloud_pickaxe", () -> new PickaxeItem(BWToolsTiers.OVERLOUD, 2, -3F, new Item.Properties().durability(3499)));
    /**/ public static final RegistryObject<Item> OVERLOUD_AXE = ITEMS.register("overloud_axe", () -> new AxeItem(BWToolsTiers.OVERLOUD, 11, -3.3F, new Item.Properties().durability(3299)));
    /**/ public static final RegistryObject<Item> OVERLOUD_HOE = ITEMS.register("overloud_hoe", () -> new HoeItem(BWToolsTiers.OVERLOUD, 1, -3F, new Item.Properties().durability(3299)));
    /**/ public static final RegistryObject<Item> OVERLOUD_SHOVEL = ITEMS.register("overloud_shovel", () -> new ShovelItem(BWToolsTiers.OVERLOUD, 1, -3.5F, new Item.Properties().durability(3299)));
    /**/ public static final RegistryObject<Item> NETHERITE_MULTITOOL = ITEMS.register("netherite_multitool", () -> new MultiToolItem(Tiers.NETHERITE, new Item.Properties().durability(2399)));
    /**/ public static final RegistryObject<Item> RHODIUM_MULTITOOL = ITEMS.register("rhodium_multitool", () -> new RhodiumMultitool(BWToolsTiers.RHODIUM, new Item.Properties().fireResistant().durability(2399)));
    /**/ public static final RegistryObject<Item> RHODIUM_SWORD = ITEMS.register("rhodium_sword", () -> new RhodiumSword(BWToolsTiers.RHODIUM, new Item.Properties().fireResistant().durability(3399)));

    /* Other items */
    /**/ public static final RegistryObject<Item> BAIKAL_WATER = ITEMS.register("baikal_water", () -> new BaikalWater(new Item.Properties().food(BWFoodItemsConfig.BAIKAL_WATER).stacksTo(1).rarity(BWRarity.MYTHIC)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }

}