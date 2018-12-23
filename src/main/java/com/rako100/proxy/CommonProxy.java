package com.rako100.proxy;

import com.rako100.items.BerylIngot;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber
public class CommonProxy 
{
	
	public void preInit(FMLPreInitializationEvent event)
	{
		
		
		
	}
	
	
	public void init(FMLInitializationEvent event)
	{
		
		
		
	}

	public void postInit(FMLPostInitializationEvent event)
	{
		
		
		
	}
	
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BerylIngot());
		
		
	}
	
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		
		
		
	}
	
	
	
	
	
	
	
}
