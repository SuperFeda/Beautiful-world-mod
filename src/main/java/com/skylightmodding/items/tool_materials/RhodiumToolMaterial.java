package com.skylightmodding.items.tool_materials;

import com.skylightmodding.init.BWItems;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class RhodiumToolMaterial implements ToolMaterial {
    public static final RhodiumToolMaterial INSTANCE = new RhodiumToolMaterial();

    @Override
    public int getDurability() {
        return 1783;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 2.0f;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.PORTALS;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BWItems.RHODIUM_INGOT);
    }
}
