package zaneextras.blocks.furnaces;

import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import zaneextras.ZaneExtrasMain;
import zaneextras.blocks.BlockList;
import zaneextras.blocks.tileentity.TileEntityStarFurnace;
import zaneextras.lib.ModInfo;

public class StarFurnaceBlock extends BlockContainer {
	
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	
	private static boolean isBurning;
	private final boolean isBurning2;
	private final Random rand = new Random();
	
	public StarFurnaceBlock(boolean isActive) {
		super(Material.rock);
		this.setHardness(3.0F);
		this.setBlockName(ModInfo.MODID + "_starFurnace");
		this.setStepSound(soundTypeStone);
		isBurning2 = isActive;
		// Mikey is a doo doo head
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.blockIcon = p_149651_1_
				.registerIcon(ModInfo.MODID + ":starfurnaceside");
		this.front = p_149651_1_.registerIcon(
				this.isBurning2 ? ModInfo.MODID + ":starfurnaceactive"
						: ModInfo.MODID + ":starfurnaceinactive");
		this.top = p_149651_1_.registerIcon(ModInfo.MODID + ":starfurnacetop");
	}
	
	 @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        return p_149691_1_ == 1 ? this.top : (p_149691_1_ == 0 ? this.top : (p_149691_1_ != p_149691_2_ ? this.blockIcon : this.front));
	    }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int par6, float par7, float par8, float par9) {
		
		player.openGui(ZaneExtrasMain.INSTANCE, 2, world, x, y, z);
		return true;
	}
	
	@Override
	public Item getItemDropped(int par1, Random random, int par3) {
		return Item.getItemFromBlock(BlockList.starFurnace);
	}
	
	@Override
	public Item getItem(World world, int par2, int par3, int par4) {
		return Item.getItemFromBlock(BlockList.starFurnace);
	}
	
	public TileEntity createNewTileEntity(World world, int par1) {
		return new TileEntityStarFurnace();
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.direction(world, x, y, z);
		
	}
	
	private void direction(World world, int x, int y, int z) {
		if (!world.isRemote) {
            Block block = world.getBlock(x, y, z - 1);
            Block block1 = world.getBlock(x, y, z + 1);
            Block block2 = world.getBlock(x - 1, y, z);
            Block block3 = world.getBlock(x + 1, y, z);
            byte b0 = 3;

            if (block.func_149730_j() && !block1.func_149730_j())
            {
                b0 = 3;
            }

            if (block1.func_149730_j() && !block.func_149730_j())
            {
                b0 = 2;
            }

            if (block2.func_149730_j() && !block3.func_149730_j())
            {
                b0 = 5;
            }

            if (block3.func_149730_j() && !block2.func_149730_j())
            {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z,
			EntityLivingBase entity, ItemStack itemstack) {
		 int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

	        if (l == 0)
	        {
	            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
	        }

	        if (l == 1)
	        {
	        	world.setBlockMetadataWithNotify(x, y, z, 5, 2);
	        }

	        if (l == 2)
	        {
	        	world.setBlockMetadataWithNotify(x, y, z, 3, 2);
	        }

	        if (l == 3)
	        {
	        	world.setBlockMetadataWithNotify(x, y, z, 4, 2);
	        }

	        if (itemstack.hasDisplayName())
	        {
	            ((TileEntityStarFurnace)world.getTileEntity(x, y, z)).furnaceName(itemstack.getDisplayName());
	        }
	}
	
	public static void updateBlockState(boolean burning, World world, int x,
			int y, int z) {
		int direction = world.getBlockMetadata(x, y, z);
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		isBurning = true;
		
		if (burning) {
			world.setBlock(x, y, z, BlockList.starFurnaceActive);
		} else {
			world.setBlock(x, y, z, BlockList.starFurnace);
		}
		
		isBurning = false;
		world.setBlockMetadataWithNotify(x, y, z, direction, 2);
		
		if (tileEntity != null) {
			tileEntity.validate();
			world.setTileEntity(x, y, z, tileEntity);
		}
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block,
			int meta) {
		if (!isBurning) {
			TileEntityStarFurnace tileEntityFurnace = (TileEntityStarFurnace) world
					.getTileEntity(x, y, z);
			
			if (tileEntityFurnace != null) {
				for (int i = 0; i < tileEntityFurnace.getSizeInventory(); i++) {
					ItemStack itemstack = tileEntityFurnace.getStackInSlot(i);
					
					if (itemstack != null) {
						float f = this.rand.nextFloat() * 0.6F + 0.1F;
						float f1 = this.rand.nextFloat() * 0.6F + 0.1F;
						float f2 = this.rand.nextFloat() * 0.6F + 0.1F;
						
						while (itemstack.stackSize > 0) {
							int j = this.rand.nextInt(21) + 10;
							
							if (j > itemstack.stackSize) {
								j = itemstack.stackSize;
							}
							
							itemstack.stackSize -= j;
							EntityItem entityItem = new EntityItem(world,
									(double) ((float) x + f),
									(double) ((float) y + f1),
									(double) ((float) z + f2),
									new ItemStack(itemstack.getItem(), j,
											itemstack.getItemDamage()));
							
							if (itemstack.hasTagCompound()) {
								entityItem.getEntityItem().setTagCompound(
										((NBTTagCompound) itemstack
												.getTagCompound().copy()));
							}
							
							float f3 = 0.025F;
							entityItem.motionX = (double) ((float) this.rand
									.nextGaussian() * f3);
							entityItem.motionY = (double) ((float) this.rand
									.nextGaussian() * f3 + 0.1F);
							entityItem.motionZ = (double) ((float) this.rand
									.nextGaussian() * f3);
							
							world.spawnEntityInWorld(entityItem);
						}
					}
				}
				
				world.func_147453_f(x, y, z, block);
			}
		}
		
		super.breakBlock(world, x, y, z, block, meta);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World world, int x, int y, int z,
			Random rand) {
		if (this.isBurning2) {
			int direction = world.getBlockMetadata(x, y, z);
			
			float xx = (float) x + 0.5F,
					yy = (float) y + rand.nextFloat() * 6.0F / 16.0F,
					zz = (float) z + 0.5F, xx2 = rand.nextFloat() * 0.3F - 0.2F,
					zz2 = 0.5F;
			
			if (direction == 4) {
				world.spawnParticle("smoke", (double) (xx - zz2), (double) yy,
						(double) (zz + xx2), 0.0F, 0.0F, 0.0F);
				world.spawnParticle("flame", (double) (xx - zz2), (double) yy,
						(double) (zz + xx2), 0.0F, 0.0F, 0.0F);
			} else if (direction == 5) {
				world.spawnParticle("smoke", (double) (xx - zz2), (double) yy,
						(double) (zz + xx2), 0.0F, 0.0F, 0.0F);
				world.spawnParticle("flame", (double) (xx - zz2), (double) yy,
						(double) (zz + xx2), 0.0F, 0.0F, 0.0F);
			} else if (direction == 3) {
				world.spawnParticle("smoke", (double) (xx - zz2), (double) yy,
						(double) (zz + xx2), 0.0F, 0.0F, 0.0F);
				world.spawnParticle("flame", (double) (xx - zz2), (double) yy,
						(double) (zz + xx2), 0.0F, 0.0F, 0.0F);
			} else if (direction == 2) {
				world.spawnParticle("smoke", (double) (xx - zz2), (double) yy,
						(double) (zz + xx2), 0.0F, 0.0F, 0.0F);
				world.spawnParticle("flame", (double) (xx - zz2), (double) yy,
						(double) (zz + xx2), 0.0F, 0.0F, 0.0F);
			}
		}
	}
}
