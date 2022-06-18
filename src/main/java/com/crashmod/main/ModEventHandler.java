package com.crashmod;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

import net.minecraft.util.text.TextComponentString;

public class ModEventHandler
{
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event) {
		// Dont think you would even need those right now
		//if(!event.player.worldObj.isRemote) {
			event.player.sendMessage(new TextComponentString("you better not die from now on..."));
		//}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		EntityLivingBase entity = event.getEntityLiving();
		if(entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;
			// because there's NO way you can see this, why bother?
			//if(!player.worldObj.isRemote) {
			//	player.addChatMessage(new ChatComponentText("You loser"));
			//}
			System.out.println("Well that's unfortunate.");
			System.exit(0);
		}
	}	
}