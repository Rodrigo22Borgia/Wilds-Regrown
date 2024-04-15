package com.rodrigo.item;

import com.rodrigo.GeoWorks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public record GWItems() {
    public static final Item ROCK = registerItem("rock", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire_cluster", new Item(new FabricItemSettings()));
    public static final Item AMETHYST = registerItem("amethyst", new Item(new FabricItemSettings()));

    private static void addToTabIngredients(FabricItemGroupEntries enteries) {
        enteries.add(ROCK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GeoWorks.MOD_ID, name), item);
    }
    public static void registerItems() {
        GeoWorks.LOGGER.info("Registering items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(GWItems::addToTabIngredients);
    }

}
