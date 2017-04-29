package zaneextras.items.food.seeds;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeedFood;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class SeedFood extends ItemSeedFood {
	
	public SeedFood(int hunger, float saturation, Block blockCrop,
			Block farmland, String strTexture) {
		super(hunger, saturation, blockCrop, farmland);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + strTexture);
		this.setTextureName(ModInfo.MODID + ":" + strTexture);
	}
	
}