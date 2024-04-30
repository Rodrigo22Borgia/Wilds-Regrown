package com.rodrigo;

import com.rodrigo.block.WRBlocks;
import com.rodrigo.item.WRItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.PillarBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.apache.commons.lang3.text.WordUtils;

import java.util.concurrent.CompletableFuture;

import static com.rodrigo.WildsRegrown.MOD_ID;


public class WildsRegrownDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		WildsRegrown.LOGGER.info("Generating files");
		FabricDataGenerator.Pack pack = generator.createPack();

		pack.addProvider(WRLangProvider::new);
		pack.addProvider(WRModelGenerator::new);
		pack.addProvider(WRTagGenerator::new);
		pack.addProvider(WRLootTables::new);
	}

	private static class WRLangProvider extends FabricLanguageProvider {
		private WRLangProvider(FabricDataOutput dataGenerator) {
			// Specifying en_us is optional, by default is en_us.
			super(dataGenerator, "en_us");
		}

		@Override
		public void generateTranslations(TranslationBuilder translationBuilder) {
//Automatic EN translation from IDs
			Registries.ITEM.forEach(item -> { if (item.getTranslationKey().startsWith("item." + MOD_ID)) {
				translationBuilder.add(item, WordUtils.capitalize(item.toString().replace('_',' ')));
			}});
			Registries.BLOCK.forEach(block -> { if (block.getTranslationKey().startsWith("block." + MOD_ID)) {
				translationBuilder.add(block, WordUtils.capitalize(block.asItem().toString().replace('_',' ')));
			}});
		}
	}

	private static class WRModelGenerator extends FabricModelProvider {
		private WRModelGenerator(FabricDataOutput generator) {
			super(generator);
		}

		@Override
		public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//Block models, simple cube unless specified otherwise:
			Registries.BLOCK.forEach(block -> {
				String id = block.getTranslationKey();
				if (id.startsWith("block." + MOD_ID)) {
			// 'otherwise' ↓
					if (block instanceof PillarBlock) {
						blockStateModelGenerator.registerAxisRotated(block, TexturedModel.CUBE_COLUMN);}
					else {
						blockStateModelGenerator.registerSimpleCubeAll(block);
					}
				}});
		}

		@Override
		public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//Item models here:
			itemModelGenerator.register(WRItems.ROCK, Models.GENERATED);
		}
	}
	private static class WRTagGenerator extends FabricTagProvider.BlockTagProvider {
		public WRTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
			super(output, completableFuture);
		}

		@Override
		protected void configure(RegistryWrapper.WrapperLookup arg) {
//Add tags here
			var pickaxe = getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
			var axe = getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);

			pickaxe.add(WRBlocks.topaz_block);
//Axe mine-able:
			Registries.BLOCK.forEach(block -> {
				if (block.getTranslationKey().startsWith("block." + MOD_ID)
					&& (block.getTranslationKey().endsWith("planks")
					||	block.getTranslationKey().endsWith("log"))) {
				axe.add(block);
			}});
		}
	}
	private static class WRLootTables extends FabricBlockLootTableProvider {
		public WRLootTables(FabricDataOutput dataOutput) {
			super(dataOutput);
		}

		@Override
		public void generate() {
			Registries.BLOCK.forEach(block -> {
				if (block.getTranslationKey().startsWith("block." + MOD_ID)) {
				addDrop(block, drops(block.asItem()));
				}});
// ↑ By default blocks drop themselves, addDrop ↓ to override
			addDrop(WRBlocks.topaz_block, WRItems.ROCK);
		}
	}
}