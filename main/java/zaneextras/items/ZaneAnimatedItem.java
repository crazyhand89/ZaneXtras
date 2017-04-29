package zaneextras.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import zaneextras.lib.ModInfo;

public class ZaneAnimatedItem extends ZaneItem {
	
	private String name;
	private EnumRarity rarityType;
	
	public ZaneAnimatedItem(String str, EnumRarity rarity) {
		super(str);
		name = str;
		rarityType = rarity;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iir) {
		this.itemIcon = iir.registerIcon(ModInfo.MODID + ":" + name);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return rarityType;
	}
}