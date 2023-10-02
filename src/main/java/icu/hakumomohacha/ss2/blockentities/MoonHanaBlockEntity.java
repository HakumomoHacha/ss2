package icu.hakumomohacha.ss2.blockentities;

import icu.hakumomohacha.ss2.blocks.MoonHana;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MoonHanaBlockEntity extends BlockEntity{

    public MoonHanaBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(EntityTypeRegistry.moonHanaBlockEntity.get(), pPos, pBlockState);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, BlockEntity pBlockEntity) {
        if (pLevel.isDay()) {
            pLevel.setBlock(pPos,pState.setValue(MoonHana.OPENSTATE, 0),3);
        } else if (pLevel.isNight()) {
            pLevel.setBlock(pPos,pState.setValue(MoonHana.OPENSTATE, 1),3);
        }
        pLevel.blockUpdated(pPos,pState.getBlock());
    }

    @Override
    public CompoundTag getUpdateTag() {
        return super.getUpdateTag();
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
    }
}
