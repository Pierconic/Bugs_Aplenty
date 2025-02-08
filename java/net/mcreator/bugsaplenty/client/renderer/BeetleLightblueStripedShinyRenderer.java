
package net.mcreator.bugsaplenty.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bugsaplenty.entity.model.BeetleLightblueStripedShinyModel;
import net.mcreator.bugsaplenty.entity.BeetleLightblueStripedShinyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BeetleLightblueStripedShinyRenderer extends GeoEntityRenderer<BeetleLightblueStripedShinyEntity> {
	public BeetleLightblueStripedShinyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BeetleLightblueStripedShinyModel());
		this.shadowRadius = 0.3f;
	}

	@Override
	public RenderType getRenderType(BeetleLightblueStripedShinyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BeetleLightblueStripedShinyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay,
			int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
