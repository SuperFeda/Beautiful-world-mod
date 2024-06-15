package com.skylightmodding.beautifulworld.effects;

import com.skylightmodding.beautifulworld.init.BWMobEffects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ImmunityEffect extends MobEffect {
    public ImmunityEffect() { super(MobEffectCategory.BENEFICIAL, 0x56CBFD); }

    //@Override
    public void applyEffectTick(LivingEntity entity, int p_19468_) {
        if (entity.hasEffect(BWMobEffects.INFECTION.get())) {      /* `if` dosent work */
            entity.removeEffect(BWMobEffects.INFECTION.get());
        }
    }
}