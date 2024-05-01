package com.rodrigo.block;

import com.google.common.collect.ImmutableMap;
import com.rodrigo.WildsRegrown;
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

public class WRBlocks {
    public static final Block topaz_block = registerBlock("topaz_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    //PLANKS
    private static Block planks(String id) {return registerBlock(id, new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));}
    public static final Block cherry_planks     = planks("cherry_planks"    );
    public static final Block maple_planks      = planks("maple_planks"     );
    public static final Block mahogany_planks   = planks("mahogany_planks"  );
    public static final Block palm_planks       = planks("palm_planks"      );
    public static final Block baobab_planks     = planks("baobab_planks"    );
    public static final Block cedar_planks      = planks("cedar_planks"     );
    public static final Block mangrove_planks   = planks("mangrove_planks"  );
    public static final Block beech_planks      = planks("beech_planks"     );
    public static final Block ebony_planks      = planks("ebony_planks"     );
    public static final Block pine_planks       = planks("pine_planks"      );
    public static final Block redwood_planks    = planks("redwood_planks"   );
    public static final Block plum_planks       = planks("plum_planks"      );
    public static final Block citrus_planks     = planks("citrus_planks"    );
    public static final Block jacaranda_planks  = planks("jacaranda_planks" );
    public static final Block willow_planks     = planks("willow_planks"    );
    public static final Block rosaceae_planks   = planks("rosaceae_planks"  );
    public static final Block eucalyptus_planks = planks("eucalyptus_planks");
    public static final Block glowing_planks    = planks("glowing_planks"   );

    //LOGS
    private static Block logs(String id) {return registerBlock(id, new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG)));}
    public static final Block baobab_log              = logs("baobab_log"            );
    public static final Block baobab_stripped_log     = logs("baobab_stripped_log"   );
    public static final Block beech_log               = logs("beech_log"             );
    public static final Block beech_stripped_log      = logs("beech_stripped_log"    );
    public static final Block cedar_log               = logs("cedar_log"             );
    public static final Block cedar_stripped_log      = logs("cedar_stripped_log"    );
    public static final Block cherry_log              = logs("cherry_log"            );
    public static final Block cherry_stripped_log     = logs("cherry_stripped_log"   );
    public static final Block citrus_log              = logs("citrus_log"            );
    public static final Block citrus_stripped_log     = logs("citrus_stripped_log"   );
    public static final Block ebony_log               = logs("ebony_log"             );
    public static final Block ebony_stripped_log      = logs("ebony_stripped_log"    );
    public static final Block eucalyptus_log          = logs("eucalyptus_log"        );
    public static final Block eucalyptus_stripped_log = logs("eucalyptus_stripped_log");
    public static final Block glowing_log             = logs("glowing_log"           );
    public static final Block glowing_stripped_log    = logs("glowing_stripped_log"  );
    public static final Block jacaranda_log           = logs("jacaranda_log"         );
    public static final Block jacaranda_stripped_log  = logs("jacaranda_stripped_log");
    public static final Block mahogany_log            = logs("mahogany_log"          );
    public static final Block mahogany_stripped_log   = logs("mahogany_stripped_log" );
    public static final Block mangrove_log            = logs("mangrove_log"          );
    public static final Block mangrove_stripped_log   = logs("mangrove_stripped_log" );
    public static final Block maple_log               = logs("maple_log"             );
    public static final Block maple_stripped_log      = logs("maple_stripped_log"    );
    public static final Block palm_log                = logs("palm_log"              );
    public static final Block palm_stripped_log       = logs("palm_stripped_log"     );
    public static final Block pine_log                = logs("pine_log"              );
    public static final Block pine_stripped_log       = logs("pine_stripped_log"     );
    public static final Block plum_log                = logs("plum_log"              );
    public static final Block plum_stripped_log       = logs("plum_stripped_log"     );
    public static final Block rainbow_eucalyptus_log  = logs("rainbow_eucalyptus_log");
    public static final Block redwood_log             = logs("redwood_log"           );
    public static final Block redwood_stripped_log    = logs("redwood_stripped_log"  );
    public static final Block rosaceae_log            = logs("rosaceae_log"          );
    public static final Block rosaceae_stripped_log   = logs("rosaceae_stripped_log" );
    public static final Block willow_log              = logs("willow_log"            );
    public static final Block willow_stripped_log     = logs("willow_stripped_log"   );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(WildsRegrown.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(WildsRegrown.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerBlocks() {
        WildsRegrown.LOGGER.info("Registering blocks");
    }
    public static final ImmutableMap<Block, Block> STRIPPED = new ImmutableMap.Builder().put(WRBlocks.baobab_log, WRBlocks.baobab_stripped_log).build();
}
