package zaneextras.proxies;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import zaneextras.ZaneExtrasMain;
import zaneextras.blocks.tileentity.TileEntityHFurnace;
import zaneextras.blocks.tileentity.TileEntitySFurnace;
import zaneextras.blocks.tileentity.TileEntityStarFurnace;
import zaneextras.lib.ModInfo;
import zaneextras.lib.helpers.ZaneGuiHandler;

public class CommonProxy {
	
	public void initRenderers() {
		
	}
	
	public void initClientEvents() {
		
	}
	
public void sendChatMessage(EntityPlayer player, String message) {
		
	}
	
	public Minecraft getMinecraft() {
		return null;
	}
	
	public void doPotionEffect(EntityPlayer player, int potionId) {
		
	}
	
	public void registerNetwork() {
		NetworkRegistry.INSTANCE.registerGuiHandler(ZaneExtrasMain.INSTANCE,
				new ZaneGuiHandler());
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityHFurnace.class,
				ModInfo.MODID + "TileEntityHFurnace");
		GameRegistry.registerTileEntity(TileEntitySFurnace.class,
				ModInfo.MODID + "TileEntitySFurnace");
		GameRegistry.registerTileEntity(TileEntityStarFurnace.class,
				ModInfo.MODID + "TileEntityStarFurnace");
	}
}