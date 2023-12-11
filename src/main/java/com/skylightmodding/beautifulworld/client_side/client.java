package com.skylightmodding.beautifulworld.client_side;

import com.skylightmodding.beautifulworld.BeautifulWorld;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BeautifulWorld.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class client {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {}
}
