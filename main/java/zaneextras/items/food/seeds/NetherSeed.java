package zaneextras.items.food.seeds;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class NetherSeed extends ItemSeeds {
	
	public NetherSeed(String strTexture, Block cropBlock) {
		super(cropBlock, Blocks.soul_sand);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + strTexture);
		this.setTextureName(ModInfo.MODID + ":" + strTexture);
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Nether;
	}
	
}