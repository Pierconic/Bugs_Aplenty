package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.BeetleBlueStripedShinyEntity;

public class BeetleBlueStripedShinyModel extends GeoModel<BeetleBlueStripedShinyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeetleBlueStripedShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/beetle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeetleBlueStripedShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/beetle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeetleBlueStripedShinyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
