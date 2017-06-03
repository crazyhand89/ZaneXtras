package zaneextras.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import zaneextras.blocks.BlockList;
import zaneextras.mobs.entities.EntityAngel;
import zaneextras.mobs.entities.EntityLightSkeleton;
import zaneextras.mobs.entities.EntityLightZombie;

public class BiomeGenLight extends BiomeGenBase {
	
	public BiomeGenLight(int par1) {
		super(par1);
		setColor(ZaneBiomeList.biomeColor);
		this.theBiomeDecorator.generateLakes = false;
		setDisableRain();
		setBiomeName("Promised-Land");
		temperature = 6F;
		setHeight(BiomeGenBase.height_HighPlateaus);
		topBlock = BlockList.lightGrassDirt;
		fillerBlock = BlockList.lightStone;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList
				.add(new SpawnListEntry(EntityLightSkeleton.class, 3, 0, 1));
		this.spawnableMonsterList
				.add(new SpawnListEntry(EntityLightZombie.class, 3, 0, 1));
		this.spawnableCreatureList
				.add(new SpawnListEntry(EntityLightSkeleton.class, 3, 0, 1));
		this.spawnableCreatureList
				.add(new SpawnListEntry(EntityLightZombie.class, 3, 0, 1));
		this.spawnableCaveCreatureList
				.add(new SpawnListEntry(EntityLightSkeleton.class, 3, 0, 1));
		this.spawnableCaveCreatureList
				.add(new SpawnListEntry(EntityLightZombie.class, 3, 0, 1));
		this.spawnableCaveCreatureList
				.add(new SpawnListEntry(EntityAngel.class, 3, 0, 1));
	}
}