package icu.hakumomohacha.ss2.blocks;

import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class SpringLeaves extends LeavesBlock {
    public SpringLeaves() {
        super(Properties.of(Material.LEAVES).noOcclusion().sound(SoundType.GRASS).randomTicks().strength(0.2F));
        this.registerDefaultState(this.stateDefinition.any().setValue(DISTANCE, Integer.valueOf(7)).setValue(PERSISTENT, Boolean.valueOf(false)));
    }
}
