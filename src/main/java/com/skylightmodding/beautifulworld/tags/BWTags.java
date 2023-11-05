package com.skylightmodding.beautifulworld.tags;

import com.skylightmodding.beautifulworld.BeautifulWorld;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class BWTags {
    public static final TagKey<Block> NEEDS_OVERLOUD_TOOL = tag("needs_overloud_tool");


    private static TagKey<Block> tag(String name) { return BlockTags.create(new ResourceLocation(BeautifulWorld.MODID, name)); }

    private static TagKey<Block> forgeTag(String name) { return BlockTags.create(new ResourceLocation("forge", name)); }
}
