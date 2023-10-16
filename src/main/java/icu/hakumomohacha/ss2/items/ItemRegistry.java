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

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.mod_id);

    public static final RegistryObject<Item> SEASON_DIRT = formBlock("season_dirt", BlockRegistry.SEASON_DIRT);
    public static final RegistryObject<Item> SEASON_STONE = formBlock("season_stone", BlockRegistry.SEASON_STONE);
    public static final RegistryObject<Item> SPRING_GRASS_BLOCK = formBlock("spring_grass_block", BlockRegistry.SPRING_GRASS_BLOCK);
    public static final RegistryObject<Item> CHERRY_GRASS_BLOCK = formBlock("cherry_grass_block", BlockRegistry.CHERRY_GRASS_BLOCK);
    public static final RegistryObject<Item> CHERRY_LEAVES = formBlock("cherry_leaves", BlockRegistry.CHERRY_LEAVES);
    public static final RegistryObject<Item> CHERRY_WOOD = formBlock("cherry_wood", BlockRegistry.CHERRY_WOOD);
    public static final RegistryObject<Item> CHERRY_LOG = formBlock("cherry_log",BlockRegistry.CHERRY_LOG);
    public static final RegistryObject<Item> CHERRY_SAPLING = formBlock("cherry_sapling",BlockRegistry.CHERRY_SAPLING);
    public static final RegistryObject<Item> CHERRY_DOOR = ITEMS.register("cherry_door",()->new BlockItem(BlockRegistry.CHERRY_DOOR.get(),new Item.Properties().tab(SS2Group.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MOON_HANA = ITEMS.register("moon_hana",()->new BlockItem(BlockRegistry.MOON_HANA.get(),new Item.Properties().tab(SS2Group.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CHERRY_HANA = ITEMS.register("cherry_hana",()->new BlockItem(BlockRegistry.CHERRY_HANA.get(),new Item.Properties().tab(SS2Group.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> SPRING_LOG = formBlock("spring_log",BlockRegistry.SPRING_LOG);
    public static final RegistryObject<Item> SPRING_WOOD = formBlock("spring_wood",BlockRegistry.SPRING_WOOD);
    public static final RegistryObject<Item> SPRING_LEAVES= formBlock("spring_leaves",BlockRegistry.SPRING_LEAVES);
    public static final RegistryObject<Item> SPRING_DOOR = ITEMS.register("spring_door",()->new BlockItem(BlockRegistry.SPRING_DOOR.get(),new Item.Properties().tab(SS2Group.CREATIVE_MODE_TAB)));


    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().tab(SS2Group.CREATIVE_MODE_TAB);
    }

    private static RegistryObject<Item> formBlock(String name, RegistryObject<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
    }
}
