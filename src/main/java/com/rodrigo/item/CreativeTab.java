package com.rodrigo.item;

import com.rodrigo.WildsRegrown;
import com.rodrigo.block.WRBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.rodrigo.WildsRegrown.MOD_ID;

public class CreativeTab {
    public static final ItemGroup GW_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(WRItems.ROCK)).entries((displayContext, entries) -> {
                        entries.add(WRItems.ROCK);
                        entries.add(WRBlocks.topaz_block);
                        entries.add(WRBlocks.cherry_planks);
                        entries.add(WRBlocks.maple_planks);
                        entries.add(WRBlocks.mahogany_planks);
                        entries.add(WRBlocks.palm_planks);
                        entries.add(WRBlocks.baobab_planks);
                        entries.add(WRBlocks.cedar_planks);
                        entries.add(WRBlocks.mangrove_planks);
                        entries.add(WRBlocks.beech_planks);
                        entries.add(WRBlocks.ebony_planks);
                        entries.add(WRBlocks.pine_planks);
                        entries.add(WRBlocks.redwood_planks);
                        entries.add(WRBlocks.plum_planks);
                        entries.add(WRBlocks.citrus_planks);
                        entries.add(WRBlocks.jacaranda_planks);
                        entries.add(WRBlocks.willow_planks);
                        entries.add(WRBlocks.rosaceae_planks);
                        entries.add(WRBlocks.eucalyptus_planks);
                        entries.add(WRBlocks.glowing_planks);
                        entries.add(WRBlocks.baobab_log);
                        entries.add(WRBlocks.baobab_stripped_log);
                        entries.add(WRBlocks.beech_log);
                        entries.add(WRBlocks.beech_stripped_log);
                        entries.add(WRBlocks.cedar_log);
                        entries.add(WRBlocks.cedar_stripped_log);
                        entries.add(WRBlocks.cherry_log);
                        entries.add(WRBlocks.cherry_stripped_log);
                        entries.add(WRBlocks.citrus_log);
                        entries.add(WRBlocks.citrus_stripped_log);
                        entries.add(WRBlocks.ebony_log);
                        entries.add(WRBlocks.ebony_stripped_log);
                        entries.add(WRBlocks.eucalyptus_log);
                        entries.add(WRBlocks.eucalyptus_stripped_log);
                        entries.add(WRBlocks.glowing_log);
                        entries.add(WRBlocks.glowing_stripped_log);
                        entries.add(WRBlocks.jacaranda_log);
                        entries.add(WRBlocks.jacaranda_stripped_log);
                        entries.add(WRBlocks.mahogany_log);
                        entries.add(WRBlocks.mahogany_stripped_log);
                        entries.add(WRBlocks.mangrove_log);
                        entries.add(WRBlocks.mangrove_stripped_log);
                        entries.add(WRBlocks.maple_log);
                        entries.add(WRBlocks.maple_stripped_log);
                        entries.add(WRBlocks.palm_log);
                        entries.add(WRBlocks.palm_stripped_log);
                        entries.add(WRBlocks.pine_log);
                        entries.add(WRBlocks.pine_stripped_log);
                        entries.add(WRBlocks.plum_log);
                        entries.add(WRBlocks.plum_stripped_log);
                        entries.add(WRBlocks.rainbow_eucalyptus_log);
                        entries.add(WRBlocks.redwood_log);
                        entries.add(WRBlocks.redwood_stripped_log);
                        entries.add(WRBlocks.rosaceae_log);
                        entries.add(WRBlocks.rosaceae_stripped_log);
                        entries.add(WRBlocks.willow_log);
                        entries.add(WRBlocks.willow_stripped_log);
                    }).build());

    public static void registerItemGroups() {
        WildsRegrown.LOGGER.info("Registering CreativeTab");
    }
}