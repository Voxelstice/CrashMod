package com.crashmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = CrashMod.MODID, name = CrashMod.NAME, version = CrashMod.VERSION)
public class CrashMod
{
    	public static final String MODID = "crashmod";
	public static final String NAME = "Crash Mod";
	public static final String VERSION = "1.0";

	private static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("My Name Is Walter Hartwell White. I live at 308 Negra Arroyo Lane, Albuquerque, New Mexico, 87104.");

        	logger = event.getModLog(); // Forge, what is this even for? I don't get it!

		ModEventHandler commonHandler = new ModEventHandler();
		MinecraftForge.EVENT_BUS.register(commonHandler);
    	}

    	@Mod.EventHandler
    	public void init(FMLInitializationEvent event)
    	{
		System.out.println("you better not die from now on");
    	}
}
