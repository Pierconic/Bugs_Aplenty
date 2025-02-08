package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.BeetleBlackSpottedShinyEntity;

public class BeetleBlackSpottedShinyModel extends GeoModel<BeetleBlackSpottedShinyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeetleBlackSpottedShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/beetle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeetleBlackSpottedShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/beetle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeetleBlackSpottedShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
