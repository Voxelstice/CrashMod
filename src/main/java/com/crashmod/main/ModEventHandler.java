package com.crashmod;

import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;

public class ModEventHandler
{
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
		if(!event.player.worldObj.isRemote) {
			event.player.addChatMessage(new ChatComponentText("you better not die from now on..."));
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		if(event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			if(!player.worldObj.isRemote) {
				player.addChatMessage(new ChatComponentText("You loser"));
			}
			System.out.println("Well that's unfortunate.");
			System.exit(0);
		}
	}	
}