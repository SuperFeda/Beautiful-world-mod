package com.skylightmodding.beautifulworld.tags;

import com.skylightmodding.beautifulworld.BeautifulWorld;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BWTags {
    public static final TagKey<Block> NEEDS_OVERLOUD_TOOL = createBlockTag("needs_overloud_tool");

    private static TagKey<Block> createBlockTag(String name) { return BlockTags.create(new ResourceLocation(BeautifulWorld.MODID, name)); }
    private static TagKey<Block> createBlockForgeTag(String name) { return BlockTags.create(new ResourceLocation("forge", name)); }

    private static TagKey<Item> createItemTag(String name) { return ItemTags.create(new ResourceLocation(BeautifulWorld.MODID, name));}
    private static TagKey<Item> createItemForgeTag(String name) { return ItemTags.create(new ResourceLocation("forge", name)); }
}
