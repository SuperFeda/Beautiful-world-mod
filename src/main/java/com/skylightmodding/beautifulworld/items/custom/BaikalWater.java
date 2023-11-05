package com.skylightmodding.beautifulworld.items.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.ChatFormatting;
import org.jetbrains.annotations.Nullable;
import net.minecraft.network.chat.Component;

import java.util.List;

public class BaikalWater extends Item {
    public BaikalWater(Item.Properties p_41346_) { super(p_41346_); }

    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        super.finishUsingItem(stack, level, entity);

        if (entity != null) {
//          if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide()) _entity.addEffect(new MobEffectInstance(BeautifulworldModMobEffects.EMUNITY.get(), 3000, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3000, 19));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3000, 9));
            entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 3000, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3000, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3000, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3000, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 2));
        }

        if (stack.isEmpty()) {
            return new ItemStack(Items.GLASS_BOTTLE);
        } else {
            if (entity instanceof Player && !((Player)entity).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                Player player = (Player)entity;
                if (!player.getInventory().add(itemstack)) {
                    player.drop(itemstack, false);
                }
            }

            return stack;
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltips, TooltipFlag flags) {
        super.appendHoverText(stack, world, tooltips, flags);
        tooltips.add(Component.translatable("item.beautifulworld.baikal_water.desc").withStyle(ChatFormatting.GRAY));
    }

    public SoundEvent getEatingSound() { return SoundEvents.HONEY_DRINK; }
    public SoundEvent getDrinkingSound() { return SoundEvents.HONEY_DRINK; }
    public UseAnim getUseAnimation(ItemStack p_41358_) { return UseAnim.DRINK; }
//    public int getUseDuration(ItemStack p_41360_) { return 40; }

    public InteractionResultHolder<ItemStack> use(Level p_41352_, Player p_41353_, InteractionHand p_41354_) {
        return ItemUtils.startUsingInstantly(p_41352_, p_41353_, p_41354_);
    }
}
