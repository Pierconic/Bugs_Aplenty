package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.BeetleLimePlainShinyEntity;

public class BeetleLimePlainShinyModel extends GeoModel<BeetleLimePlainShinyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeetleLimePlainShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/beetle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeetleLimePlainShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/beetle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeetleLimePlainShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
