package zaneextras.mobs.entities;

import java.util.List;
import java.util.UUID;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import zaneextras.items.ItemList;

public class EntityAngel extends EntityMob {
	protected static final IAttribute field_110186_bp = (new RangedAttribute(
			"zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D))
					.setDescription("Spawn Reinforcements Chance");
	private static final UUID babySpeedBoostUUID = UUID
			.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
	private static final AttributeModifier babySpeedBoostModifier = new AttributeModifier(
			babySpeedBoostUUID, "Baby speed boost", 0.5D, 1);
	private final EntityAIBreakDoor field_146075_bs = new EntityAIBreakDoor(
			this);
	/**
	 * Ticker used to determine the time remaining for this zombie to convert
	 * into a villager when cured.
	 */
	private int conversionTime;
	private boolean field_146076_bu = false;
	private float field_146074_bv = -1.0F;
	private float field_146073_bw;
	private static final String __OBFID = "CL_00001702";
	private ChunkCoordinates spawnPosition;
	private int angerLevel;
	
	public EntityAngel(World p_i1745_1_) {
		super(p_i1745_1_);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this,
				EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(6,
				new EntityAIMoveThroughVillage(this, 1.0D, false));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8,
				new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
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
				.setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(150.0D);
		
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(4.0D);
	}
	
	@Override
	protected void entityInit() {
		super.entityInit();
		this.getDataWatcher().addObject(12, Byte.valueOf((byte) 0));
		this.getDataWatcher().addObject(13, Byte.valueOf((byte) 0));
		this.getDataWatcher().addObject(14, Byte.valueOf((byte) 0));
	}
	
	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setShort("Anger", (short) this.angerLevel);
	}
	
	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);
		this.angerLevel = par1NBTTagCompound.getShort("Anger");
	}
	
	@Override
	protected Entity findPlayerToAttack() {
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}
	
	/**
	 * Returns the current armor value as determined by a call to
	 * InventoryPlayer.getTotalArmorValue
	 */
	@Override
	public int getTotalArmorValue() {
		int i = super.getTotalArmorValue() + 2;
		
		if (i > 20) {
			i = 20;
		}
		
		return i;
	}
	
	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	@Override
	protected boolean isAIEnabled() {
		return true;
	}
	
	/**
	 * Get the experience points the entity currently has.
	 */
	@Override
	protected int getExperiencePoints(EntityPlayer p_70693_1_) {
		return super.getExperiencePoints(p_70693_1_);
	}
	
	/**
	 * Called when the entity is attacked.
	 */
	/**
	 * Called when the entity is attacked.
	 */
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
		if (this.isEntityInvulnerable()) {
			return false;
		} else {
			Entity entity = par1DamageSource.getEntity();
			
			if (entity instanceof EntityPlayer) {
				List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(
						this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));
				
				for (int i = 0; i < list.size(); ++i) {
					Entity entity1 = (Entity) list.get(i);
					
					if (entity1 instanceof EntityAngel) {
						EntityAngel entitypigzombie = (EntityAngel) entity1;
						entitypigzombie.becomeAngryAt(entity);
					}
				}
				
				this.becomeAngryAt(entity);
			}
			
			return super.attackEntityFrom(par1DamageSource, par2);
		}
	}
	
	/**
	 * Causes this PigZombie to become angry at the supplied Entity (which will
	 * be a player).
	 */
	private void becomeAngryAt(Entity par1Entity) {
		this.entityToAttack = par1Entity;
		this.angerLevel = 400 + this.rand.nextInt(400);
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
		return Items.feather;
	}
	
	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}
	
	@Override
	protected void dropRareDrop(int p_70600_1_) {
		this.dropItem(ItemList.pureFeather, 1);
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
	protected void updateAITasks() {
		
		super.updateAITasks();
		
		if (this.angerLevel <= 0) {
			if (this.spawnPosition != null
					&& (!this.worldObj.isAirBlock(this.spawnPosition.posX,
							this.spawnPosition.posY, this.spawnPosition.posZ)
							|| this.spawnPosition.posY < 1)) {
				this.spawnPosition = null;
			}
			
			if (this.spawnPosition == null || this.rand.nextInt(30) == 0
					|| this.spawnPosition.getDistanceSquared((int) this.posX,
							(int) this.posY, (int) this.posZ) < 4.0F) {
				this.spawnPosition = new ChunkCoordinates(
						(int) this.posX + this.rand.nextInt(7)
								- this.rand.nextInt(7),
						(int) this.posY + this.rand.nextInt(6) - 2,
						(int) this.posZ + this.rand.nextInt(7)
								- this.rand.nextInt(7));
			}
			
			double d0 = this.spawnPosition.posX + 0.5D - this.posX;
			double d1 = this.spawnPosition.posY + 0.1D - this.posY;
			double d2 = this.spawnPosition.posZ + 0.5D - this.posZ;
			this.motionX += (Math.signum(d0) * 0.5D - this.motionX)
					* 0.10000000149011612D;
			this.motionY += (Math.signum(d1) * 0.699999988079071D
					- this.motionY) * 0.10000000149011612D;
			this.motionZ += (Math.signum(d2) * 0.5D - this.motionZ)
					* 0.10000000149011612D;
			float f = (float) (Math.atan2(this.motionZ, this.motionX) * 180.0D
					/ Math.PI) - 90.0F;
			float f1 = MathHelper.wrapAngleTo180_float(f - this.rotationYaw);
			this.moveForward = 0.5F;
			this.rotationYaw += f1;
		}
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		this.motionY *= 0.6000000238418579D;
	}
	
}