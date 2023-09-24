package icu.hakumomohacha.ss2.items;

import icu.hakumomohacha.ss2.Utils;
import icu.hakumomohacha.ss2.blocks.*;
import icu.hakumomohacha.ss2.modgroup.SS2Group;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.mod_id);

    public static final RegistryObject<Item> SEASON_DIRT = ITEMS.register("season_dirt", () -> new BlockItem(BlockRegistry.SEASON_DIRT.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEASON_STONE = ITEMS.register("season_stone", () -> new BlockItem(BlockRegistry.SEASON_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRING_GRASS_BLOCK = ITEMS.register("spring_grass_block", () -> new BlockItem(BlockRegistry.SPRING_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_GRASS_BLOCK = ITEMS.register("cherry_grass_block", () -> new BlockItem(BlockRegistry.CHERRY_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_LEAVES = ITEMS.register("cherry_leaves", () -> new BlockItem(BlockRegistry.CHERRY_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WOOD = ITEMS.register("cherry_wood", () -> new BlockItem(BlockRegistry.CHERRY_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_LOG = ITEMS.register("cherry_log", () -> new BlockItem(BlockRegistry.CHERRY_LOG.get(), new Item.Properties()));

    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().tab(SS2Group.SS2_GROUP);
    }

    private static RegistryObject<Item> formBlock(String name, RegistryObject<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
    }
}
