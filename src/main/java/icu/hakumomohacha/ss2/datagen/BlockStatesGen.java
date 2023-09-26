package icu.hakumomohacha.ss2.datagen;

import icu.hakumomohacha.ss2.blocks.BlockRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;
import java.util.stream.Collectors;

public class BlockStatesGen extends BlockStateProvider {
    public BlockStatesGen(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);

    }
    @Override
    protected void registerStatesAndModels() {
        //读者可以选择使用把某些方块抽象成一个接口来批量生成
        //如下例
            /*Collection<RegistryObject<Block>> entries = BlockRegistry.BLOCKS.getEntries();
            entries.stream().map(RegistryObject::get)
                    .filter(block -> block instanceof RotatedPillarBlock)
                    .map(block -> (RotatedPillarBlock) block)
                    .forEach(this::logBlock);
*/
    }
}
