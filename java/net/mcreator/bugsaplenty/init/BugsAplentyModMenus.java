
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugsaplenty.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.bugsaplenty.world.inventory.TestMenu;
import net.mcreator.bugsaplenty.BugsAplentyMod;

public class BugsAplentyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, BugsAplentyMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TestMenu>> TEST = REGISTRY.register("test", () -> IMenuTypeExtension.create(TestMenu::new));
}
