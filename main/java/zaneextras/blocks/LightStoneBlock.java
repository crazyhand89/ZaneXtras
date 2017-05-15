package zaneextras.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class LightStoneBlock extends Block {
	
	private World worldObj;
	
	public LightStoneBlock() {
		super(Material.rock);
		this.setBlockName(ModInfo.MODID + "_lightstone");
		this.setBlockTextureName(ModInfo.MODID + ":lightstone");
		this.setCreativeTab(ZaneTabs.zTab);
		this.setTickRandomly(true);
		this.setHardness(1.0F);
		this.setResistance(3.0F);
		this.setStepSound(soundTypeStone);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		
		return Item.getItemFromBlock(BlockList.lightCobbleStone);
	}
}