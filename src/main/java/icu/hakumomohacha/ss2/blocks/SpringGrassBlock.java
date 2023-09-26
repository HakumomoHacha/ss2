package icu.hakumomohacha.ss2.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class SpringGrassBlock extends Block {
    public SpringGrassBlock() {
        super(Properties.of(Material.DIRT).sound(SoundType.GRAVEL));
    }
}
