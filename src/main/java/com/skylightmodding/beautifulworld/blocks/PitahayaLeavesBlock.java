package com.skylightmodding.beautifulworld.blocks;

public class PitahayaLeavesBlock {//extends BushBlock {
//    private static final float HURT_SPEED_THRESHOLD = 0.003F;
//    public static final int DECAY_DISTANCE = 7;
//    public static final IntegerProperty DISTANCE = BlockStateProperties.DISTANCE;
//    public static final BooleanProperty PERSISTENT = BlockStateProperties.PERSISTENT;
//    public static final int MAX_AGE = 1;
//    public static final IntegerProperty AGE = BlockStateProperties.AGE_1;
//
//    public PitahayaLeavesBlock(BlockBehaviour.Properties p_57249_) {
//        super(p_57249_);
//        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
//    }
//
//    public boolean isRandomlyTicking(BlockState p_57284_) { return p_57284_.getValue(AGE) < 1; }
//
//    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
//        int i = blockState.getValue(AGE);
////        if (this.decaying(blockState)) {
////            dropResources(blockState, serverLevel, blockPos);
////            serverLevel.removeBlock(blockPos, false);
////        }
//        if (i < 1 && serverLevel.getRawBrightness(blockPos.above(), 0) >= 9 && net.minecraftforge.common.ForgeHooks.onCropsGrowPre(serverLevel, blockPos, blockState, randomSource.nextInt(5) == 0)) {
//            BlockState blockstate = blockState.setValue(AGE, Integer.valueOf(i + 1));
//            serverLevel.setBlock(blockPos, blockstate, 2);
//            serverLevel.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(blockstate));
//            net.minecraftforge.common.ForgeHooks.onCropsGrowPost(serverLevel, blockPos, blockState);
//        }
//    }
//
////    public void entityInside(BlockState p_57270_, Level p_57271_, BlockPos p_57272_, Entity p_57273_) {
////        if (p_57273_ instanceof LivingEntity && p_57273_.getType() != EntityType.BEE) {
////            p_57273_.makeStuckInBlock(p_57270_, new Vec3((double)0.8F, 0.75D, (double)0.8F));
////            if (!p_57271_.isClientSide && p_57270_.getValue(AGE) > 0 && (p_57273_.xOld != p_57273_.getX() || p_57273_.zOld != p_57273_.getZ())) {
////                double d0 = Math.abs(p_57273_.getX() - p_57273_.xOld);
////                double d1 = Math.abs(p_57273_.getZ() - p_57273_.zOld);
//////                if (d0 >= (double)0.003F || d1 >= (double)0.003F) {
//////                    p_57273_.hurt(p_57271_.damageSources().sweetBerryBush(), 1.0F);
//////                }
////            }
////        }
////    }
//
//    public InteractionResult use(BlockState p_57275_, Level p_57276_, BlockPos p_57277_, Player p_57278_, InteractionHand p_57279_, BlockHitResult p_57280_) {
//        int i = p_57275_.getValue(AGE);
//        boolean flag = i == 1;
////        if (!flag && p_57278_.getItemInHand(p_57279_).is(Items.BONE_MEAL)) {
////            return InteractionResult.PASS;
//        if (i > 0) {
//            int j = 1 + p_57276_.random.nextInt(1);
//            popResource(p_57276_, p_57277_, new ItemStack(BWItems.RHODIUM.get(), j + (flag ? 1 : 0)));
//            p_57276_.playSound((Player)null, p_57277_, SoundEvents.CAVE_VINES_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
//            BlockState blockstate = p_57275_.setValue(AGE, Integer.valueOf(0));
//            p_57276_.setBlock(p_57277_, blockstate, 0);
//            p_57276_.gameEvent(GameEvent.BLOCK_CHANGE, p_57277_, GameEvent.Context.of(p_57278_, blockstate));
//            return InteractionResult.sidedSuccess(p_57276_.isClientSide);
//        } else { return super.use(p_57275_, p_57276_, p_57277_, p_57278_, p_57279_, p_57280_); }
//    }
//
//    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_57282_) { p_57282_.add(AGE); }
//    protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) { return true; }
}