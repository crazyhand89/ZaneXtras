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
import zaneextras.interfaces.IZaneExtendedReach;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;
import zaneextras.lib.helpers.ZaneKeyHelper;
import zaneextras.potions.ZanePotion;

public class ItemWeaponUrielSword extends ItemSword
		implements IZaneExtendedReach {
	public ItemWeaponUrielSword() {
		super(ZaneToolMaterials.URIEL);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_urielsword");
		this.setTextureName(ModInfo.MODID + ":urielsword");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack urielSword = new ItemStack(ItemList.urielSword, 1);
		
		urielSword.addEnchantment(Enchantment.looting, 3);
		urielSword.addEnchantment(Enchantment.sharpness, 5);
		urielSword.addEnchantment(Enchantment.unbreaking, 3);
		urielSword.addEnchantment(Enchantment.smite, 3);
		items.add(urielSword);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
	
	@Override
	public float getExtendedReach(World world, EntityLivingBase living,
			ItemStack itemstack) {
		return 10.5F;
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, Entity entity) {
		super.onLeftClickEntity(par1ItemStack, par2EntityPlayer, entity);
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			living.setFire(15);
		}
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world,
			EntityPlayer entity) {
		
		entity.addPotionEffect(
				new PotionEffect(Potion.fireResistance.id, 1200, 0));
		entity.addPotionEffect(
				new PotionEffect(Potion.field_76444_x.id, 2400, 9));
		entity.addPotionEffect(new PotionEffect(Potion.resistance.id, 1200, 3));
		entity.addPotionEffect(
				new PotionEffect(Potion.regeneration.id, 1200, 3));
		entity.addPotionEffect(
				new PotionEffect(ZanePotion.barrier.id, 21600, 0));
		entity.addPotionEffect(
				new PotionEffect(Potion.damageBoost.id, 1200, 1));
		itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		
		return itemStack;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_,
			List list, boolean p_77624_4_) {
		if (ZaneKeyHelper.isCtrlKeyDown() || ZaneKeyHelper.isShiftKeyDown()) {
			list.add(EnumChatFormatting.ITALIC
					+ "You now hold Uriel's sword in your hands.");
			list.add(EnumChatFormatting.ITALIC + "May it keep you safe.");
			
		} else {
			list.add("Hold SHIFT for");
			list.add("more information.");
		}
	}
}