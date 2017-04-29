package zaneextras.worldgen;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCrops extends WorldGenerator {
	
	public Block blockCrop;
	public Block blockDirt;
	public boolean farmHasWater = true;
	
	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.farmland, Blocks.grass, Blocks.sand,
				Blocks.gravel, Blocks.soul_sand, Blocks.netherrack,
				Blocks.nether_brick };
	}
	
	public WorldGenCrops(Block cropBlock) {
		this.blockCrop = cropBlock;
		this.blockDirt = Blocks.farmland;
	}
	
	public WorldGenCrops(Block cropBlock, Block dirtBlock) {
		this.blockCrop = cropBlock;
		this.blockDirt = dirtBlock;
	}
	
	public WorldGenCrops(Block cropBlock, Block dirtBlock, boolean hasWater) {
		this.blockCrop = cropBlock;
		this.blockDirt = dirtBlock;
		this.farmHasWater = hasWater;
	}
	
	public boolean LocationIsValidSpawn(World world, int i, int j, int k) {
		int distanceToAir = 0;
		Block checkID = world.getBlock(i, j, k);
		
		while (checkID != Blocks.air) {
			distanceToAir++;
			checkID = world.getBlock(i, j + distanceToAir, k);
		}
		
		if (distanceToAir > 3) {
			return false;
		}
		j += distanceToAir - 1;
		
		Block blockID = world.getBlock(i, j, k);
		Block blockIDAbove = world.getBlock(i, j + 1, k);
		Block blockIDBelow = world.getBlock(i, j - 1, k);
		for (Block x : GetValidSpawnBlocks()) {
			if (blockIDAbove != Blocks.air) {
				return false;
			}
			if (blockID == x) {
				return true;
			} else if (blockID == Blocks.snow && blockIDBelow == x) {
				return true;
			}
		}
		return false;
	}
	
	public WorldGenCrops() {
	}
	
	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {
		// check that each corner is one of the valid spawn blocks
		if (!LocationIsValidSpawn(world, i, j, k)) {
			return false;
		}
		
		world.setBlock(i + 1, j + 0, k + 1, blockDirt);
		world.setBlock(i + 1, j + 0, k + 1, blockDirt);
		world.setBlock(i + 1, j + 0, k + 2, blockDirt);
		world.setBlock(i + 1, j + 0, k + 3, blockDirt);
		world.setBlock(i + 1, j + 0, k + 4, blockDirt);
		world.setBlock(i + 1, j + 0, k + 5, blockDirt);
		world.setBlock(i + 1, j + 0, k + 6, blockDirt);
		world.setBlock(i + 1, j + 0, k + 7, blockDirt);
		world.setBlock(i + 1, j + 0, k + 8, blockDirt);
		world.setBlock(i + 1, j + 0, k + 9, blockDirt);
		world.setBlock(i + 1, j + 0, k + 10, blockDirt);
		world.setBlock(i + 2, j + 0, k + 1, blockDirt);
		world.setBlock(i + 2, j + 0, k + 10, blockDirt);
		Block blockToPlace = (this.farmHasWater) ? Blocks.water : blockDirt;
		world.setBlock(i + 2, j + 0, k + 2, blockToPlace);
		world.setBlock(i + 2, j + 0, k + 3, blockToPlace);
		world.setBlock(i + 2, j + 0, k + 4, blockToPlace);
		world.setBlock(i + 2, j + 0, k + 5, blockToPlace);
		world.setBlock(i + 2, j + 0, k + 6, blockToPlace);
		world.setBlock(i + 2, j + 0, k + 7, blockToPlace);
		world.setBlock(i + 2, j + 0, k + 8, blockToPlace);
		world.setBlock(i + 2, j + 0, k + 9, blockToPlace);
		world.setBlock(i + 2, j + 0, k + 10, blockDirt);
		world.setBlock(i + 3, j + 0, k + 1, blockDirt);
		world.setBlock(i + 3, j + 0, k + 2, blockDirt);
		world.setBlock(i + 3, j + 0, k + 3, blockDirt);
		world.setBlock(i + 3, j + 0, k + 4, blockDirt);
		world.setBlock(i + 3, j + 0, k + 5, blockDirt);
		world.setBlock(i + 3, j + 0, k + 6, blockDirt);
		world.setBlock(i + 3, j + 0, k + 7, blockDirt);
		world.setBlock(i + 3, j + 0, k + 8, blockDirt);
		world.setBlock(i + 3, j + 0, k + 9, blockDirt);
		world.setBlock(i + 3, j + 0, k + 10, blockDirt);
		
		world.setBlock(i + 1, j + 1, k + 1, blockCrop);
		world.setBlock(i + 1, j + 1, k + 2, blockCrop);
		world.setBlock(i + 1, j + 1, k + 3, blockCrop);
		world.setBlock(i + 1, j + 1, k + 4, blockCrop);
		world.setBlock(i + 1, j + 1, k + 5, blockCrop);
		world.setBlock(i + 1, j + 1, k + 6, blockCrop);
		world.setBlock(i + 1, j + 1, k + 7, blockCrop);
		world.setBlock(i + 1, j + 1, k + 8, blockCrop);
		world.setBlock(i + 1, j + 1, k + 9, blockCrop);
		world.setBlock(i + 1, j + 1, k + 10, blockCrop);
		world.setBlock(i + 2, j + 1, k + 1, blockCrop);
		world.setBlock(i + 2, j + 1, k + 10, blockCrop);
		world.setBlock(i + 3, j + 1, k + 1, blockCrop);
		world.setBlock(i + 3, j + 1, k + 2, blockCrop);
		world.setBlock(i + 3, j + 1, k + 3, blockCrop);
		world.setBlock(i + 3, j + 1, k + 4, blockCrop);
		world.setBlock(i + 3, j + 1, k + 5, blockCrop);
		world.setBlock(i + 3, j + 1, k + 6, blockCrop);
		world.setBlock(i + 3, j + 1, k + 7, blockCrop);
		world.setBlock(i + 3, j + 1, k + 8, blockCrop);
		world.setBlock(i + 3, j + 1, k + 9, blockCrop);
		world.setBlock(i + 3, j + 1, k + 10, blockCrop);
		
		world.setBlock(i + 1, j - 1, k + 1, blockDirt);
		world.setBlock(i + 1, j - 1, k + 2, blockDirt);
		world.setBlock(i + 1, j - 1, k + 3, blockDirt);
		world.setBlock(i + 1, j - 1, k + 4, blockDirt);
		world.setBlock(i + 1, j - 1, k + 5, blockDirt);
		world.setBlock(i + 1, j - 1, k + 6, blockDirt);
		world.setBlock(i + 1, j - 1, k + 7, blockDirt);
		world.setBlock(i + 1, j - 1, k + 8, blockDirt);
		world.setBlock(i + 1, j - 1, k + 9, blockDirt);
		world.setBlock(i + 1, j - 1, k + 10, blockDirt);
		world.setBlock(i + 2, j - 1, k + 1, blockDirt);
		world.setBlock(i + 2, j - 1, k + 2, blockDirt);
		world.setBlock(i + 2, j - 1, k + 3, blockDirt);
		world.setBlock(i + 2, j - 1, k + 4, blockDirt);
		world.setBlock(i + 2, j - 1, k + 5, blockDirt);
		world.setBlock(i + 2, j - 1, k + 6, blockDirt);
		world.setBlock(i + 2, j - 1, k + 7, blockDirt);
		world.setBlock(i + 2, j - 1, k + 8, blockDirt);
		world.setBlock(i + 2, j - 1, k + 9, blockDirt);
		world.setBlock(i + 2, j - 1, k + 10, blockDirt);
		world.setBlock(i + 3, j - 1, k + 1, blockDirt);
		world.setBlock(i + 3, j - 1, k + 2, blockDirt);
		world.setBlock(i + 3, j - 1, k + 3, blockDirt);
		world.setBlock(i + 3, j - 1, k + 4, blockDirt);
		world.setBlock(i + 3, j - 1, k + 5, blockDirt);
		world.setBlock(i + 3, j - 1, k + 6, blockDirt);
		world.setBlock(i + 3, j - 1, k + 7, blockDirt);
		world.setBlock(i + 3, j - 1, k + 8, blockDirt);
		world.setBlock(i + 3, j - 1, k + 9, blockDirt);
		world.setBlock(i + 3, j - 1, k + 10, blockDirt);
		
		world.setBlock(i + 1, j - 1, k + 1, blockDirt);
		world.setBlock(i + 1, j - 1, k + 2, blockDirt);
		world.setBlock(i + 1, j - 1, k + 3, blockDirt);
		world.setBlock(i + 1, j - 1, k + 4, blockDirt);
		world.setBlock(i + 1, j - 1, k + 5, blockDirt);
		world.setBlock(i + 1, j - 1, k + 6, blockDirt);
		world.setBlock(i + 1, j - 1, k + 7, blockDirt);
		world.setBlock(i + 1, j - 1, k + 8, blockDirt);
		world.setBlock(i + 1, j - 1, k + 9, blockDirt);
		world.setBlock(i + 1, j - 1, k + 10, blockDirt);
		world.setBlock(i + 2, j - 1, k + 1, blockDirt);
		world.setBlock(i + 2, j - 1, k + 10, blockDirt);
		world.setBlock(i + 3, j - 1, k + 1, blockDirt);
		world.setBlock(i + 3, j - 1, k + 2, blockDirt);
		world.setBlock(i + 3, j - 1, k + 3, blockDirt);
		world.setBlock(i + 3, j - 1, k + 4, blockDirt);
		world.setBlock(i + 3, j - 1, k + 5, blockDirt);
		world.setBlock(i + 3, j - 1, k + 6, blockDirt);
		world.setBlock(i + 3, j - 1, k + 7, blockDirt);
		world.setBlock(i + 3, j - 1, k + 8, blockDirt);
		world.setBlock(i + 3, j - 1, k + 9, blockDirt);
		world.setBlock(i + 3, j - 1, k + 10, blockDirt);
		return true;
	}
}