package zaneextras.lib;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import zaneextras.blocks.containers.TMContainerCFurnace;
import zaneextras.blocks.tileentity.TileEntityCFurnace;
import zaneextras.gui.GUICFurnace;

public class ZaneGuiHandler implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == 0) {
			TileEntityCFurnace tileEntityFurnace = (TileEntityCFurnace) world
					.getTileEntity(x, y, z);
			return new TMContainerCFurnace(player.inventory, tileEntityFurnace);
		}
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == 0) {
			TileEntityCFurnace tileEntityFurnace = (TileEntityCFurnace) world
					.getTileEntity(x, y, z);
			return new GUICFurnace(player.inventory, tileEntityFurnace); // dis
																			// is
																			// broken
		}
		return null;
	}
	
}