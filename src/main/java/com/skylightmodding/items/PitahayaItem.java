package com.skylightmodding.items;

import com.skylightmodding.init.BWStatusEffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PitahayaItem extends Item {
    public PitahayaItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.addStatusEffect(new StatusEffectInstance(BWStatusEffects.IMMUNITY, 2400, 0));
        if (user.hasStatusEffect(BWStatusEffects.INFECTION)) { user.removeStatusEffect(BWStatusEffects.INFECTION); }

        return super.finishUsing(stack, world, user);
    }
}
