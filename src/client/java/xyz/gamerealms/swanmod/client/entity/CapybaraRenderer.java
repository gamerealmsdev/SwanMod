package xyz.gamerealms.swanmod.client.entity;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import xyz.gamerealms.swanmod.SwanMod;
import xyz.gamerealms.swanmod.entity.custom.CapybaraEntity;

public class CapybaraRenderer extends MobEntityRenderer<CapybaraEntity, CapybaraModel<CapybaraEntity>> {
    public CapybaraRenderer(EntityRendererFactory.Context context) {
        super(context, new CapybaraModel<>(context.getPart(CapybaraModel.CAPYBARA)), 0.75F);
    }

    @Override
    public Identifier getTexture(CapybaraEntity entity) {
        return Identifier.of(SwanMod.MOD_ID, "textures/entity/capybara/capybara.png");
    }

    @Override
    public void render(CapybaraEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5F, 0.5F, 0.5F);
        } else {
            matrixStack.scale(1F, 1F, 1F);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
