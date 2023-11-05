package com.skylightmodding.beautifulworld.data;

import com.skylightmodding.beautifulworld.BeautifulWorld;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

public final class BeautifulWorldDimension {
    public static final ResourceKey<Level> BEAUTIFUL_WORLD = register("beautiful_world");
    
    public static ResourceKey<Level> register(String id) {
        return ResourceKey.create(Registries.DIMENSION, BeautifulWorld.prefix(id));
    }
}
