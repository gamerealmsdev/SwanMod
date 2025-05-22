package xyz.gamerealms.swanmod.client.entity;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import xyz.gamerealms.swanmod.SwanMod;
import xyz.gamerealms.swanmod.entity.custom.CapybaraEntity;

public class CapybaraModel<T extends CapybaraEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer CAPYBARA = new EntityModelLayer(Identifier.of(SwanMod.MOD_ID, "capybara"), "main");

    private final ModelPart root;
    private final ModelPart frontlegs;
    private final ModelPart frontleft;
    private final ModelPart frontright;
    private final ModelPart backlegs;
    private final ModelPart backleft;
    private final ModelPart backright;
    private final ModelPart torso;
    private final ModelPart head;
    public CapybaraModel(ModelPart root) {
        this.root = root.getChild("root");
        this.frontlegs = this.root.getChild("frontlegs");
        this.frontleft = this.frontlegs.getChild("frontleft");
        this.frontright = this.frontlegs.getChild("frontright");
        this.backlegs = this.root.getChild("backlegs");
        this.backleft = this.backlegs.getChild("backleft");
        this.backright = this.backlegs.getChild("backright");
        this.torso = this.root.getChild("torso");
        this.head = this.root.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData frontlegs = root.addChild("frontlegs", ModelPartBuilder.create(), ModelTransform.pivot(10.0F, 0.0F, 5.0F));

        ModelPartData frontleft = frontlegs.addChild("frontleft", ModelPartBuilder.create().uv(26, 51).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(56, 23).cuboid(1.0F, 4.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -5.0F, -1.0F));

        ModelPartData frontright = frontlegs.addChild("frontright", ModelPartBuilder.create().uv(18, 50).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 57).cuboid(1.0F, 4.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -5.0F, -9.0F));

        ModelPartData backlegs = root.addChild("backlegs", ModelPartBuilder.create(), ModelTransform.pivot(-9.0F, 0.0F, 5.0F));

        ModelPartData backleft = backlegs.addChild("backleft", ModelPartBuilder.create().uv(0, 56).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(40, 57).cuboid(1.0F, 4.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, -1.0F));

        ModelPartData backright = backlegs.addChild("backright", ModelPartBuilder.create().uv(30, 44).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(34, 57).cuboid(1.0F, 4.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, -9.0F));

        ModelPartData torso = root.addChild("torso", ModelPartBuilder.create().uv(0, 0).cuboid(-21.0F, -13.0F, -10.0F, 22.0F, 8.0F, 10.0F, new Dilation(0.0F))
                .uv(0, 28).cuboid(-19.0F, -12.0F, 0.0F, 18.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 36).cuboid(-19.0F, -12.0F, -11.0F, 18.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 18).cuboid(-19.0F, -14.0F, -9.0F, 20.0F, 2.0F, 8.0F, new Dilation(0.0F))
                .uv(18, 44).cuboid(-21.0F, -14.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(10.0F, 0.0F, 5.0F));

        ModelPartData head = root.addChild("head", ModelPartBuilder.create().uv(38, 28).cuboid(10.0F, -22.0F, -3.0F, 7.0F, 8.0F, 6.0F, new Dilation(0.0F))
                .uv(0, 44).cuboid(17.0F, -20.0F, -3.0F, 3.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData neck_r1 = head.addChild("neck_r1", ModelPartBuilder.create().uv(38, 42).cuboid(-4.0F, -7.0F, -2.0F, 7.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

        ModelPartData rightear_r1 = head.addChild("rightear_r1", ModelPartBuilder.create().uv(56, 18).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(8, 56).cuboid(-1.0F, -3.0F, 5.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -21.0F, -3.0F, 0.0F, 0.0F, -0.7854F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(CapybaraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(CapybaraAnimations.WALKING, limbSwing, limbSwingAmount, 2F, 2.5F);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -10.0F, 10.0F);
        headPitch = MathHelper.clamp(headPitch, -10.0F, 10.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        root.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return root;
    }
}
