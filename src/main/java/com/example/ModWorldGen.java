package com.example;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModWorldGen {

    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "ruby_ore")
            );
    public static final ResourceKey<PlacedFeature> DEEPSLATE_RUBY_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "deepslate_ruby_ore")
            );

    public static void initialize() {

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                RUBY_ORE_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                DEEPSLATE_RUBY_ORE_PLACED_KEY
        );

    }
}