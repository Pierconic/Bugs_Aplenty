
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugsaplenty.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.bugsaplenty.BugsAplentyMod;

public class BugsAplentyModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, BugsAplentyMod.MODID);
	public static final DeferredHolder<Potion, Potion> LEVITATION_POTION = REGISTRY.register("levitation_potion", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 400, 0, false, true)));
}
