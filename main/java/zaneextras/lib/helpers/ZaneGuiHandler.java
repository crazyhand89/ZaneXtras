package zaneextras.lib.helpers;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import zaneextras.blocks.containers.TMContainerHFurnace;
import zaneextras.blocks.containers.TMContainerSFurnace;
import zaneextras.blocks.containers.TMContainerStarFurnace;
import zaneextras.blocks.tileentity.TileEntityHFurnace;
import zaneextras.blocks.tileentity.TileEntitySFurnace;
import zaneextras.blocks.tileentity.TileEntityStarFurnace;
import zaneextras.gui.GUIHardFurnace;
import zaneextras.gui.GUISFurnace;
import zaneextras.gui.GUIStarFurnace;

public class ZaneGuiHandler implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == 0) {
			TileEntityHFurnace tileEntityFurnace = (TileEntityHFurnace) world
					.getTileEntity(x, y, z);
			return new TMContainerHFurnace(player.inventory, tileEntityFurnace);
		} else if (ID == 1) {
			TileEntitySFurnace tileEntityFurnace = (TileEntitySFurnace) world
					.getTileEntity(x, y, z);
			return new TMContainerSFurnace(player.inventory, tileEntityFurnace);
		} else if (ID == 2) {
			TileEntityStarFurnace tileEntityFurnace = (TileEntityStarFurnace) world
					.getTileEntity(x, y, z);
			return new TMContainerStarFurnace(player.inventory, tileEntityFurnace);
		}
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == 0) {
			TileEntityHFurnace tileEntityFurnace = (TileEntityHFurnace) world
					.getTileEntity(x, y, z);
			return new GUIHardFurnace(player.inventory, tileEntityFurnace); // dis
																			// is
																			// broken
		} else if (ID == 1) {
			TileEntitySFurnace tileEntityFurnace = (TileEntitySFurnace) world
					.getTileEntity(x, y, z);
			return new GUISFurnace(player.inventory, tileEntityFurnace);
		} else if (ID == 2) {
			TileEntityStarFurnace tileEntityFurnace = (TileEntityStarFurnace) world
					.getTileEntity(x, y, z);
			return new GUIStarFurnace(player.inventory, tileEntityFurnace);
		}
		return null;
	}
	
}