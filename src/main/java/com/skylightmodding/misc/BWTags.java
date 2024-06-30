package com.skylightmodding.misc;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BWTags {
    public static final TagKey<Block> MULTI_TOOL_BLOCKS = of("multi_tool_blocks");

    private BWTags() {}

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}
