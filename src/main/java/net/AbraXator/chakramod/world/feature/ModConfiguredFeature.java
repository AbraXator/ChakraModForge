package net.AbraXator.chakramod.world.feature;

import com.mojang.blaze3d.shaders.Uniform;
import net.AbraXator.chakramod.blocks.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;
import java.lang.module.Configuration;
import java.util.List;

public class ModConfiguredFeature {
    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> HEART_GEODE =
            FeatureUtils.register("heart_geode", Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(ModBlocks.HEART_ORE.get()),
                            BlockStateProvider.simple(ModBlocks.GREEN_CRYSTAL.get()),
                            BlockStateProvider.simple(ModBlocks.GREEN_MINERAL.get()),
                            BlockStateProvider.simple(ModBlocks.BLACK_MINERAL.get()),
                            List.of(ModBlocks.BLACK_MINERAL.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                            new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D,
                            true, UniformInt.of(3, 8),
                            UniformInt.of(2, 6), UniformInt.of(1, 2),
                            -18, 18, 0.075D, 1));
}