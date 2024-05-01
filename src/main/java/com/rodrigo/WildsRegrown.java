package com.rodrigo;

import com.rodrigo.block.WRBlocks;
import com.rodrigo.item.CreativeTab;
import com.rodrigo.item.WRItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildsRegrown implements ModInitializer {
	public static final String MOD_ID = "wildsregrown";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		WRItems.registerItems();
		WRBlocks.registerBlocks();
		CreativeTab.registerItemGroups();
	}
}