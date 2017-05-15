package zaneextras.items.weapon;

import net.minecraft.item.ItemSword;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemWeaponFoolStariaSword extends ItemSword {
	
	public ItemWeaponFoolStariaSword() {
		super(ZaneToolMaterials.FOOL_STARIA);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_foolstariasword");
		this.setTextureName(ModInfo.MODID + ":stariasword");
	}
}
