package aliquot.mcmods.playerskills;

import aliquot.mcmods.playerskills.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PSCore.MODID, version = PSCore.VERSION)
public class PSCore {
	public static final String MODID = "PlayerSkills";
	public static final String VERSION = "@VERSION@";
	public static final String MODNAME = "PlayerSkills";
	
	@Instance(MODID)
	public static PSCore instance;
	
	@SidedProxy(clientSide = "aliquot.mcmods.playerskills.proxies.ClientProxy", serverSide = "aliquot.mcmods.playerskills.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Load config
		// Register GUI handler
		// Register events handler
		// Register connection handler
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Load blocks/items
		// Register key binds
		// Register renderers
		// Register achievements
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
