package zaneextras.worldgen;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import zaneextras.blocks.BlockList;

public class WorldGenLightTree extends WorldGenerator {
	
	public Block logBlock;
	public Block leavesBlock;
	
	public WorldGenLightTree() {
		logBlock = BlockList.lightLog;
		leavesBlock = BlockList.lightLeaves;
	}
	
	protected Block[] GetValidSpawnBlockList() {
		return new Block[] { BlockList.lightDirt, BlockList.lightGrassDirt, Blocks.grass, Blocks.dirt };
	}
	
	public boolean LocationIsValidSpawn(World world, int i, int j, int k) {
		int distanceToAir = 0;
		Block checkID = world.getBlock(i, j, k);
		
		while (checkID != Blocks.air) {
			distanceToAir++;
			checkID = world.getBlock(i, j + distanceToAir, k);
		}
		
		if (distanceToAir > 8) {
			return false;
		}
		j += distanceToAir - 1;
		
		Block blockID = world.getBlock(i, j, k);
		Block blockIDAbove = world.getBlock(i, j + 1, k);
		Block blockIDBelow = world.getBlock(i, j - 1, k);
		for (Block x : GetValidSpawnBlockList()) {
			if (blockIDAbove != Blocks.air) {
				return false;
			}
			if (blockID == x) {
				return true;
			} else if (blockID == BlockList.lightStone && blockIDBelow == x) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		// check that each corner is one of the valid spawn blocks
		if (!LocationIsValidSpawn(world, i, j, k)) {
			return false;
		}
		
		int currentY = j;
		int rand = random.nextInt(5);// max height tree can be
		int logVert = rand >= 6 ? rand : 6;// if higher make number go lower
		
		for (int x = 0; x < logVert; x++) {
			world.setBlock(i, j + x, k, logBlock);
			
			// 15 is where logs stop, leaves start
			// have it 5 below the max tree height
			// so it lines up nice
			if (x >= 5) {
				world.setBlock(i + 1, j + x, k, leavesBlock);
				world.setBlock(i - 1, j + x, k, leavesBlock);
				
				world.setBlock(i + 1, j + x, k - 1, leavesBlock);
				world.setBlock(i - 1, j + x, k + 1, leavesBlock);
				
				world.setBlock(i, j + x, k - 1, leavesBlock);
				world.setBlock(i, j + x, k + 1, leavesBlock);
				
				world.setBlock(i + 1, j + x, k + 1, leavesBlock);
				world.setBlock(i - 1, j + x, k - 1, leavesBlock);
			}
			currentY = j + x;
		}
		
		int treeTop = currentY + 1;
		world.setBlock(i, treeTop, k, leavesBlock);
		world.setBlock(i + 1, treeTop, k, leavesBlock);
		world.setBlock(i - 1, treeTop, k, leavesBlock);
		world.setBlock(i, treeTop, k + 1, leavesBlock);
		world.setBlock(i, treeTop, k - 1, leavesBlock);
		world.setBlock(i, treeTop + 1, k, leavesBlock);
		
		return true;
	}
}