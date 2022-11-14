package com.example.snusmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;

public class SnusRedRose_item extends Snus{
    public SnusRedRose_item(Properties p_41383_) {
        super(p_41383_.food(new FoodProperties.Builder()
                .nutrition(5).fast().alwaysEat()
                .effect(new MobEffectInstance(MobEffects.REGENERATION, 300),1.0F)
                .build()).stacksTo(1));
    }
}
