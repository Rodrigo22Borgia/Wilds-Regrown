package com.rodrigo.item;

import com.rodrigo.WildsRegrown;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public record WRItems() {
    public static final Item ROCK = registerItem("rock", new Item(new FabricItemSettings()));

    private static void addToTabIngredients(FabricItemGroupEntries entries) {
        entries.add(ROCK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WildsRegrown.MOD_ID, name), item);
    }
    public static void registerItems() {
        WildsRegrown.LOGGER.info("Registering items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(WRItems::addToTabIngredients);
    }

}
