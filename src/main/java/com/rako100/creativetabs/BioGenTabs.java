package com.rako100.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class BioGenTabs extends CreativeTabs{

	public BioGenTabs(String label) {
		super("biogentabs");
		
		
	}
	
	
	public ItemStack getTabIconItem()
	{
		
		return new ItemStack(Blocks.DIAMOND_BLOCK);
	
	}
	

}
