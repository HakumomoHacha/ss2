package icu.hakumomohacha.ss2.blocks;

import icu.hakumomohacha.ss2.Utils;
import icu.hakumomohacha.ss2.level.tree.CherryTreeGrower;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.mod_id);

    public static final RegistryObject<Block> SEASON_DIRT = BLOCKS.register("season_dirt", SeasonDirt::new);
    public static final RegistryObject<Block> SEASON_STONE = BLOCKS.register("season_stone", SeasonStone::new);
    public static final RegistryObject<Block> SPRING_GRASS_BLOCK = BLOCKS.register("spring_grass_block", SpringGrassBlock::new);
    public static final RegistryObject<Block> CHERRY_GRASS_BLOCK = BLOCKS.register("cherry_grass_block", CherryGrassBlock::new);
    public static final RegistryObject<Block> CHERRY_LEAVES = BLOCKS.register("cherry_leaves", CherryLeaves::new);
    public static final RegistryObject<Block> CHERRY_WOOD = BLOCKS.register("cherry_wood", CherryWood::new);
    public static final RegistryObject<Block> CHERRY_LOG = BLOCKS.register("cherry_log", CherryLog::new);
    public static final RegistryObject<Block> CHERRY_HANA = BLOCKS.register("cherry_hana", CherryHana::new);
    public static final RegistryObject<Block> MOON_HANA = BLOCKS.register("moon_hana", MoonHana::new);

    public static final RegistryObject<Block> CHERRY_SAPLING = BLOCKS.register("cherry_sapling", CherrySapling::new);
}
