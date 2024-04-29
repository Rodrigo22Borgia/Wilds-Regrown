package com.rodrigo;

import com.rodrigo.item.WRItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.PillarBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.registry.Registries;
import org.apache.commons.lang3.text.WordUtils;

import static com.rodrigo.WildsRegrown.MOD_ID;


public class WildsRegrownDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		WildsRegrown.LOGGER.info("Generating files");
		FabricDataGenerator.Pack pack = generator.createPack();

		pack.addProvider(GWLangProvider::new);
		pack.addProvider(GWModelGenerator::new);
	}

	private static class GWLangProvider extends FabricLanguageProvider {
		private GWLangProvider(FabricDataOutput dataGenerator) {
			// Specifying en_us is optional, by default is en_us.
			super(dataGenerator, "en_us");
		}

		@Override
		public void generateTranslations(TranslationBuilder translationBuilder) {
			//translationBuilder.add(GWBlocks.TOPAZ, "Topaz Block");

			Registries.ITEM.forEach(item -> { if (item.getTranslationKey().startsWith("item." + MOD_ID)) {
				translationBuilder.add(item, WordUtils.capitalize(item.toString().replace('_',' ')));
			}});
			Registries.BLOCK.forEach(block -> { if (block.getTranslationKey().startsWith("block." + MOD_ID)) {
				translationBuilder.add(block, WordUtils.capitalize(block.asItem().toString().replace('_',' ')));
			}});
		}
	}

	private static class GWModelGenerator extends FabricModelProvider {
		//public static Block SIMPLE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "simple_block"), new Block(...));
		//public static BlockItem SIMPLE_BLOCK_ITEM = Registry.register(Registries.ITEM, ..., new BlockItem(SIMPLE_BLOCK, ...));

		private GWModelGenerator(FabricDataOutput generator) {
			super(generator);
		}

		@Override
		public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
			//blockStateModelGenerator.registerSimpleCubeAll(GWBlocks.topaz_block);
			Registries.BLOCK.forEach(block -> {
				String id = block.getTranslationKey();
				if (id.startsWith("block." + MOD_ID)) {
					if (block instanceof PillarBlock) {
						blockStateModelGenerator.registerAxisRotated(block, TexturedModel.CUBE_COLUMN);}
					else {
						blockStateModelGenerator.registerSimpleCubeAll(block);
					}
				}});
		}

		@Override
		public void generateItemModels(ItemModelGenerator itemModelGenerator) {
			//itemModelGenerator.register(SIMPLE_BLOCK_ITEM, Models.GENERATED);
			itemModelGenerator.register(WRItems.ROCK, Models.GENERATED);
		}
	}
}