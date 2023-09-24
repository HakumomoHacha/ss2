package icu.hakumomohacha.ss2.blocks;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CherryDoor extends DoorBlock {
    public CherryDoor() {
        super(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(3.0F));
    }
}
