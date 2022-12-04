package com.example.snusmod.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SnusDreams_item extends Snus {
    public SnusDreams_item(Properties properties) {
        super(properties.food(new FoodProperties.Builder()
                .nutrition(5).fast().alwaysEat()
                .effect(new MobEffectInstance(MobEffects.BLINDNESS, 40), 1.0F)
                .build()).stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (level instanceof ServerLevel _level) {
            _level.setDayTime(_level.getDayTime()+5000);
        }
       player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1));
        return super.use(level, player, interactionHand);
    }
}
