package zaneextras.mobs;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import zaneextras.biomes.ZaneBiomeList;
import zaneextras.lib.ModInfo;
import zaneextras.mobs.entities.EntityAngel;
import zaneextras.mobs.entities.EntityAngelArcher;
import zaneextras.mobs.entities.EntityAngelWarrior;
import zaneextras.mobs.entities.EntityHellSheep;
import zaneextras.mobs.entities.EntityLightSkeleton;
import zaneextras.mobs.entities.EntityLightZombie;
import zaneextras.mobs.entities.EntitySkeletonKing;
import zaneextras.mobs.entities.EntityUriel;

public class MobList {
	
	private static int startEntityId = 300;
	
	public static void init() {
		
		// Hell Sheep
		registerEntity(EntityHellSheep.class, "hellsheep", 0xff3333, 0xe6e6e6);
		EntityRegistry.addSpawn(EntityHellSheep.class, 11, 3, 5,
				EnumCreatureType.monster, BiomeGenBase.hell);
		
		// Light Skeleton (Lightington?)
		registerEntity(EntityLightSkeleton.class, "lightskeleton", 0xff4444,
				0xe6e6e6);
		EntityRegistry.addSpawn(EntityLightSkeleton.class, 11, 3, 5,
				EnumCreatureType.monster, ZaneBiomeList.lightBiome);
		
		// Light Zombie
		registerEntity(EntityLightZombie.class, "lightzombie", 0xe6e6e6,
				0xff3333);
		EntityRegistry.addSpawn(EntityLightZombie.class, 11, 3, 5,
				EnumCreatureType.monster, ZaneBiomeList.lightBiome);
		
		// Skeleton King
		registerEntity(EntitySkeletonKing.class, "skeletonking", 0xff555,
				0xe2e2e2);
		
		// Angel
		registerEntity(EntityAngel.class, "lightangel", 0xe7e6e6, 0xff3333);
		EntityRegistry.addSpawn(EntityAngel.class, 11, 3, 5,
				EnumCreatureType.monster, ZaneBiomeList.lightBiome);
		
		// Angel Warrior
		registerEntity(EntityAngelWarrior.class, "angelwarrior", 0xe5e6e6,
				0xff7333);
		EntityRegistry.addSpawn(EntityAngelWarrior.class, 11, 3, 5,
				EnumCreatureType.monster, ZaneBiomeList.lightBiome);
		
		// Angel Archer
		registerEntity(EntityAngelArcher.class, "angelarcher", 0xe1e6e6,
				0xff7733);
		EntityRegistry.addSpawn(EntityAngelArcher.class, 11, 3, 5,
				EnumCreatureType.monster, ZaneBiomeList.lightBiome);
		
		// Uriel
		registerEntity(EntityUriel.class, "uriel", 0xe2e6e6, 0xff9733);
	}
	
	public static void registerEntity(Class<? extends EntityLiving> entity,
			String entityName, int entityPrimaryColor,
			int entitySecondaryColor) {
		int uniqueEntityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entity,
				ModInfo.MODID + "_" + entityName, uniqueEntityId);
		registerEntityEgg(entity, entityPrimaryColor, entitySecondaryColor);
	}
	
	public static void registerEntityEgg(Class<? extends EntityLiving> entity,
			int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id,
				new EntityEggInfo(id, primaryColor, secondaryColor));
	}
	
	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		} while (EntityList.getStringFromID(startEntityId) != null);
		return startEntityId;
	}
}