package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.ButterflyEntity;

public class ButterflyModel extends GeoModel<ButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(ButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
