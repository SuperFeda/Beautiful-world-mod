package com.skylightmodding.beautifulworld.init;

import com.skylightmodding.beautifulworld.BeautifulWorld;
import com.skylightmodding.beautifulworld.blocks.custom.FruitfulPitahayaLeaves;
import com.skylightmodding.beautifulworld.blocks.type.InfectedBlock;
import com.skylightmodding.beautifulworld.blocks.type.ModFlammableRotatedPillarBlock;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BWBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeautifulWorld.MODID);

    /* Overloud blocks */
    /**/ public static final RegistryObject<Block> OVERLOUD_BLOCK = registerBlock("overloud_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).requiresCorrectToolForDrops()));
    /**/ public static final RegistryObject<Block> RAW_OVERLOUD_BLOCK = registerBlock("raw_overloud_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    /**/ public static final RegistryObject<Block> OVERLOUD_ORE = registerBlock("overloud_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(30.0F,1311.1F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    /* Rhodium blocks */
    /**/ public static final RegistryObject<Block> RHODIUM_BLOCK = registerBlock("rhodium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).requiresCorrectToolForDrops()));
    /**/ public static final RegistryObject<Block> RHODIUM_ORE = registerBlock("rhodium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(30.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    /* Infected blocks */
    /**/ public static final RegistryObject<Block> INFECTED_STONE = registerBlock("infected_stone", () -> new InfectedBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.BASALT).strength(7f).requiresCorrectToolForDrops()));
    /**/ //public static final RegistryObject<Block> INFECTED_COBBLESTONE = registerBlock("infected_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.BASALT).strength(7f).requiresCorrectToolForDrops()));

    /* Pitahaya tree blocks */
    /**/ public static final RegistryObject<Block> PITAHAYA_LEAVES = registerBlock("pitahaya_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.AZALEA_LEAVES)));
    /**/ public static final RegistryObject<Block> FRUITFUL_PITAHAYA_LEAVES = registerBlock("fruitful_pitahaya_leaves", () -> new FruitfulPitahayaLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.AZALEA_LEAVES).requiresCorrectToolForDrops()));
    /**/ public static final RegistryObject<Block> PITAHAYA_LOG = registerBlock("pitahaya_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    /**/ public static final RegistryObject<Block> STRIPPED_PITAHAYA_LOG = registerBlock("stripped_pitahaya_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    /**/ public static final RegistryObject<Block> PITAHAYA_WOOD = registerBlock("pitahaya_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    /**/ public static final RegistryObject<Block> STRIPPED_PITAHAYA_WOOD = registerBlock("stripped_pitahaya_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_PLANKS = registerBlock("pitahaya_tree_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_BUTTON = registerBlock("pitahaya_tree_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK,30,true));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_PRESSURE_PLATE = registerBlock("pitahaya_tree_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_SLAB = registerBlock("pitahaya_tree_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_STAIRS = registerBlock("pitahaya_tree_stairs", () -> new StairBlock(() -> PITAHAYA_TREE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_FENCE = registerBlock("pitahaya_tree_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_FENCE_GATE = registerBlock("pitahaya_tree_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), WoodType.OAK));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_DOOR = registerBlock("pitahaya_tree_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    /**/ public static final RegistryObject<Block> PITAHAYA_TREE_TRAPDOOR = registerBlock("pitahaya_tree_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion()/*.isValidSpawn(BWBlocks::never)*/, BlockSetType.OAK));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return BWItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
