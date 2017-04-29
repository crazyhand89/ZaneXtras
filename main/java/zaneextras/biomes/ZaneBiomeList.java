package zaneextras.biomes;

import java.util.ArrayList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import zaneextras.config.ZaneConfig;

public class ZaneBiomeList {
	
	public static int biomeColor = 1204859;
	public static ArrayList<BiomeGenBase> biomeGenList = new ArrayList<BiomeGenBase>();
	
	public static BiomeGenBase lightBiome = new BiomeGenLight(
			ZaneConfig.lightBiomeID);
	
	public static void init() {
		addNoSpawnBiome(lightBiome, BiomeType.WARM, 0);
	}
	
	public static void addBiome(BiomeGenBase biome, BiomeType biomeType,
			int biomeWeight) {
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, biomeWeight));
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addVillageBiome(biome, true);
		BiomeManager.addStrongholdBiome(biome);
		biomeGenList.add(biome);
	}
	
	public static void addNoSpawnBiome(BiomeGenBase biome, BiomeType biomeType,
			int biomeWeight) {
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, biomeWeight));
		BiomeManager.addVillageBiome(biome, true);
		BiomeManager.addStrongholdBiome(biome);
	}
}