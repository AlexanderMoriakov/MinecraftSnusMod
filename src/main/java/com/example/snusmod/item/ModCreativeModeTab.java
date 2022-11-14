package com.example.snusmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SNUS_ITEMS = new CreativeModeTab("snus_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SNUS_BOX.get());
        }
    };
}
