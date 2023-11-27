package com.skylightmodding.beautifulworld.init;

import com.skylightmodding.beautifulworld.BeautifulWorld;
import com.skylightmodding.beautifulworld.effects.ImmunityEffect;
import com.skylightmodding.beautifulworld.effects.InfectionEffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BWMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BeautifulWorld.MODID);

    public static final RegistryObject<MobEffect> IMMUNITY = MOB_EFFECTS.register("immunity", ImmunityEffect::new);
    public static final RegistryObject<MobEffect> INFECTION = MOB_EFFECTS.register("infection", InfectionEffect::new);

    public static void register(IEventBus eventBus) { MOB_EFFECTS.register(eventBus); }
}
