package com.example.snusmod;

import com.example.snusmod.init.SnusmodModFeatures;
import com.example.snusmod.init.SnusmodModItems;
import com.example.snusmod.init.SnusmodModMenus;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file


@Mod("snusmod")
public class SnusMod {
    public static final String MODID = "snusmod";

    public SnusMod() {
        MinecraftForge.EVENT_BUS.register(this);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SnusmodModItems.REGISTRY.register(bus);
        SnusmodModMenus.REGISTRY.register(bus);
        SnusmodModFeatures.REGISTRY.register(bus);

    }
}

