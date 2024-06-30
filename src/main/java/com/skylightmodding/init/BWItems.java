package com.skylightmodding.init;

import com.skylightmodding.BeautifulWorld;
import com.skylightmodding.items.BaikalWaterItem;
import com.skylightmodding.items.NetheriteMultiTool;
import com.skylightmodding.items.PitahayaItem;
import com.skylightmodding.items.RhodiumSword;
import com.skylightmodding.misc.OverloudToolMaterial;

import net.minecraft.client.item.TooltipType;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class BWItems {
    // Ore
    public static final Item CRYSTALLITE = registerItem("crystallite", new Item(new Item.Settings()));
    public static final Item OVERLOUD_INGOT = registerItem("overloud_ingot", new Item(new Item.Settings()));
    public static final Item RAW_OVERLOUD = registerItem("raw_overloud", new Item(new Item.Settings()));
    public static final Item RHODIUM_INGOT = registerItem("rhodium_ingot", new Item(new Item.Settings().fireproof()));

    // Korg Items
    public static final Item KORG_FRAGMENT = registerItem("korg_fragment", new Item(new Item.Settings()));

    // overloud items
//    public static final Item OVERLOUD_HELMET = registerItem(
//            "overloud_helmet",
//            new ArmorItem(BWArmorMaterial.OVERLOUD, ArmorItem.Type.HELMET, new Item.Settings())
//    );
    public static final Item OVERLOUD_SWORD = registerItem(
            "overloud_sword",
            new SwordItem(OverloudToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(OverloudToolMaterial.INSTANCE, 10, -2.4F)))
    );
    public static final Item OVERLOUD_PICKAXE = registerItem(
            "overloud_pickaxe",
            new PickaxeItem(OverloudToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(OverloudToolMaterial.INSTANCE, 7, -2.8F)))
    );
    public static final Item OVERLOUD_AXE = registerItem(
            "overloud_axe",
            new AxeItem(OverloudToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(OverloudToolMaterial.INSTANCE, 13, -3.2F)))
    );
    public static final Item OVERLOUD_HOE = registerItem(
            "overloud_hoe",
            new HoeItem(OverloudToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(OverloudToolMaterial.INSTANCE, 1, -1.0F)))
    );
    public static final Item OVERLOUD_SHOVEL = registerItem(
            "overloud_shovel",
            new ShovelItem(OverloudToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(OverloudToolMaterial.INSTANCE, 3.5f, -2.0F)))
    );

    // rhodium
    public static final Item RHODIUM_SWORD = registerItem(
            "rhodium_sword",
            new RhodiumSword(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(OverloudToolMaterial.INSTANCE, 5, -2.4F)))
            // TODO: добавить RhodiumToolMaterial
    );

    // other
    public static final Item NETHERITE_MULTI_TOOL = registerItem(
            "netherite_multitool",
            new NetheriteMultiTool(ToolMaterials.NETHERITE, new Item.Settings())
    );
    public static final Item PITAHAYA = registerItem(
            "pitahaya",
            new PitahayaItem(new Item.Settings().food(new FoodComponent(5, 4.5f, true, 1.6f, List.of())))
    );
    public static final Item BAIKAL_WATER = registerItem(
            "baikal_water",
            new BaikalWaterItem(new Item.Settings()) {
                @Override
                public void appendTooltip(ItemStack itemStack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.beautifulworld.baikal_water").formatted(Formatting.GRAY));
                }
            }
    );

    // ctrl+c ctrl+v from https://github.com/Pandarix/BetterArcheology/blob/1.20/src/main/java/net/Pandarix/betterarcheology/item/ModItems.java
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BeautifulWorld.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BeautifulWorld.LOGGER.info("Registering Items from " + BeautifulWorld.MOD_ID);
    }
}
