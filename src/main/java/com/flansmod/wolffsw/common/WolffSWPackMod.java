package com.flansmod.wolffsw.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = WolffSWPackMod.MODID, 
			name = WolffSWPackMod.NAME, 
			version = WolffSWPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)

public class WolffSWPackMod implements IFlansModContentProvider
{
	public static final String MODID = "wolffswpack";
	public static final String VERSION = "2.3";
	public static final String NAME = "Wolff's Star Wars Pack";
	
	@Override
	public String GetContentFolder() 
	{
		return NAME;
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect(MODID, "com.flansmod.client.model.mineworld");
	}
}
