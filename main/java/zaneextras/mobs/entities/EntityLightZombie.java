package zaneextras.mobs.entities;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
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
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import zaneextras.items.ItemList;

public class EntityLightZombie extends EntityMob {
	
	private final EntityAIBreakDoor field_146075_bs = new EntityAIBreakDoor(
			this);
	private boolean field_146076_bu = false;
	
	public EntityLightZombie(World p_i1745_1_) {
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
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange)
				.setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(50.0D);
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
			float f = this.getBrightness(1.0F);
			
			if (f <= 0.5F && this.rand.nextFloat() * 30.0F > (f - 0.4F) * 2.0F
					&& this.worldObj.canBlockSeeTheSky(
							MathHelper.floor_double(this.posX),
							MathHelper.floor_double(this.posY),
							MathHelper.floor_double(this.posZ))) {
				
				if (!this.isPotionActive(Potion.weakness.id)) {
					this.clearActivePotions();
				}
				
				this.addPotionEffect(
						new PotionEffect(Potion.weakness.id, 10000, 2));
			} else {
				
				if (!this.isPotionActive(Potion.regeneration.id)
						&& !this.isPotionActive(Potion.resistance.id)) {
					this.clearActivePotions();
				}
				this.clearActivePotions();
				this.addPotionEffect(
						new PotionEffect(Potion.regeneration.id, 10000, 1));
				this.addPotionEffect(
						new PotionEffect(Potion.resistance.id, 10000, 2));
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
		return "mob.zombie.say";
	}
	
	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound() {
		return "mob.zombie.hurt";
	}
	
	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound() {
		return "mob.zombie.death";
	}
	
	@Override
	protected void func_145780_a(int p_145780_1_, int p_145780_2_,
			int p_145780_3_, Block p_145780_4_) {
		this.playSound("mob.zombie.step", 0.15F, 1.0F);
	}
	
	@Override
	protected Item getDropItem() {
		return ItemList.lightFlesh;
	}
	
	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}
	
	@Override
	protected void dropRareDrop(int p_70600_1_) {
		switch (this.rand.nextInt(3)) {
		case 0:
			this.dropItem(ItemList.italian, 1);
			break;
		case 1:
			this.dropItem(ItemList.ranch, 1);
			break;
		case 2:
			this.dropItem(ItemList.french, 1);
		}
	}
	
	/**
	 * Makes entity wear random armor based on difficulty
	 */
	@Override
	protected void addRandomArmor() {
		super.addRandomArmor();
		
		if (this.rand
				.nextFloat() < (this.worldObj.difficultySetting == EnumDifficulty.HARD
						? 0.05F : 0.01F)) {
			int i = this.rand.nextInt(3);
			
			if (i == 0) {
				this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_sword));
			} else {
				this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_shovel));
			}
		}
	}
	
	@Override
	protected boolean isValidLightLevel() {
		
		int i = MathHelper.floor_double(this.posX);
		int j = MathHelper.floor_double(this.boundingBox.minY);
		int k = MathHelper.floor_double(this.posZ);
		
		int l = this.worldObj.getBlockLightValue(i, j, k);
		
		return l >= this.rand.nextInt(8);
	}
}