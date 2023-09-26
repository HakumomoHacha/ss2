package icu.hakumomohacha.ss2.level;

import icu.hakumomohacha.ss2.Utils;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.registries.DeferredRegister;

public class WorldGenerationRegistry {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> FEATURES = DeferredRegister
            .create(BuiltinRegistries.CONFIGURED_FEATURE.key(), Utils.mod_id);
}
