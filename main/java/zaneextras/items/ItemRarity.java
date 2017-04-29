package zaneextras.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemRarity extends Item {
	
	private EnumRarity rarityType;
	
	public ItemRarity(String strTexture, EnumRarity rarity) {
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + strTexture);
		this.setTextureName(ModInfo.MODID + ":" + strTexture);
		rarityType = rarity;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return rarityType;
	}
}