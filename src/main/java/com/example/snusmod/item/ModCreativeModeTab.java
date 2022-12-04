package com.example.snusmod.item;

import com.example.snusmod.init.SnusmodModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SNUS_ITEMS = new CreativeModeTab("snus_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SnusmodModItems.SNUS_BOX.get());
        }
    };
}
