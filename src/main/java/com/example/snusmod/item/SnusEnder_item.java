package com.example.snusmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class SnusEnder_item extends Snus {
    public SnusEnder_item(Properties properties) {
        super(properties.food(new FoodProperties.Builder()
                .nutrition(5).fast().alwaysEat()
                .build()).stacksTo(1));
    }
    @Override
    public ItemStack finishUsingItem(ItemStack p_41409_, Level level, LivingEntity dolbaeb) {
        super.finishUsingItem(p_41409_, level, dolbaeb);
        for (int i = 0; i < 25; i++) {
            dolbaeb.move(MoverType.SELF,dolbaeb.getViewVector(300));
        }
        Vec3 vec = dolbaeb.getViewVector(0);
        double x = 
        double y = player.getLookVec().getY();
        double z = player.getLookVec().getZ(); `
        return p_41409_;
    }
}
