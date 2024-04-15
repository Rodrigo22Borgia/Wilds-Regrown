package com.rodrigo;

import com.rodrigo.block.GWBlocks;
import com.rodrigo.item.CreativeTab;
import com.rodrigo.item.GWItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeoWorks implements ModInitializer {
	public static final String MOD_ID = "geoworks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GWItems.registerItems();
		GWBlocks.registerBlocks();
		CreativeTab.registerItemGroups();
	}
}