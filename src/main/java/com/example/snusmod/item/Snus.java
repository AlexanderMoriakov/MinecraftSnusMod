package com.example.snusmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Snus extends Item {
    public Snus(Properties properties) {
        super(properties.tab(ModCreativeModeTab.SNUS_ITEMS));
    }
}
