package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.BeetleCyanSpottedEntity;

public class BeetleCyanSpottedModel extends GeoModel<BeetleCyanSpottedEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeetleCyanSpottedEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/beetle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeetleCyanSpottedEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/beetle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeetleCyanSpottedEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
