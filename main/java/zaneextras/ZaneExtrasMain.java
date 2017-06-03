package zaneextras;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.MinecraftForge;
import zaneextras.achievments.ZaneAchievments;
import zaneextras.achievments.handlers.AchievmentHandler;
import zaneextras.biomes.ZaneBiomeList;
import zaneextras.blocks.BlockList;
import zaneextras.config.ZaneConfig;
import zaneextras.dimensions.ZaneDimensionLoader;
import zaneextras.events.ZaneEvents;
import zaneextras.items.ItemList;
import zaneextras.items.arrow.EntityAngelArrow;
import zaneextras.items.arrow.EntityEmeraldArrow;
import zaneextras.items.arrow.EntityEnderArrow;
import zaneextras.items.arrow.EntityGoldenArrow;
import zaneextras.items.arrow.EntityLightArrow;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;
import zaneextras.lib.helpers.ModHelper;
import zaneextras.lib.helpers.ZaneBRTurbineHelper;
import zaneextras.lib.treasure.Treasures;
import zaneextras.mobs.MobList;
import zaneextras.oredict.ZaneOreDict;
import zaneextras.potions.ZanePotion;
import zaneextras.proxies.CommonProxy;
import zaneextras.recipes.Recipes;
import zaneextras.teleport.MessageTeleportToDimension;
import zaneextras.worldgen.ZaneWorldGen;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class ZaneExtrasMain {
	
	public static SimpleNetworkWrapper snw;
	
	@Mod.Instance(ModInfo.MODID)
	public static ZaneExtrasMain INSTANCE;
	
	@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy",
			serverSide = ModInfo.PROXY_LOCATION + ".CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModHelper.detectMods();
		ZaneTabs.init();
		ZaneConfig.init(event);
		ItemList.init();
		BlockList.init();
		ZaneAchievments.init();
		MobList.init();
		Treasures.init();
		snw = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.MODID);
		snw.registerMessage(MessageTeleportToDimension.TeleportHandler.class,
				MessageTeleportToDimension.class, 1, Side.SERVER);
		if (ModHelper.useBigReactors) {
			ZaneBRTurbineHelper.init();
		}
		ZaneDimensionLoader.init();
		ZanePotion.init();
		FMLCommonHandler.instance().bus().register(new AchievmentHandler());
		proxy.registerTileEntities();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.initRenderers();
		EntityRegistry.registerModEntity(EntityEmeraldArrow.class,
				"EmeraldArrow", 1, INSTANCE, 64, 20, true);
		EntityRegistry.registerModEntity(EntityEnderArrow.class, "EnderArrow",
				2, INSTANCE, 64, 20, true);
		EntityRegistry.registerModEntity(EntityGoldenArrow.class, "GoldenArrow",
				3, INSTANCE, 64, 20, true);
		EntityRegistry.registerModEntity(EntityLightArrow.class, "LightArrow",
				4, INSTANCE, 64, 20, true);
		EntityRegistry.registerModEntity(EntityAngelArrow.class, "AngelArrow",
				5, INSTANCE, 64, 20, true);
		Recipes.init();
		MinecraftForge.EVENT_BUS.register(new ZaneEvents());
		proxy.initClientEvents();
		GameRegistry.registerWorldGenerator(new ZaneWorldGen(), 30);
		ZaneOreDict.init();
		ZaneBiomeList.init();
		proxy.registerNetwork();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}