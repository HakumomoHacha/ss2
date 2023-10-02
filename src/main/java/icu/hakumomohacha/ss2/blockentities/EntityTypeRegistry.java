package icu.hakumomohacha.ss2.blockentities;

import icu.hakumomohacha.ss2.Utils;
import icu.hakumomohacha.ss2.blocks.BlockRegistry;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypeRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Utils.mod_id);
    public static final RegistryObject<BlockEntityType<MoonHanaBlockEntity>> moonHanaBlockEntity =
            BLOCK_ENTITIES.register("moon_hana_block_entity",()-> BlockEntityType.Builder.
                    of(MoonHanaBlockEntity::new, BlockRegistry.MOON_HANA.get()).build(null));
}
