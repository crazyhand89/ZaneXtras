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

public class ItemWeaponZograditeScythe extends ItemSword
		implements IZaneExtendedReach {
	public ItemWeaponZograditeScythe() {
		super(ZaneToolMaterials.ZOGRADITE);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_zograditescythe");
		this.setTextureName(ModInfo.MODID + ":zograditescythe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack zograditeScythe = new ItemStack(ItemList.zograditeScythe, 1);
		
		zograditeScythe.addEnchantment(Enchantment.looting, 3);
		zograditeScythe.addEnchantment(Enchantment.sharpness, 5);
		zograditeScythe.addEnchantment(Enchantment.unbreaking, 3);
		items.add(zograditeScythe);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
	
	@Override
	public float getExtendedReach(World world, EntityLivingBase living,
			ItemStack itemstack) {
		return 9.0F;
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, Entity entity) {
		super.onLeftClickEntity(par1ItemStack, par2EntityPlayer, entity);
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			living.addPotionEffect(new PotionEffect(Potion.wither.id, 600, 4));
			living.addPotionEffect(new PotionEffect(Potion.poison.id, 600, 4));
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
		entity.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 1));
		entity.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 1));
		itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		
		return itemStack;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_,
			List list, boolean p_77624_4_) {
		if (ZaneKeyHelper.isCtrlKeyDown() || ZaneKeyHelper.isShiftKeyDown()) {
			list.add(EnumChatFormatting.ITALIC
					+ "This scythe is said to contain");
			list.add(EnumChatFormatting.ITALIC + "the power of DEATH himself.");
			list.add(EnumChatFormatting.ITALIC + "Use this power wisely.");
			
		} else {
			list.add("Hold SHIFT for");
			list.add("more information.");
		}
	}
}
