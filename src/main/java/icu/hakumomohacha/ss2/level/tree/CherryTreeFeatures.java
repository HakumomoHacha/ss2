package icu.hakumomohacha.ss2.level.tree;


import icu.hakumomohacha.ss2.blocks.BlockRegistry;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class CherryTreeFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration,?>> HOLDER = FeatureUtils.register("cherry_tree", Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(BlockRegistry.CHERRY_LOG.get()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.simple(BlockRegistry.CHERRY_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2),ConstantInt.of(0),3),
            new TwoLayersFeatureSize(1,0,1)

    ).build());
}
