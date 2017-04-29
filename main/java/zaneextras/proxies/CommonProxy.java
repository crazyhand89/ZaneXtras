package zaneextras.proxies;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import zaneextras.ZaneExtrasMain;
import zaneextras.blocks.tileentity.TileEntityCFurnace;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneGuiHandler;

public class CommonProxy {
	
	public void initRenderers() {
		
	}
	
	public void initClientEvents() {
		
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
		GameRegistry.registerTileEntity(TileEntityCFurnace.class,
				ModInfo.MODID + "TileEntityCFurnace");
	}
}