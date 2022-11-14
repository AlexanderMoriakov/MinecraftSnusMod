package com.example.snusmod.item;

import com.example.snusmod.Snusmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Snusmod.MODID);

    public static final RegistryObject<Item> SNUS_BOX = ITEMS.register("snus_box",() ->
            new SnusBox_item(new Item.Properties()));
    public static final RegistryObject<Item> SNUS_CACTUS = ITEMS.register("snus_cactus",() ->
            new SnusCactus_item(new Item.Properties()));
    public static final RegistryObject<Item> SNUS_FISH = ITEMS.register("snus_fish",() ->
            new SnusFish_item(new Item.Properties()));
    public static final RegistryObject<Item> SNUS_JUNGLE = ITEMS.register("snus_jungle",() ->
            new SnusJungle_item(new Item.Properties()));
    public static final RegistryObject<Item> SNUS_NETHER_WART = ITEMS.register("snus_nether_wart",() ->
            new SnusNetherWart_item(new Item.Properties()));
    public static final RegistryObject<Item> SNUS_RED_ROSE = ITEMS.register("snus_red_rose",() ->
            new SnusRedRose_item(new Item.Properties()));
    public static final RegistryObject<Item> SNUS_CHORUS = ITEMS.register("snus_chorus",() ->
            new SnusChorus_item(new Item.Properties()));
    public static final RegistryObject<Item> SNUS_ENDER = ITEMS.register("snus_ender",() ->
            new SnusEnder_item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
