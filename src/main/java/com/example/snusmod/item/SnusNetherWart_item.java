package com.example.snusmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class SnusNetherWart_item extends Snus {
    public SnusNetherWart_item(Properties p_41383_) {
        super(p_41383_.food(new FoodProperties.Builder()
                .nutrition(5).fast().alwaysEat()
                .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300), 1.0F)
                .build()).stacksTo(1));
    }
}
