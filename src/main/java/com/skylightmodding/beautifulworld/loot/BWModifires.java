package com.skylightmodding.beautifulworld.loot;

import com.skylightmodding.beautifulworld.BeautifulWorld;
import com.skylightmodding.beautifulworld.loot.modifires.RhodiumToolModifier;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BWModifires {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, BeautifulWorld.MODID);

    public static final RegistryObject<Codec<RhodiumToolModifier>> RHODIUM_SMELTING = LOOT_MODIFIERS.register("rhodium_smelting", () -> RhodiumToolModifier.CODEC);
}