
package com.example.snusmod.init;

import com.example.snusmod.SnusMod;
import com.example.snusmod.item.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;


public class SnusmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SnusMod.MODID);
	public static final RegistryObject<Item> SNUS_BOX = REGISTRY.register("snus_box", () -> new SnusBox_item(new Item.Properties()));

	public static final RegistryObject<Item> SNUS_CACTUS = REGISTRY.register("snus_cactus",() ->
			new SnusCactus_item(new Item.Properties()));
	public static final RegistryObject<Item> SNUS_FISH = REGISTRY.register("snus_fish",() ->
			new SnusFish_item(new Item.Properties()));
	public static final RegistryObject<Item> SNUS_JUNGLE = REGISTRY.register("snus_jungle",() ->
			new SnusJungle_item(new Item.Properties()));
	public static final RegistryObject<Item> SNUS_NETHER_WART = REGISTRY.register("snus_nether_wart",() ->
			new SnusNetherWart_item(new Item.Properties()));
	public static final RegistryObject<Item> SNUS_RED_ROSE = REGISTRY.register("snus_red_rose",() ->
			new SnusRedRose_item(new Item.Properties()));
	public static final RegistryObject<Item> SNUS_CHORUS = REGISTRY.register("snus_chorus",() ->
			new SnusChorus_item(new Item.Properties()));
	public static final RegistryObject<Item> SNUS_ENDER = REGISTRY.register("snus_ender",() ->
			new SnusEnder_item(new Item.Properties()));
	public static final RegistryObject<Item> SNUS_DREAMS = REGISTRY.register("snus_dreams",() ->
			new SnusDreams_item(new Item.Properties()));
}
