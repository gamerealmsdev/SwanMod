package xyz.gamerealms.swanmod.client.entity;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class CapybaraAnimations {
    public static final Animation WALKING = Animation.Builder.create(1.5833F).looping()
            .addBoneAnimation("frontleft", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("frontleft", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.5F, 0.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("frontright", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("frontright", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.5F, 0.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("backleft", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("backleft", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.5F, 0.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("backright", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("backright", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.2083F, AnimationHelper.createTranslationalVector(0.5F, 0.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .build();
}
