package com.example;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import net.minecraft.core.Registry;

public class ModBlocks {
    public static final Block RUBY_ORE;
    public static final Item RUBY_ORE_ITEM;

    public static final Block DEEPSLATE_RUBY_ORE;
    public static final Item DEEPSLATE_RUBY_ORE_ITEM;

    public static final Block RUBY_BLOCK;
    public static final Item RUBY_BLOCK_ITEM;

    public static final Block ROUGH_RUBY_BLOCK;
    public static final Item ROUGH_RUBY_BLOCK_ITEM;

    static {
        RUBY_ORE = new Block(
                BlockBehaviour.Properties.of()
                        .strength(3.0F, 3.0F)
                        .requiresCorrectToolForDrops()
        );
        RUBY_ORE_ITEM = new BlockItem(
                RUBY_ORE,
                new Item.Properties()
        );

        DEEPSLATE_RUBY_ORE = new Block(
                BlockBehaviour.Properties.of()
                        .strength(4.5F, 3.0F)
                        .requiresCorrectToolForDrops()
                );
        DEEPSLATE_RUBY_ORE_ITEM = new BlockItem(
                DEEPSLATE_RUBY_ORE,
                new Item.Properties()
        );

        RUBY_BLOCK = new Block(
                BlockBehaviour.Properties.of()
                        .strength(5.0F, 6.0F)
        );
        RUBY_BLOCK_ITEM = new BlockItem(
                RUBY_BLOCK,
                new Item.Properties()
        );

        ROUGH_RUBY_BLOCK = new Block(
                BlockBehaviour.Properties.of()
                        .strength(5.0F, 6.0F)
        );
        ROUGH_RUBY_BLOCK_ITEM = new BlockItem(
                ROUGH_RUBY_BLOCK,
                new Item.Properties()
        );


    }

    public static void initialize(){

        //-----Block and BlockItems Registry-----//

        //RUBY_ORE
        Registry.register(
                BuiltInRegistries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "ruby_ore"),
                RUBY_ORE
        );
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "ruby_ore"),
                RUBY_ORE_ITEM
        );
        //DEEPSLATE_RUBY_ORE
        Registry.register(
                BuiltInRegistries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "deepslate_ruby_ore"),
                DEEPSLATE_RUBY_ORE
        );
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "deepslate_ruby_ore"),
                DEEPSLATE_RUBY_ORE_ITEM
        );
        //RUBY_BLOCK
        Registry.register(
                BuiltInRegistries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "ruby_block"),
                RUBY_BLOCK
        );
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "ruby_block"),
                RUBY_BLOCK_ITEM
        );
        //ROUGH_RUBY_BLOCK
        Registry.register(
                BuiltInRegistries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "rough_ruby_block"),
                ROUGH_RUBY_BLOCK
        );
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "rough_ruby_block"),
                ROUGH_RUBY_BLOCK_ITEM
        );


        //-----Creative Inventory Addition-----//
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS)
                .register(entries -> {
                    entries.accept(RUBY_ORE_ITEM);
                    entries.accept(DEEPSLATE_RUBY_ORE_ITEM);
                });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS)
                .register(entries -> {
                    entries.accept(RUBY_BLOCK_ITEM);
                    entries.accept(ROUGH_RUBY_BLOCK_ITEM);
                });
    }
}
