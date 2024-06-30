package com.skylightmodding.misc;

import com.skylightmodding.init.BWItems;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class OverloudToolMaterial implements ToolMaterial {
    public static final OverloudToolMaterial INSTANCE = new OverloudToolMaterial();

    @Override
    public int getDurability() {
        return 2314;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 20.0f;
    }

    @Override
    public float getAttackDamage() {
        return 2.0f;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.PORTALS;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BWItems.OVERLOUD_INGOT);
    }
}
