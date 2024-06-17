package com.skylightmodding.beautifulworld.items;

import com.skylightmodding.beautifulworld.init.BWMobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.Level;

public class PitahayaItem extends Item {
    public PitahayaItem(Item.Properties p_41346_) { super(p_41346_); }

    public InteractionResultHolder<ItemStack> use(Level lvl, Player player, InteractionHand interactionHand) {
        return ItemUtils.startUsingInstantly(lvl, player, interactionHand);
    }

    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        entity.addEffect(new MobEffectInstance(BWMobEffects.IMMUNITY.get(), 1700, 0));
        return this.isEdible() ? entity.eat(level, stack) : stack;
    }
}
