package com.skylightmodding.beautifulworld.items.extra;

import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Rarity;

public class BWRarity {
    // Colors black list: WHITE, YELLOW, AQUA, LIGHT_PURPLE
    public static Rarity LEGEND = Rarity.create("legend", ChatFormatting.GOLD);
    public static Rarity MYTHIC = Rarity.create("mythic", ChatFormatting.RED);
    public static Rarity VIRUS = Rarity.create("virus", ChatFormatting.DARK_GRAY);
}