package zaneextras.blocks.ore;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import zaneextras.items.ItemList;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class SodiumOreBlock extends Block {
	
	public SodiumOreBlock() {
		super(Material.rock);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setStepSound(soundTypeMetal);
		this.setBlockName(ModInfo.MODID + "_sodiumore");
		this.setBlockTextureName(ModInfo.MODID + ":sodiumore");
		this.setHardness(3.0F);
		this.setResistance(3.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public boolean canSilkHarvest() {
		return true;
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		
		return ItemList.sodium;
	}
	
	private Random rand2 = new Random();
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
			int meta) {
		
		if (rand2.nextInt(10) <= 1)
			world.createExplosion(null, x, y, z, 10.0F, false);
	}
	
	@Override
	public int quantityDropped(Random p_149745_1_) {
		
		int randNum = p_149745_1_.nextInt(4);
		
		switch (randNum) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 4;
		default:
			return 1;
		}
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
