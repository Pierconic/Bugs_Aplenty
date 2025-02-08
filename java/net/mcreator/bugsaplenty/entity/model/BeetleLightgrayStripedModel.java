package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.BeetleLightgrayStripedEntity;

public class BeetleLightgrayStripedModel extends GeoModel<BeetleLightgrayStripedEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeetleLightgrayStripedEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/beetle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeetleLightgrayStripedEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/beetle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeetleLightgrayStripedEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
