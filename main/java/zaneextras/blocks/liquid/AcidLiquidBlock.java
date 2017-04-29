package zaneextras.blocks.liquid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneDSource;

public class AcidLiquidBlock extends BlockFluidClassic {
	@SideOnly(Side.CLIENT)
	protected IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon flowingIcon;
	
	public AcidLiquidBlock(Fluid fluid) {
		super(fluid, Material.water);
		this.setBlockName(ModInfo.MODID + "_acidfluid");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		IIcon result = stillIcon;
		if (side == 1) {
			result = flowingIcon;
		}
		return result;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iir) {
		stillIcon = iir.registerIcon(ModInfo.MODID + ":" + "acid_flowing");
		flowingIcon = iir.registerIcon(ModInfo.MODID + ":" + "acid_still");
	}
	
	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) {
			return false;
		} else {
			return super.canDisplace(world, x, y, z);
		}
	}
	
	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) {
			return false;
		} else {
			return super.displaceIfPossible(world, x, y, z);
		}
	}
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z,
			Entity ent) {
		if (!(ent instanceof EntityLivingBase)) {
			return;
		}
		EntityLivingBase player = (EntityLivingBase) ent;
		
		player.attackEntityFrom(ZaneDSource.deathAcid, 3.0F);
	}
}