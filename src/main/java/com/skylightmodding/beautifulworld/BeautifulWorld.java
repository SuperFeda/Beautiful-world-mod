package com.skylightmodding.beautifulworld;

import com.skylightmodding.beautifulworld.init.BWBlocks;
import com.skylightmodding.beautifulworld.init.BWItems;
import com.skylightmodding.beautifulworld.init.BWMobEffects;
import com.skylightmodding.beautifulworld.loot.BWModifires;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

import java.util.Locale;

@Mod(BeautifulWorld.MODID)
public class BeautifulWorld {
    public static final String MODID = "beautifulworld";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BeautifulWorld() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        BWItems.register(modEventBus);
        BWBlocks.register(modEventBus);
        BWMobEffects.register(modEventBus);
        BWModifires.LOOT_MODIFIERS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    public static ResourceLocation prefix(String name) { return new ResourceLocation(MODID, name.toLowerCase(Locale.ROOT)); }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
