package zaneextras.items.weapon;

import java.util.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;
import zaneextras.lib.helpers.ZaneKeyHelper;

public class ItemWeaponAngelSword extends ItemSword {
	public ItemWeaponAngelSword() {
		super(ZaneToolMaterials.ANGEL);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_angelsword");
		this.setTextureName(ModInfo.MODID + ":angelsword");
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, Entity entity) {
		super.onLeftClickEntity(par1ItemStack, par2EntityPlayer, entity);
		par2EntityPlayer.heal(1.5F);
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_,
			List list, boolean p_77624_4_) {
		if (ZaneKeyHelper.isCtrlKeyDown() || ZaneKeyHelper.isShiftKeyDown()) {
			list.add(EnumChatFormatting.ITALIC + "Attacking mobs with this");
			list.add(EnumChatFormatting.ITALIC + "sword heals you");
			
		} else {
			list.add("Hold SHIFT for");
			list.add("more information.");
		}
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.rare;
	}
	
}
