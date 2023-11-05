package com.skylightmodding.beautifulworld.items;

import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Rarity;

public class BWRarity {
    // Black list of color: WHITE, YELLOW, AQUA, LIGHT_PURPLE
    public static Rarity LEGEND = Rarity.create("legend", ChatFormatting.GOLD);
    public static Rarity MYTHIC = Rarity.create("mythic", ChatFormatting.RED);
    public static Rarity VIRUS = Rarity.create("virus", ChatFormatting.BLACK);
}