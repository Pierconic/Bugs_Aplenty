
package net.mcreator.bugsaplenty.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.bugsaplenty.entity.NestMarkerEntity;

public class NestMarkerRenderer extends MobRenderer<NestMarkerEntity, SlimeModel<NestMarkerEntity>> {
	public NestMarkerRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NestMarkerEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/termite_normal.png");
	}
}
