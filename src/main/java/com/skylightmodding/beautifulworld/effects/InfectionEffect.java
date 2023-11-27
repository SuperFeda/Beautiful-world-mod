package com.skylightmodding.beautifulworld.effects;

import com.skylightmodding.beautifulworld.init.BWMobEffects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class InfectionEffect extends MobEffect {
    public InfectionEffect() { super(MobEffectCategory.HARMFUL, 0x56CBFD); }

    public void applyEffectTick(LivingEntity entity, int p_19468_) {
        if (this == BWMobEffects.INFECTION.get()) {
            entity.hurt(entity.damageSources().wither(), 1.0F);
        } /*else {
            p_19467_.heal((float)Math.max(4 << p_19468_, 0));
        }*/
    }

    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        int i = 15 >> p_19456_; // i = 40          /*******************/
        if (i > 0) {
            return p_19455_ % i == 0;
        } else { return true; }
    }
}
