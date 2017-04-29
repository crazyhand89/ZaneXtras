package zaneextras.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import zaneextras.ZaneExtrasMain;
import zaneextras.config.ZaneConfig;
import zaneextras.lib.ModInfo;
import zaneextras.teleport.MessageTeleportToDimension;

// Orginaly Zollernwolf's Idea
public class ItemLightEye extends ZaneItem {
	
	public ItemLightEye() {
		super("lighteye");
		this.setMaxDamage(100);
		this.setMaxStackSize(1);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iir) {
		this.itemIcon = iir.registerIcon(ModInfo.MODID + ":" + name);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer Player) {
		
		ItemStack cStack = par1ItemStack.copy();
		cStack.setItemDamage(cStack.getItemDamage() + 1);
		
		if (Player.dimension == 0) {
			ZaneExtrasMain.snw.sendToServer(new MessageTeleportToDimension(
					ZaneConfig.dimensionLightID, Player.getEntityId()));
			return cStack;
		} else {
			ZaneExtrasMain.snw.sendToServer(
					new MessageTeleportToDimension(0, Player.getEntityId()));
			return cStack;
		}
	}
}
