package zaneextras.items.bow;

import java.util.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import zaneextras.items.ItemList;
import zaneextras.items.arrow.EntityAngelArrow;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;
import zaneextras.lib.helpers.ZaneKeyHelper;

public class AngelBow extends Item {
	public static final String[] bowPullIconNameArray = new String[] {
			"pulling_0", "pulling_1", "pulling_2" };
	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;
	private static final String __OBFID = "CL_00001777";
	
	public AngelBow() {
		this.maxStackSize = 1;
		this.setMaxDamage(1000);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_angelbow");
		this.setTextureName(ModInfo.MODID + ":angelbow");
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.uncommon;
	}
	
	/**
	 * called when the player releases the use item button. Args: itemstack,
	 * world, entityplayer, itemInUseCount
	 */
	@Override
	public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_,
			EntityPlayer p_77615_3_, int p_77615_4_) {
		int j = this.getMaxItemUseDuration(p_77615_1_) - p_77615_4_;
		
		ArrowLooseEvent event = new ArrowLooseEvent(p_77615_3_, p_77615_1_, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled()) {
			return;
		}
		j = event.charge;
		
		boolean flag = p_77615_3_.capabilities.isCreativeMode
				|| EnchantmentHelper.getEnchantmentLevel(
						Enchantment.infinity.effectId, p_77615_1_) > 0;
		
		if (flag || p_77615_3_.inventory.hasItem(ItemList.angelArrow)) {
			float f = j / 20.0F;
			f = (f * f + f * 2.0F) / 3.0F;
			
			if (f < 0.1D) {
				return;
			}
			
			if (f > 1.0F) {
				f = 1.0F;
			}
			
			EntityAngelArrow entityarrow = new EntityAngelArrow(p_77615_2_,
					p_77615_3_, f * 2.0F);
			
			if (f == 1.0F) {
				entityarrow.setIsCritical(true);
			}
			
			int k = EnchantmentHelper.getEnchantmentLevel(
					Enchantment.power.effectId, p_77615_1_);
			
			if (k > 0) {
				entityarrow
						.setDamage(entityarrow.getDamage() + k * 0.5D + 0.5D);
			}
			
			int l = EnchantmentHelper.getEnchantmentLevel(
					Enchantment.punch.effectId, p_77615_1_);
			
			if (l > 0) {
				entityarrow.setKnockbackStrength(l);
			}
			
			if (EnchantmentHelper.getEnchantmentLevel(
					Enchantment.flame.effectId, p_77615_1_) > 0) {
				entityarrow.setFire(100);
			}
			
			p_77615_1_.damageItem(1, p_77615_3_);
			p_77615_2_.playSoundAtEntity(p_77615_3_, "random.bow", 1.0F,
					1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
			
			if (flag) {
				entityarrow.canBePickedUp = 2;
			} else {
				p_77615_3_.inventory.consumeInventoryItem(ItemList.angelArrow);
			}
			
			if (!p_77615_2_.isRemote) {
				p_77615_2_.spawnEntityInWorld(entityarrow);
			}
		}
	}
	
	@Override
	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_,
			EntityPlayer p_77654_3_) {
		return p_77654_1_;
	}
	
	/**
	 * How long it takes to use or consume an item
	 */
	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 72000;
	}
	
	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack p_77661_1_) {
		return EnumAction.bow;
	}
	
	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_,
			EntityPlayer p_77659_3_) {
		ArrowNockEvent event = new ArrowNockEvent(p_77659_3_, p_77659_1_);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled()) {
			return event.result;
		}
		
		if (p_77659_3_.capabilities.isCreativeMode
				|| p_77659_3_.inventory.hasItem(ItemList.angelArrow)) {
			p_77659_3_.setItemInUse(p_77659_1_,
					this.getMaxItemUseDuration(p_77659_1_));
		}
		
		return p_77659_1_;
	}
	
	/**
	 * Return the enchantability factor of the item, most of the time is based
	 * on material.
	 */
	@Override
	public int getItemEnchantability() {
		return 15;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister p_94581_1_) {
		this.itemIcon = p_94581_1_
				.registerIcon(this.getIconString() + "_standby");
		this.iconArray = new IIcon[bowPullIconNameArray.length];
		
		for (int i = 0; i < this.iconArray.length; ++i) {
			this.iconArray[i] = p_94581_1_.registerIcon(
					this.getIconString() + "_" + bowPullIconNameArray[i]);
		}
	}
	
	/**
	 * used to cycle through icons based on their used duration, i.e. for the
	 * bow
	 */
	@SideOnly(Side.CLIENT)
	public IIcon getItemIconForUseDuration(int p_94599_1_) {
		return this.iconArray[p_94599_1_];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player,
			ItemStack usingItem, int useRemaining) {
		if (usingItem == null) {
			return itemIcon;
		}
		int ticksInUse = stack.getMaxItemUseDuration() - useRemaining;
		if (ticksInUse > 17) {
			return iconArray[2];
		} else if (ticksInUse > 13) {
			return iconArray[1];
		} else if (ticksInUse > 0) {
			return iconArray[0];
		} else {
			return itemIcon;
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_,
			List list, boolean p_77624_4_) {
		if (ZaneKeyHelper.isCtrlKeyDown() || ZaneKeyHelper.isShiftKeyDown()) {
			list.add(EnumChatFormatting.ITALIC + "Arrows fired from this");
			list.add(EnumChatFormatting.ITALIC + "bow cause EXPLOSIONS");
			list.add(EnumChatFormatting.ITALIC + "if they miss your target");
			
		} else {
			list.add("Hold SHIFT for");
			list.add("more information.");
		}
	}
}