package com.skylightmodding.beautifulworld.items;

import com.skylightmodding.beautifulworld.items.extra.MultiToolItem;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class RhodiumMultitool extends MultiToolItem {
    public RhodiumMultitool(Tier tier, Item.Properties properties) { super(tier, properties); }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);

        if (result && !target.fireImmune()) {
            if (!target.getLevel().isClientSide()) {
                target.setSecondsOnFire(15);
            } else {
                target.getLevel().addParticle(ParticleTypes.FLAME, target.getX(), target.getY() + target.getBbHeight() * 0.5, target.getZ(), target.getBbWidth() * 0.5, target.getBbHeight() * 0.5, target.getBbWidth() * 0.5);
            }
        }

        return result;
    }
}
