package com.rodrigo.block;

import com.rodrigo.GeoWorks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GWBlocks {
    public static final Block topaz_block = registerBlock("topaz_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    //PLANKS
    public static final Block cherry_planks =  registerBlock("cherry_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block maple_planks =  registerBlock("maple_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block mahogany_planks =  registerBlock("mahogany_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block palm_planks =  registerBlock("palm_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block baobab_planks =  registerBlock("baobab_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block cedar_planks =  registerBlock("cedar_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block mangrove_planks =  registerBlock("mangrove_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block beech_planks =  registerBlock("beech_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block ebony_planks =  registerBlock("ebony_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block pine_planks =  registerBlock("pine_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block redwood_planks =  registerBlock("redwood_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block plum_planks =  registerBlock("plum_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block citrus_planks =  registerBlock("citrus_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block jacaranda_planks =  registerBlock("jacaranda_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block willow_planks =  registerBlock("willow_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block rosaceae_planks =  registerBlock("rosaceae_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block eucalyptus_planks =  registerBlock("eucalyptus_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block glowing_planks =  registerBlock("glowing_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));

    //LOGS
    public static final Block baobab_log = registerBlock("baobab_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block baobab_stripped_log = registerBlock("baobab_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block beech_log = registerBlock("beech_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block beech_stripped_log = registerBlock("beech_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block cedar_log = registerBlock("cedar_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block cedar_stripped_log = registerBlock("cedar_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block cherry_log = registerBlock("cherry_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block cherry_stripped_log = registerBlock("cherry_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block citrus_log = registerBlock("citrus_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block citrus_stripped_log = registerBlock("citrus_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block ebony_log = registerBlock("ebony_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block ebony_stripped_log = registerBlock("ebony_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block eucalyptus_log = registerBlock("eucalyptus_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block eucalyptus_stripped_log = registerBlock("eucalyptus_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block glowing_log = registerBlock("glowing_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block glowing_stripped_log = registerBlock("glowing_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block jacaranda_log = registerBlock("jacaranda_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block jacaranda_stripped_log = registerBlock("jacaranda_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block mahogany_log = registerBlock("mahogany_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block mahogany_stripped_log = registerBlock("mahogany_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block mangrove_log = registerBlock("mangrove_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block mangrove_stripped_log = registerBlock("mangrove_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block maple_log = registerBlock("maple_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block maple_stripped_log = registerBlock("maple_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block palm_log = registerBlock("palm_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block palm_stripped_log = registerBlock("palm_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block pine_log = registerBlock("pine_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block pine_stripped_log = registerBlock("pine_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block plum_log = registerBlock("plum_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block plum_stripped_log = registerBlock("plum_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block rainbow_eucalyptus_log = registerBlock("rainbow_eucalyptus_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block redwood_log = registerBlock("redwood_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block redwood_stripped_log = registerBlock("redwood_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block rosaceae_log = registerBlock("rosaceae_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block rosaceae_stripped_log = registerBlock("rosaceae_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block willow_log = registerBlock("willow_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));
    public static final Block willow_stripped_log = registerBlock("willow_stripped_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(GeoWorks.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(GeoWorks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerBlocks() {
        GeoWorks.LOGGER.info("Registering blocks");
    }
}
