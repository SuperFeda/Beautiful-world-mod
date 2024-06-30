package com.skylightmodding;

import com.skylightmodding.init.BWItemGroups;
import com.skylightmodding.init.BWBlocks;
import com.skylightmodding.init.BWItems;

import com.skylightmodding.init.BWStatusEffects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeautifulWorld implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("beautifulworld");
	public static final String MOD_ID = "beautifulworld";

	@Override
	public void onInitialize() {
		StrippableBlockRegistry.register(BWBlocks.PITAHAYA_TREE_WOOD.getBlock(), BWBlocks.STRIPPED_PITAHAYA_TREE_WOOD.getBlock());
		StrippableBlockRegistry.register(BWBlocks.PITAHAYA_TREE_LOG.getBlock(), BWBlocks.STRIPPED_PITAHAYA_TREE_LOG.getBlock());

		BWItems.registerModItems();
		BWBlocks.registerModBlocks();
		BWStatusEffects.registerModEffects();

		Registry.register(Registries.ITEM_GROUP, new Identifier("beautifulworld", "items"), BWItemGroups.ITEMS_TAB);
		Registry.register(Registries.ITEM_GROUP, new Identifier("beautifulworld", "blocks"), BWItemGroups.BLOCKS_TAB);
		Registry.register(Registries.ITEM_GROUP, new Identifier("beautifulworld", "equipment"), BWItemGroups.EQUIPMENT_TAB);
	}
}
