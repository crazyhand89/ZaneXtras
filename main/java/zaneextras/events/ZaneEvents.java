package zaneextras.events;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import zaneextras.blocks.BlockList;
import zaneextras.config.ZaneConfig;
import zaneextras.items.ItemList;
import zaneextras.items.armor.butter.ButterArmor;
import zaneextras.items.armor.emerald.EmeraldArmor;
import zaneextras.items.armor.skyium.SkyiumArmor;
import zaneextras.items.armor.staria.StariaArmor;
import zaneextras.items.armor.zanium.ZaniumArmor;
import zaneextras.lib.helpers.ZaneDSource;
import zaneextras.mobs.entities.EntityHellSheep;
import zaneextras.potions.ZanePotion;

public class ZaneEvents {
	
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onLivingUpdate(LivingUpdateEvent event) {
		EntityLivingBase entity = event.entityLiving;
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack[] armor = player.inventory.armorInventory;
			int armorCount = 0;
			int emArmorCount = 0;
			int sArmorCount = 0;
			int zArmorCount = 0;
			int skyArmorCount = 0;
			for (ItemStack armorStack : armor) {
				if (armorStack != null
						&& armorStack.getItem() instanceof ButterArmor) {
					ButterArmor butterArmor = (ButterArmor) armorStack
							.getItem();
					armorCount++;
				} else if (armorStack != null
						&& armorStack.getItem() instanceof EmeraldArmor) {
					EmeraldArmor emeraldArmor = (EmeraldArmor) armorStack
							.getItem();
					emArmorCount++;
				} else if (armorStack != null
						&& armorStack.getItem() instanceof StariaArmor) {
					StariaArmor emeraldArmor = (StariaArmor) armorStack
							.getItem();
					sArmorCount++;
				} else if (armorStack != null
						&& armorStack.getItem() instanceof ZaniumArmor) {
					ZaniumArmor emeraldArmor = (ZaniumArmor) armorStack
							.getItem();
					zArmorCount++;
				} else if (armorStack != null
						&& armorStack.getItem() instanceof SkyiumArmor) {
					SkyiumArmor emeraldArmor = (SkyiumArmor) armorStack
							.getItem();
					skyArmorCount++;
				}
				for (int i = 0; i < 4; ++i) {
					if (armorCount == 4) {
						player.addPotionEffect(
								new PotionEffect(Potion.moveSpeed.id, 100, 1));
					} else if (emArmorCount == 4) {
						if (!player
								.isPotionActive(Potion.regeneration.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.regeneration.id, 100, 0));
						}
						if (!player.isPotionActive(Potion.resistance.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.resistance.id, 100, 0));
						}
					} else if (sArmorCount == 4) {
						if (!player
								.isPotionActive(Potion.regeneration.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.regeneration.id, 100, 1));
						}
						if (!player.isPotionActive(Potion.resistance.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.resistance.id, 100, 1));
						}
						if (!player.isPotionActive(
								Potion.fireResistance.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.fireResistance.id, 100, 0));
						}
					} else if (zArmorCount == 4) {
						if (!player
								.isPotionActive(Potion.regeneration.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.regeneration.id, 100, 1));
						}
						if (!player.isPotionActive(Potion.resistance.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.resistance.id, 100, 1));
						}
						if (!player.isPotionActive(
								Potion.fireResistance.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.fireResistance.id, 100, 0));
						}
					} else if (skyArmorCount == 4) {
						if (!player.isPotionActive(Potion.digSpeed.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.digSpeed.id, 100, 1));
						}
						if (!player.isPotionActive(Potion.jump.getId())) {
							player.addPotionEffect(
									new PotionEffect(Potion.jump.id, 100, 1));
						}
						if (!player
								.isPotionActive(Potion.nightVision.getId())) {
							player.addPotionEffect(new PotionEffect(
									Potion.nightVision.id, 1200, 0));
						}
					}
				}
			}
		}
		// Let's make 100% certain that we're actually using a Player
		// entity.
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			// Check to see if we're in the Upside-Down dimension.
			if (player.dimension == ZaneConfig.dimensionLightID) {
				
				// Hurt the Player every few ticks, unless they have the
				// "Radiance" potion effect. What this does is it checks the
				// Player's inventory for the Radiance item, and if it finds
				// it,
				// it automatically uses its potion effect (which consumes
				// the
				// item) to apply Radiance to the Player, protecting them
				// from
				// Shadow damage. However, it will only automatically use
				// itself
				// in the Upside-Down. Anywhere else, it must be used
				// manually
				// with a right-click.
				
				if (!player.isPotionActive(ZanePotion.barrier)
						&& !player.capabilities.isCreativeMode) {
					player.attackEntityFrom(ZaneDSource.deathLight,
							ZanePotion.burnDamage);
				}
			}
		}
	}
	
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onAttackEntity(AttackEntityEvent event) {
		EntityPlayer player = event.entityPlayer;
		Entity entityHit = event.target;
		
		// TODO: Get code for specific arrow hit
		if (entityHit instanceof EntityLiving) {
			
		}
	}
	
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onEntityStruckByLightningEvent(
			EntityStruckByLightningEvent event) {
		Entity theEntity = event.entity;
		World world = theEntity.worldObj;
		if (theEntity.getClass() == EntitySheep.class) {
			EntitySheep theSheep = (EntitySheep) theEntity;
			theSheep.setDead();
			EntityHellSheep hellSheep = new EntityHellSheep(world);
			hellSheep.setCurrentItemOrArmor(0,
					new ItemStack(ItemList.emeraldSword));
			hellSheep.setLocationAndAngles(theSheep.posX, theSheep.posY,
					theSheep.posZ, theSheep.rotationYaw,
					theSheep.rotationPitch);
			
			world.spawnEntityInWorld(hellSheep);
		}
	}
	
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void FillBucket(FillBucketEvent event) {
		ItemStack result = attemptFill(event.world, event.target);
		if (result != null) {
			event.result = result;
			event.setResult(Result.ALLOW);
		}
	}
	
	private ItemStack attemptFill(World world, MovingObjectPosition p) {
		Block id = world.getBlock(p.blockX, p.blockY, p.blockZ);
		
		if (id == BlockList.acidFluidBlock) {
			if (world.getBlockMetadata(p.blockX, p.blockY, p.blockZ) == 0) {
				// Remove the fluid block
				world.setBlock(p.blockX, p.blockY, p.blockZ, Blocks.air);
				
				// return the item bucket here
				return new ItemStack(ItemList.acidBucket);
			}
		}
		
		if (id == BlockList.chlorineFluidBlock) {
			if (world.getBlockMetadata(p.blockX, p.blockY, p.blockZ) == 0) {
				// Remove the fluid block
				world.setBlock(p.blockX, p.blockY, p.blockZ, Blocks.air);
				
				// return the item bucket here
				return new ItemStack(ItemList.chlorineBucket);
			}
		}
		
		if (id == BlockList.raditeFluidBlock)
		
		{
			if (world.getBlockMetadata(p.blockX, p.blockY, p.blockZ) == 0) {
				// Remove the fluid block
				world.setBlock(p.blockX, p.blockY, p.blockZ, Blocks.air);
				
				// return the item bucket here
				return new ItemStack(ItemList.raditeBucket);
			}
		}
		
		return null;
		
	}
	
}