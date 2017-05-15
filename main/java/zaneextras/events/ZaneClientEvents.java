package zaneextras.events;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import zaneextras.interfaces.IZaneExtendedReach;
import zaneextras.lib.helpers.ZaneExtendedReachHelper;

/**
 * Events to define weapons with greater than default reach, which is 3.0 Credit
 * to BalkondeurAlpha for this code, find him at
 * http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/
 * 1272627-balkons-weaponmod-v1-14 na na na na na :3 -aka Zollernwolf
 */

@SideOnly(Side.CLIENT)
public class ZaneClientEvents {
	
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent e) {
		if (!e.player.worldObj.isRemote) {
			return;
		}
		if (e.phase == TickEvent.Phase.END) {
			if (e.player != null && e.player.swingProgressInt == 1) // Just
																	// swung
			{
				ItemStack itemstack = e.player.getCurrentEquippedItem();
				IZaneExtendedReach ieri;
				if (itemstack != null) {
					if (itemstack.getItem() instanceof IZaneExtendedReach) {
						ieri = (IZaneExtendedReach) itemstack.getItem();
						
					} else
						ieri = null;
					
					if (ieri != null) {
						float reach = ieri.getExtendedReach(e.player.worldObj,
								e.player, itemstack);
						MovingObjectPosition mov = ZaneExtendedReachHelper
								.getMouseOver(0, reach);
						
						if (mov != null && mov.entityHit != null
								&& mov.entityHit != e.player
								&& mov.entityHit.hurtResistantTime == 0) {
							FMLClientHandler.instance()
									.getClient().playerController.attackEntity(
											e.player, mov.entityHit);
						}
					}
				}
			}
		}
	}
}