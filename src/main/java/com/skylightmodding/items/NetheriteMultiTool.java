package com.skylightmodding.items;

import com.skylightmodding.misc.BWTags;

import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;

public class NetheriteMultiTool extends MiningToolItem {
    // TODO: переделать по нормальному
    public NetheriteMultiTool(ToolMaterial material, Item.Settings settings) {
        super(material, BWTags.MULTI_TOOL_BLOCKS, settings);
    }
}
