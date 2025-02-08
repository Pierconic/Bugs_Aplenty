package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.SapphireButterflyEntity;

public class SapphireButterflyModel extends GeoModel<SapphireButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(SapphireButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SapphireButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SapphireButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
