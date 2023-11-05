package com.skylightmodding.beautifulworld.blocks.custom;

import com.skylightmodding.beautifulworld.init.BWBlocks;
import com.skylightmodding.beautifulworld.init.BWItems;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class FruitfulPitahayaLeaves extends LeavesBlock {
    public FruitfulPitahayaLeaves (BlockBehaviour.Properties properties) { super(properties); }

    public InteractionResult use(BlockState p_57275_, Level p_57276_, BlockPos p_57277_, Player p_57278_, InteractionHand p_57279_, BlockHitResult p_57280_) {
        int number = p_57276_.random.nextInt(1,3);

        popResource(p_57276_, p_57277_, new ItemStack(BWItems.PITAHAYA.get(), number));
        p_57276_.playSound((Player)null, p_57277_, SoundEvents.CAVE_VINES_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
        p_57276_.setBlock(p_57277_, BWBlocks.PITAHAYA_LEAVES.get().defaultBlockState(), 1);

        return InteractionResult.sidedSuccess(p_57276_.isClientSide);
    }
}
