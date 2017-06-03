package zaneextras.worldgen;

import java.util.Random;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import zaneextras.blocks.BlockList;
import zaneextras.config.ZaneConfig;

public class ZaneWorldGen implements IWorldGenerator {
	
	public static BiomeGenBase currentBiome;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0: // Overworld
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case -1: // Nether
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
		
		if (world.provider.dimensionId == ZaneConfig.dimensionLightID) {
			generateLightWorld(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	
	private void generateSurface(World world, Random random, int x, int z) {
		// Grab Biome
		currentBiome = world.getBiomeGenForCoords(x, z);
		int y = world.getHeightValue(x, z);
		
		// Sky Castle of Nope
		
		if (random.nextInt(ZaneConfig.skyCastleSpawnRate1) <= 5)
			this.spawnStructure(ZaneConfig.skyCastleSpawnRate2,
					ZaneConfig.skyCastleSpawnRate3, world, random, x, y, z,
					new WorldGenCastle());
		
		this.spawnStructure(ZaneConfig.meteroiteChance1,
				ZaneConfig.meteroiteChance2, world, random, x, y, z,
				new WorldGenMeteroite());
		
		// Underground Ores
		addOreSpawn(BlockList.dhbOre, world, random, x, z, 16, 16,
				4 + random.nextInt(4), ZaneConfig.oreButterSpawnRate, 4, 32);
		addOreSpawn(BlockList.sodiumOre, world, random, x, z, 16, 16,
				4 + random.nextInt(4), ZaneConfig.oreSodiumSpawnRate, 4, 32);
		addOreSpawn(BlockList.stariaOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreStariaSpawnRate, 2, 16);
		addOreSpawn(BlockList.zogiteOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreZogiteSpawnRate, 5, 20);
		addOreSpawn(BlockList.raditeOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreRaditeSpawnRate, 5, 20);
		addOreSpawn(BlockList.raditeOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreFoolStaria, 10, 18);
		
		Random r = new Random();
		
		// Sky Ores
		if (r.nextInt(100) <= 3) {
			addOreSpawnAir(BlockList.skyiumOre, world, random, x, z, 16, 16,
					2 + random.nextInt(2), ZaneConfig.oreSkyiumSpawnRate, 200,
					205);
		}
		
		// Light Trees
		if (random.nextInt(150) <= 5) {
			if (currentBiome.equals(BiomeGenBase.birchForest)
					|| currentBiome.equals(BiomeGenBase.birchForestHills)
					|| currentBiome.equals(BiomeGenBase.forest)
					|| currentBiome.equals(BiomeGenBase.forestHills)
					|| currentBiome.equals(BiomeGenBase.plains)) {
				this.spawnStructure(10, 100, world, random, x, y, z,
						new WorldGenLightTree());
			}
		}
		// Crops
		if (r.nextInt(100) <= 55) {
			if (currentBiome.equals(BiomeGenBase.plains)
					|| currentBiome.equals(BiomeGenBase.forest)
					|| currentBiome.equals(BiomeGenBase.savanna)) {
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.sweetPotatoCrop));
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.pepperCrop));
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.lettuceBlock));
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.spinachCrop));
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.greenBeanCrop));
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.garlicCrop));
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.onionCrop));
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.peppercornCrop));
				this.spawnStructure(ZaneConfig.cropSpawnRate, 200, world,
						random, x, (y - 1), z,
						new WorldGenCrops(BlockList.tomatoBlock));
			}
		}
		
		// Acid
		if (new Random().nextInt(125) <= ZaneConfig.liquidAcidSpawnRate) {
			new WorldGenLakes(BlockList.acidFluidBlock).generate(world, random,
					x - 10, y, z - 10);
		}
		
		// Chlorine
		if (r.nextInt(100) <= 10) {
			if (new Random()
					.nextInt(125) <= ZaneConfig.liquidChlorineSpawnRate) {
				new WorldGenLakes(BlockList.chlorineFluidBlock).generate(world,
						random, x + 10, y, z + 10);
			}
		}
	}
	
	private void generateNether(World world, Random random, int x, int z) {
		int Xcoord = x + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(128);
		int Zcoord = z + random.nextInt(16);
		
		// Red Glowstone
		this.spawnStructure(4, 8, world, random, Xcoord, Ycoord, Zcoord,
				new WorldGenRedGlow());
		this.spawnStructure(4, 6, world, random, Xcoord, Ycoord, Zcoord,
				new WorldGenRedGlow2());
		
		// Ghost Peppers
		this.spawnStructure(ZaneConfig.cropSpawnRateNether, 200, world, random,
				x, (Ycoord - 1), z, new WorldGenCrops(BlockList.ghostCrop,
						Blocks.soul_sand, false));
		
		// Red Glowstone
		new WorldGenNetherMinable(BlockList.redGlow, 0, 8).generate(world,
				random, Xcoord, Ycoord, Zcoord);
		
		Random r = new Random();
		
		// Hell Ores
		if (r.nextInt(99) <= ZaneConfig.oreZaniumSpawnRate) {
			new WorldGenNetherMinable(BlockList.zaniumOre, 0, 1).generate(world,
					random, Xcoord, Ycoord, Zcoord);
		}
	}
	
	public void generateLightWorld(World world, Random random, int x, int z) {
		int y = world.getHeightValue(x, z);
		if (random.nextInt(200) <= 25) {
			this.spawnStructure(10, 100, world, random, x, y, z,
					new WorldGenLightTree());
		}
		
		// Light Ores
		addLightOreSpawn(BlockList.lightDiamondOre, world, random, x, z, 16, 16,
				2 + random.nextInt(6), ZaneConfig.oreLightDiamond, 4, 16);
		addLightOreSpawn(BlockList.lightEmeraldOre, world, random, x, z, 16, 16,
				0 + random.nextInt(3), ZaneConfig.oreLightEmerald, 6, 12);
		addLightOreSpawn(BlockList.lightGoldOre, world, random, x, z, 16, 16,
				2 + random.nextInt(4), ZaneConfig.oreLightGold, 6, 25);
		addLightOreSpawn(BlockList.lightIronOre, world, random, x, z, 16, 16,
				3 + random.nextInt(5), ZaneConfig.oreLightIron, 6, 40);
		addLightOreSpawn(BlockList.lightLapisOre, world, random, x, z, 6, 16,
				2 + random.nextInt(5), ZaneConfig.oreLightLapis, 6, 25);
		addLightOreSpawn(BlockList.lightRedstoneOre, world, random, x, z, 16,
				16, 2 + random.nextInt(5), ZaneConfig.oreLightRedstone, 6, 25);
		addLightOreSpawn(BlockList.stariaOre, world, random, x, z, 16, 16,
				2 + random.nextInt(6), ZaneConfig.oreLightStaria, 4, 16);
		
		this.spawnStructure(100, 1000, world, random, x, y, z,
				new AngelFortress());
	}
	
	public void addOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0
				&& maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256
				&& maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0
				&& maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block, maxVeinSize).generate(world, random,
					posX, posY, posZ);
		}
	}
	
	public void addOreSpawnAir(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0
				&& maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256
				&& maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0
				&& maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new ZaneWorldGenMinable(block, maxVeinSize).generate(world, random,
					posX, posY, posZ);
		}
	}
	
	public static void spawnStructure(int minChance, int maxChance, World world,
			Random random, int x, int y, int z, WorldGenerator wg) {
		if (random.nextInt(maxChance) <= minChance) {
			wg.generate(world, random, x, y, z);
		}
	}
	
	public void addLightOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0
				&& maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256
				&& maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0
				&& maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new ZaneWorldGenMinableLight(block, maxVeinSize).generate(world,
					random, posX, posY, posZ);
		}
	}
}