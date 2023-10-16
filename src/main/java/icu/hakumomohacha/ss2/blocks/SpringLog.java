package icu.hakumomohacha.ss2.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class SpringLog extends RotatedPillarBlock {
    public SpringLog() {
        super(Properties.of(Material.WOOD,
                state -> (state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MaterialColor.WOOD
                        : MaterialColor.PODZOL)).sound(SoundType.WOOD));
        this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y));
    }
}
