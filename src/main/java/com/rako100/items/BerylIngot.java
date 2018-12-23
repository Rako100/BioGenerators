package com.rako100.items;

import com.rako100.biogenerators.BioGenerators;
import com.rako100.biogenerators.References;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BerylIngot extends Item
{
	
	public BerylIngot() {
		
		setRegistryName("berylingot");
		setUnlocalizedName(References.MODID + ".berylingot");
		setCreativeTab(BioGenerators.myTabs);
	}
	
	
	@SideOnly(Side.CLIENT)
	public void initModel()
	{
		
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
		
	}

}
