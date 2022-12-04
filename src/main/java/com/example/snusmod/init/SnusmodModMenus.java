
package com.example.snusmod.init;

import com.example.snusmod.SnusMod;
import com.example.snusmod.world.inventory.SnusBoxGuiMenu;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;


public class SnusmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SnusMod.MODID);
	public static final RegistryObject<MenuType<SnusBoxGuiMenu>> SNUS_BOX_GUI = REGISTRY.register("snus_box_gui",
			() -> IForgeMenuType.create(SnusBoxGuiMenu::new));
}
