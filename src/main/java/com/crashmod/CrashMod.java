package com.crashmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = CrashMod.MODID, version = CrashMod.VERSION)
public class CrashMod
{
	public static final String MODID = "crashmod";
	public static final String VERSION = "1.0";
    
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("you better not die from now on");
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("My Name Is Walter Hartwell White. I live at 308 Negra Arroyo Lane, Albuquerque, New Mexico, 87104.");

		ModEventHandler commonHandler = new ModEventHandler();
		FMLCommonHandler.instance().bus().register(commonHandler);
		MinecraftForge.EVENT_BUS.register(commonHandler);
	}
}