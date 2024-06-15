package com.skylightmodding.beautifulworld.init;

import com.skylightmodding.beautifulworld.BeautifulWorld;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BeautifulWorld.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BWTabs {

    @SubscribeEvent
    public static void equipmentTab(CreativeModeTabEvent.Register event) {
        CreativeModeTab EQUIPMENT = event.registerCreativeModeTab(BeautifulWorld.prefix("equipment"), builder -> builder
                .title(Component.translatable("itemGroup.beautifulworld.equipment"))//.withSearchBar()
                .icon(() -> new ItemStack(BWItems.NETHERITE_MULTITOOL.get()))
                .displayItems((parameters, output) -> {
                    output.accept(BWItems.OVERLOUD_HELMET.get());
                    output.accept(BWItems.OVERLOUD_CHESTPLATE.get());
                    output.accept(BWItems.OVERLOUD_LEGGINGS.get());
                    output.accept(BWItems.OVERLOUD_BOOTS.get());
                    output.accept(BWItems.OVERLOUD_SWORD.get());
                    output.accept(BWItems.OVERLOUD_PICKAXE.get());
                    output.accept(BWItems.OVERLOUD_AXE.get());
                    output.accept(BWItems.OVERLOUD_SHOVEL.get());
                    output.accept(BWItems.OVERLOUD_HOE.get());
                    output.accept(BWItems.NETHERITE_MULTITOOL.get());
                    output.accept(BWItems.RHODIUM_SWORD.get());
                    output.accept(BWItems.RHODIUM_MULTITOOL.get());
                }));
    }

    @SubscribeEvent
    public static void itemsTab(CreativeModeTabEvent.Register event) {
        CreativeModeTab ITEMS = event.registerCreativeModeTab(BeautifulWorld.prefix("items"), builder -> builder
                .title(Component.translatable("itemGroup.beautifulworld.items"))
                .icon(() -> new ItemStack(BWItems.CRYSTALLITE.get()))
                .displayItems((parameters, output) -> {
                    output.accept(BWItems.OVERLOUD_INGOT.get());
                    output.accept(BWItems.RAW_OVERLOUD.get());
                    output.accept(BWItems.RHODIUM_INGOT.get());
                    output.accept(BWItems.CRYSTALLITE.get());
                    output.accept(BWItems.BAIKAL_WATER.get());
                    output.accept(BWItems.PITAHAYA.get());
                    output.accept(BWItems.INFECTED_FRAGMENT.get());
//                    output.accept(BWItems.PITAHAYA_TREE_BOAT.get());
//                    output.accept(BWItems.PITAHAYA_TREE_CHEST_BOAT.get());
                }));
    }

    @SubscribeEvent
    public static void blocksTab(CreativeModeTabEvent.Register event) {
        CreativeModeTab BLOCKS = event.registerCreativeModeTab(BeautifulWorld.prefix("blocks"), builder -> builder
                .title(Component.translatable("itemGroup.beautifulworld.blocks"))
                .icon(() -> new ItemStack(BWBlocks.INFECTED_STONE.get()))
                .displayItems((parameters, output) -> {
                    output.accept(BWItems.INFECTED_STONE.get());
                    output.accept(BWItems.INFECTED_COBBLESTONE.get());
                    output.accept(BWItems.INFECTED_SAND.get());
                    output.accept(BWItems.INFECTED_CLAY.get());
                    output.accept(BWItems.INFECTED_DIRT.get());
                    output.accept(BWBlocks.OVERLOUD_BLOCK.get());
                    output.accept(BWBlocks.RAW_OVERLOUD_BLOCK.get());
                    output.accept(BWBlocks.OVERLOUD_ORE.get());
                    output.accept(BWBlocks.RHODIUM_BLOCK.get());
                    output.accept(BWBlocks.RHODIUM_ORE.get());
                    output.accept(BWBlocks.PITAHAYA_LEAVES.get());
                    output.accept(BWBlocks.FRUITFUL_PITAHAYA_LEAVES.get());
                    output.accept(BWBlocks.PITAHAYA_LOG.get());
                    output.accept(BWBlocks.STRIPPED_PITAHAYA_LOG.get());
                    output.accept(BWBlocks.PITAHAYA_WOOD.get());
                    output.accept(BWBlocks.STRIPPED_PITAHAYA_WOOD.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_PLANKS.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_STAIRS.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_SLAB.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_FENCE.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_FENCE_GATE.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_PRESSURE_PLATE.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_BUTTON.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_DOOR.get());
                    output.accept(BWBlocks.PITAHAYA_TREE_TRAPDOOR.get());
                }));
    }
}