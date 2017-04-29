package zaneextras.items.weapon;

import net.minecraft.item.ItemSword;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemWeaponDamnHardButterSword extends ItemSword {
	
	public ItemWeaponDamnHardButterSword() {
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_buttersword");
		this.setTextureName(ModInfo.MODID + ":buttersword");
	}
}
