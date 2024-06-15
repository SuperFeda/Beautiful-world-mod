package com.skylightmodding.beautifulworld.items.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;

public class RhodiumSword extends SwordItem {
    public RhodiumSword(Tier tier, Item.Properties properties) { super(tier,6,-2.30F, properties); }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment != Enchantments.FIRE_ASPECT && super.canApplyAtEnchantingTable(stack, enchantment);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return !EnchantmentHelper.getEnchantments(book).containsKey(Enchantments.FIRE_ASPECT) && super.isBookEnchantable(stack, book);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);

        if (result && !target.getLevel().isClientSide() && !target.fireImmune()) {
            target.setSecondsOnFire(15);
        } else {
            for (int var1 = 0; var1 < 20; ++var1) {
                double px = target.getX() + target.getLevel().getRandom().nextFloat() * target.getBbWidth() * 2.0F - target.getBbWidth();
                double py = target.getY() + target.getLevel().getRandom().nextFloat() * target.getBbHeight();
                double pz = target.getZ() + target.getLevel().getRandom().nextFloat() * target.getBbWidth() * 2.0F - target.getBbWidth();
                target.getLevel().addParticle(ParticleTypes.FLAME, px, py, pz, 0.02, 0.02, 0.02);
            }
        }

        return result;
    }
}
