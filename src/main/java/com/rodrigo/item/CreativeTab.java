package com.rodrigo.item;

import com.rodrigo.GeoWorks;
import com.rodrigo.block.GWBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.rodrigo.GeoWorks.MOD_ID;

public class CreativeTab {
    public static final ItemGroup GW_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(GWItems.ROCK)).entries((displayContext, entries) -> {
                        entries.add(GWItems.ROCK);
                        entries.add(GWBlocks.topaz_block);
                        entries.add(GWBlocks.cherry_planks);
                        entries.add(GWBlocks.maple_planks);
                        entries.add(GWBlocks.mahogany_planks);
                        entries.add(GWBlocks.palm_planks);
                        entries.add(GWBlocks.baobab_planks);
                        entries.add(GWBlocks.cedar_planks);
                        entries.add(GWBlocks.mangrove_planks);
                        entries.add(GWBlocks.beech_planks);
                        entries.add(GWBlocks.ebony_planks);
                        entries.add(GWBlocks.pine_planks);
                        entries.add(GWBlocks.redwood_planks);
                        entries.add(GWBlocks.plum_planks);
                        entries.add(GWBlocks.citrus_planks);
                        entries.add(GWBlocks.jacaranda_planks);
                        entries.add(GWBlocks.willow_planks);
                        entries.add(GWBlocks.rosaceae_planks);
                        entries.add(GWBlocks.eucalyptus_planks);
                        entries.add(GWBlocks.glowing_planks);
                        entries.add(GWBlocks.baobab_log);
                        entries.add(GWBlocks.baobab_stripped_log);
                        entries.add(GWBlocks.beech_log);
                        entries.add(GWBlocks.beech_stripped_log);
                        entries.add(GWBlocks.cedar_log);
                        entries.add(GWBlocks.cedar_stripped_log);
                        entries.add(GWBlocks.cherry_log);
                        entries.add(GWBlocks.cherry_stripped_log);
                        entries.add(GWBlocks.citrus_log);
                        entries.add(GWBlocks.citrus_stripped_log);
                        entries.add(GWBlocks.ebony_log);
                        entries.add(GWBlocks.ebony_stripped_log);
                        entries.add(GWBlocks.eucalyptus_log);
                        entries.add(GWBlocks.eucalyptus_stripped_log);
                        entries.add(GWBlocks.glowing_log);
                        entries.add(GWBlocks.glowing_stripped_log);
                        entries.add(GWBlocks.jacaranda_log);
                        entries.add(GWBlocks.jacaranda_stripped_log);
                        entries.add(GWBlocks.mahogany_log);
                        entries.add(GWBlocks.mahogany_stripped_log);
                        entries.add(GWBlocks.mangrove_log);
                        entries.add(GWBlocks.mangrove_stripped_log);
                        entries.add(GWBlocks.maple_log);
                        entries.add(GWBlocks.maple_stripped_log);
                        entries.add(GWBlocks.palm_log);
                        entries.add(GWBlocks.palm_stripped_log);
                        entries.add(GWBlocks.pine_log);
                        entries.add(GWBlocks.pine_stripped_log);
                        entries.add(GWBlocks.plum_log);
                        entries.add(GWBlocks.plum_stripped_log);
                        entries.add(GWBlocks.rainbow_eucalyptus_log);
                        entries.add(GWBlocks.redwood_log);
                        entries.add(GWBlocks.redwood_stripped_log);
                        entries.add(GWBlocks.rosaceae_log);
                        entries.add(GWBlocks.rosaceae_stripped_log);
                        entries.add(GWBlocks.willow_log);
                        entries.add(GWBlocks.willow_stripped_log);
                    }).build());

    public static void registerItemGroups() {
        GeoWorks.LOGGER.info("Registering CreativeTab");
    }
}