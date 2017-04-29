package zaneextras.items.weapon;

import java.util.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneKeyHelper;
import zaneextras.lib.ZaneTabs;

public class ItemWeaponStariaSword extends ItemSword {
	
	private int cooldown = 0;
	
	public ItemWeaponStariaSword() {
		super(ZaneToolMaterials.STARIA);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_stariasword");
		this.setTextureName(ModInfo.MODID + ":stariasword");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack stariaSword = new ItemStack(ItemList.stariaSword, 1);
		
		stariaSword.addEnchantment(Enchantment.looting, 3);
		stariaSword.addEnchantment(Enchantment.sharpness, 5);
		stariaSword.addEnchantment(Enchantment.unbreaking, 3);
		items.add(stariaSword);
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, Entity entity) {
		super.onLeftClickEntity(par1ItemStack, par2EntityPlayer, entity);
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			living.addPotionEffect(
					new PotionEffect(Potion.weakness.id, 400, 3));
		}
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world,
			EntityPlayer entity) {
		
		entity.addPotionEffect(
				new PotionEffect(Potion.nightVision.id, 1200, 0));
		entity.addPotionEffect(
				new PotionEffect(Potion.fireResistance.id, 600, 0));
		entity.addPotionEffect(
				new PotionEffect(Potion.field_76444_x.id, 2400, 4));
		entity.addPotionEffect(new PotionEffect(Potion.resistance.id, 600, 2));
		entity.addPotionEffect(
				new PotionEffect(Potion.regeneration.id, 600, 2));
		itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		
		return itemStack;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_,
			List list, boolean p_77624_4_) {
		if (ZaneKeyHelper.isCtrlKeyDown() || ZaneKeyHelper.isShiftKeyDown()) {
			list.add(EnumChatFormatting.ITALIC
					+ "Right click this bright sword");
			list.add(EnumChatFormatting.ITALIC + "to gain defensive buffs");
			
		} else {
			list.add("Hold SHIFT for");
			list.add("more information.");
		}
	}
}
