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
import zaneextras.lib.ZaneTabs;
import zaneextras.lib.helpers.ZaneKeyHelper;

public class ItemWeaponZaniumSword extends ItemSword {
	public ItemWeaponZaniumSword() {
		super(ZaneToolMaterials.ZANIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_zaniumsword");
		this.setTextureName(ModInfo.MODID + ":zaniumsword");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack zaniumSword = new ItemStack(ItemList.zaniumSword, 1);
		
		zaniumSword.addEnchantment(Enchantment.looting, 3);
		zaniumSword.addEnchantment(Enchantment.sharpness, 5);
		zaniumSword.addEnchantment(Enchantment.fireAspect, 1);
		items.add(zaniumSword);
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, Entity entity) {
		super.onLeftClickEntity(par1ItemStack, par2EntityPlayer, entity);
		
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			living.addPotionEffect(new PotionEffect(Potion.wither.id, 400, 3));
		}
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world,
			EntityPlayer entity) {
		
		entity.addPotionEffect(
				new PotionEffect(Potion.nightVision.id, 1200, 0));
		entity.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 1));
		entity.addPotionEffect(
				new PotionEffect(Potion.field_76444_x.id, 2400, 1));
		entity.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 1));
		entity.addPotionEffect(
				new PotionEffect(Potion.invisibility.id, 600, 20));
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
			list.add(EnumChatFormatting.ITALIC + "Right click this dark sword");
			list.add(EnumChatFormatting.ITALIC + "to gain offensive buffs");
			
		} else {
			list.add("Hold SHIFT for");
			list.add("more information.");
		}
	}
}
