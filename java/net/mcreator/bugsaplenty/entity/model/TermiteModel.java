package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.TermiteEntity;

public class TermiteModel extends GeoModel<TermiteEntity> {
	@Override
	public ResourceLocation getAnimationResource(TermiteEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/termite.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TermiteEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/termite.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TermiteEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
