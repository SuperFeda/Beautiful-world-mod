package com.skylightmodding.beautifulworld.loot;

import com.skylightmodding.beautifulworld.BeautifulWorld;
import com.skylightmodding.beautifulworld.init.BWItems;
import com.skylightmodding.beautifulworld.loot.modifires.RhodiumToolModifier;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class BWLootModifierGenerator extends GlobalLootModifierProvider {
    public BWLootModifierGenerator(PackOutput output) { super(output, BeautifulWorld.MODID); }

    @Override
    protected void start() {
        add("rhodium_smelting", new RhodiumToolModifier(new LootItemCondition[]{MatchTool.toolMatches(ItemPredicate.Builder.item().of(BWItems.RHODIUM_MULTITOOL.get())).build()}));
    }
}