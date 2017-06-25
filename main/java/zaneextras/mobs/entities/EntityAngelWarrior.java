package zaneextras.mobs.entities;

import java.util.Calendar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import zaneextras.interfaces.ILightEntity;
import zaneextras.items.ItemList;
import zaneextras.lib.ModInfo;

public class EntityAngelWarrior extends EntityMob implements ILightEntity {
	
	private final EntityAIBreakDoor field_146075_bs = new EntityAIBreakDoor(
			this);
	private boolean field_146076_bu = false;
	private int tick = 0;
	
	public EntityAngelWarrior(World p_i1745_1_) {
		super(p_i1745_1_);
		this.getNavigator().setBreakDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this,
				EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this,
				EntityVillager.class, 1.0D, true));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(6,
				new EntityAIMoveThroughVillage(this, 1.0D, false));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8,
				new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
				EntityPlayer.class, 0, true));
		this.isImmuneToFire = true;
	}
	
	/**
	 * Gets how bright this entity is.
	 */
	@Override
	public float getBrightness(float p_70013_1_) {
		return 1.0F;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(float p_70070_1_) {
		return 15728880;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange)
				.setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(7.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(125.0D);
	}
	
	@Override
	public int getTotalArmorValue() {
		int i = super.getTotalArmorValue() + 2;
		
		if (i > 20) {
			i = 20;
		}
		
		return i;
	}
	
	@Override
	protected boolean isAIEnabled() {
		return true;
	}
	
	public boolean func_146072_bX() {
		return this.field_146076_bu;
	}
	
	public void func_146070_a(boolean p_146070_1_) {
		if (this.field_146076_bu != p_146070_1_) {
			this.field_146076_bu = p_146070_1_;
			
			if (p_146070_1_) {
				this.tasks.addTask(1, this.field_146075_bs);
			} else {
				this.tasks.removeTask(this.field_146075_bs);
			}
		}
	}
	
	@Override
	public void onLivingUpdate() {
		if (!this.worldObj.isRemote) {
			tick++;
			
			if (tick >= 200) {
				this.heal(15);
				tick = 0;
				
				if (!this.isPotionActive(Potion.resistance.id)) {
					this.addPotionEffect(
							new PotionEffect(Potion.resistance.id, 10000, 0));
				}
			}
		}
		
		if (this.isRiding() && this.getAttackTarget() != null
				&& this.ridingEntity instanceof EntityChicken) {
			((EntityLiving) this.ridingEntity).getNavigator()
					.setPath(this.getNavigator().getPath(), 1.5D);
		}
		
		super.onLivingUpdate();
	}
	
	@Override
	public boolean attackEntityAsMob(Entity p_70652_1_) {
		boolean flag = super.attackEntityAsMob(p_70652_1_);
		
		if (flag) {
			int i = this.worldObj.difficultySetting.getDifficultyId();
			
			if (this.getHeldItem() == null && this.isBurning()
					&& this.rand.nextFloat() < i * 0.3F) {
				p_70652_1_.setFire(2 * i);
			}
		}
		
		return flag;
	}
	
	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound() {
		return ModInfo.MODID + ":mob.angel.say";
	}
	
	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound() {
		return ModInfo.MODID + ":mob.angel.hurt";
	}
	
	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound() {
		return ModInfo.MODID + ":mob.angel.die";
	}
	
	@Override
	protected void func_145780_a(int p_145780_1_, int p_145780_2_,
			int p_145780_3_, Block p_145780_4_) {
		this.playSound("mob.zombie.step", 0.15F, 1.0F);
	}
	
	@Override
	protected Item getDropItem() {
		
		return ItemList.lightNugget;
	}
	
	/**
	 * Drop 0-2 items of this living's type. @param par1 - Whether this entity
	 * has recently been hit by a player. @param par2 - Level of Looting used to
	 * kill this mob.
	 */
	@Override
	protected void dropRareDrop(int p_70600_1_) {
		int drop = this.rand.nextInt(2);
		
		if (drop == 0) {
			this.dropItem(ItemList.angelHalo, 1);
		} else if (drop == 1) {
			this.dropItem(ItemList.pureFeather, 1);
		} else
			this.dropItem(ItemList.barrierApple, 1);
	}
	
	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}
	
	/**
	 * Makes entity wear random armor based on difficulty
	 */
	@Override
	protected void addRandomArmor() {
		super.addRandomArmor();
		
		if (this.worldObj.difficultySetting == EnumDifficulty.HARD) {
			ItemStack skySword = new ItemStack(ItemList.skyiumSword, 1);
			this.setCurrentItemOrArmor(0, skySword);
		} else {
			ItemStack angelSword = new ItemStack(ItemList.angelSword, 1);
			
			angelSword.addEnchantment(Enchantment.sharpness, 5);
			
			this.setCurrentItemOrArmor(0, angelSword);
		}
	}
	
	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData p_110161_1_) {
		p_110161_1_ = super.onSpawnWithEgg(p_110161_1_);
		this.addRandomArmor();
		this.enchantEquipment();
		
		this.setCanPickUpLoot(this.rand.nextFloat() < 0.55F
				* this.worldObj.func_147462_b(this.posX, this.posY, this.posZ));
		
		if (this.getEquipmentInSlot(4) == null) {
			Calendar calendar = this.worldObj.getCurrentDate();
			
			if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31
					&& this.rand.nextFloat() < 0.25F) {
				this.setCurrentItemOrArmor(4,
						new ItemStack(this.rand.nextFloat() < 0.1F
								? Blocks.lit_pumpkin : Blocks.pumpkin));
				this.equipmentDropChances[4] = 0.0F;
			}
		}
		
		return p_110161_1_;
	}
}