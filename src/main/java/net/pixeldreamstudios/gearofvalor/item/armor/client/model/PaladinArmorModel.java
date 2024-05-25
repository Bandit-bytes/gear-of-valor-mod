package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import mod.azure.azurelib.core.animation.AnimationState;
import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;

public class PaladinArmorModel extends GeoModel<PaladinArmorItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/paladin.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/paladin.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/paladin.animation.json");

    @Override
    public ResourceLocation getModelResource(PaladinArmorItem paladinArmorItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(PaladinArmorItem paladinArmorItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(PaladinArmorItem paladinArmorItem) {
        return animation;
    }

    @Override
    public void setCustomAnimations(PaladinArmorItem animatable, long instanceId, AnimationState<PaladinArmorItem> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
        var cape = getAnimationProcessor().getBone("cape");
    }
}
