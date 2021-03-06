/*
    Copyright (C) 2018-2019 Init Studios. All rights reserved.

    This document is the property of Init Studios.
    It is considered confidential and proprietary.

    This document may not be reproduced or transmitted in any form,
    in whole or in part, without the express written permission of
    Init Studios.
 */

package com.initstudios.initiative.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGelBall extends ModelBase
{
    private ModelRenderer renderer;

    public ModelGelBall()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.renderer = new ModelRenderer(this, 0, 0);
        this.renderer.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.renderer.addBox(0.0F, 0.0F, 0.0F, 16, 16, 1);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale) {
        this.renderer.render(scale);
    }
}
