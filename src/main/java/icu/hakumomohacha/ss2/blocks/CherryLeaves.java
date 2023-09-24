package icu.hakumomohacha.ss2.blocks;

import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.material.Material;

public class CherryLeaves extends LeavesBlock {
    public CherryLeaves() {
        super(Properties.of(Material.LEAVES).noOcclusion());
    }
}
