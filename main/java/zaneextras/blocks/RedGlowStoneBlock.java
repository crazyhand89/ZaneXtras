package zaneextras.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import zaneextras.items.ItemList;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class RedGlowStoneBlock extends Block {
	
	public RedGlowStoneBlock() {
		super(Material.glass);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setStepSound(soundTypeGlass);
		this.setBlockName(ModInfo.MODID + "_redglowstone");
		this.setBlockTextureName(ModInfo.MODID + ":redglowstone");
		this.setHardness(0.6F);
		this.setResistance(2.0F);
		this.setLightLevel(1.0F);
	}
	
	@Override
	public boolean canSilkHarvest() {
		return true;
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		return ItemList.redGlowStoneDust;
	}
	
	@Override
	public int quantityDropped(Random par1Random) {
		int r = par1Random.nextInt(4);
		r = r == 0 ? 1 : r;
		return r;
	}
}