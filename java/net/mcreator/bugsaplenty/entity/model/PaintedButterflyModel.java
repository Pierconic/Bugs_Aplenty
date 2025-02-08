package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.PaintedButterflyEntity;

public class PaintedButterflyModel extends GeoModel<PaintedButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(PaintedButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaintedButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaintedButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
