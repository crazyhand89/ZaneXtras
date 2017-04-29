package zaneextras.blocks.ore;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class SkyiumOreBlock extends Block {
	
	public SkyiumOreBlock() {
		super(Material.rock);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setStepSound(soundTypeMetal);
		this.setBlockName(ModInfo.MODID + "_skyiumore");
		this.setBlockTextureName(ModInfo.MODID + ":skyiumore");
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setHarvestLevel("pickaxe", 4);
	}
	
	private Random rand = new Random();
	
	@Override
	public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_,
			int p_149690_7_) {
		if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item
				.getItemFromBlock(this)) {
			int j1 = 0;
			j1 = MathHelper.getRandomIntegerInRange(rand, 4, 8);
			
			return j1;
		}
		return 0;
	}
}
