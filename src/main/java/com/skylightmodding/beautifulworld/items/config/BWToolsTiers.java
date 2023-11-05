package com.skylightmodding.beautifulworld.items.config;

import com.skylightmodding.beautifulworld.BeautifulWorld;
import com.skylightmodding.beautifulworld.init.BWItems;
import com.skylightmodding.beautifulworld.tags.BWTags;
import net.minecraft.world.item.Tier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class BWToolsTiers {
    public static Tier OVERLOUD;
    public static Tier RHODIUM;

    static {
        OVERLOUD = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2000, 9f, 3f, 24, BWTags.NEEDS_OVERLOUD_TOOL, () -> Ingredient.of(BWItems.OVERLOUD_INGOT.get())),
                new ResourceLocation(BeautifulWorld.MODID, "overloud"), List.of(Tiers.NETHERITE), List.of()
        );
    }

    static {
        RHODIUM = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2000, 9f, 3f, 24, BWTags.NEEDS_OVERLOUD_TOOL, () -> Ingredient.of(BWItems.RHODIUM_INGOT.get())),
                new ResourceLocation(BeautifulWorld.MODID, "rhodium"), List.of(Tiers.NETHERITE), List.of()
        );
    }
}