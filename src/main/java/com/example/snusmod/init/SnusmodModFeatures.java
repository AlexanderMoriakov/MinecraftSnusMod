package com.example.snusmod.init;

import com.example.snusmod.SnusMod;
import com.example.snusmod.world.feature.PrikopDirtFeature;
import com.example.snusmod.world.feature.PrikopRedSandFeature;
import com.example.snusmod.world.feature.PrikopSandFeature;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SnusmodModFeatures {
    public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SnusMod.MODID);
    public static final RegistryObject<Feature<?>> PRIKOP_DIRT = REGISTRY.register("prikop_dirt", PrikopDirtFeature::feature);
    public static final RegistryObject<Feature<?>> PRIKOP_SAND = REGISTRY.register("prikop_sand", PrikopSandFeature::feature);
    public static final RegistryObject<Feature<?>> PRIKOP_RED_SAND = REGISTRY.register("prikop_red_sand", PrikopRedSandFeature::feature);
}
