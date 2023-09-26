package icu.hakumomohacha.ss2.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CherryWood extends Block {
    public CherryWood() {
        super(Properties.of(Material.WOOD).sound(SoundType.WOOD));
    }
}
