package com.rako100.biogenerators;

import com.rako100.creativetabs.BioGenTabs;
import com.rako100.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name=References.NAME, version=References.VERSION, modid=References.MODID)
public class BioGenerators {
	
	@SidedProxy(clientSide=References.CLIENTSIDE, serverSide=References.SERVERSIDE)
	public static CommonProxy proxy;
	
	
	@Instance
	public static BioGenerators instance;
	
	public static final CreativeTabs myTabs = new BioGenTabs("creativetabs");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
		
		
	}
	
	
	@EventHandler
	public void inIt(FMLInitializationEvent event)
	{
		proxy.init(event);
		
	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		proxy.postInit(event);
		
		
	}
	
	

}
