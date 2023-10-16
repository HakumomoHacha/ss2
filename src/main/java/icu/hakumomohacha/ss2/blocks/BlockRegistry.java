package icu.hakumomohacha.ss2.blocks;

import icu.hakumomohacha.ss2.Utils;
import icu.hakumomohacha.ss2.level.tree.CherryTreeGrower;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FlowerBlock;
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
    public static final RegistryObject<FlowerBlock> CHERRY_HANA = BLOCKS.register("cherry_hana", CherryHana::new);
    public static final RegistryObject<FlowerBlock> MOON_HANA = BLOCKS.register("moon_hana", MoonHana::new);
    public static final RegistryObject<DoorBlock> CHERRY_DOOR = BLOCKS.register("cherry_door", CherryDoor::new);
    public static final RegistryObject<Block> SPRING_LOG = BLOCKS.register("spring_log", SpringLog::new);
    public static final RegistryObject<DoorBlock> SPRING_DOOR = BLOCKS.register("spring_door", SpringDoor::new);
    public static final RegistryObject<Block> SPRING_WOOD = BLOCKS.register("spring_wood", SpringWood::new);
    public static final RegistryObject<Block> SPRING_LEAVES = BLOCKS.register("spring_leaves", SpringLeaves::new);

    public static final RegistryObject<Block> CHERRY_SAPLING = BLOCKS.register("cherry_sapling", CherrySapling::new);
}
