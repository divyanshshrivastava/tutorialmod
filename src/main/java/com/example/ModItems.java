package com.example;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public class ModItems {
    public static final Item RUBY;
    public static final Item ROUGH_RUBY;

    static{
        RUBY = new Item(new Item.Properties());
        ROUGH_RUBY = new Item(new Item.Properties());
    }

    public static void initialize(){
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "ruby"),
                RUBY
        );
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "rough_ruby"),
                ROUGH_RUBY
        );
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> entries.accept(RUBY));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> entries.accept(ROUGH_RUBY));
    }
}
