package com.aliquot.playerskills;

import com.aliquot.playerskills.proxy.CommonProxy;
import com.aliquot.playerskills.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class PSCore {
	
	@Instance(Reference.MODID)
	public static PSCore instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
		// Load config
		// Register GUI handler
		// Register events handler
		// Register connection handler
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		// Load blocks/items
		// Register key binds
		// Register renderers
		// Register achievements
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}
}