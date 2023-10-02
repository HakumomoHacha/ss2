package icu.hakumomohacha.ss2.blocks;

import icu.hakumomohacha.ss2.level.tree.CherryTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CherrySapling extends SaplingBlock {
    public CherrySapling() {
        super(new CherryTreeGrower(), Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS));
    }

}
