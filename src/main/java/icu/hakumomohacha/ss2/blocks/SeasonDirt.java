package icu.hakumomohacha.ss2.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class SeasonDirt extends Block {
    public SeasonDirt() {
        super(Properties.of(Material.DIRT).sound(SoundType.GRAVEL));
    }
}
