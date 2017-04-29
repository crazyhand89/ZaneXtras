package zaneextras.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ZaneBottleItem extends ZaneItem {
	
	public ZaneBottleItem(String str) {
		super(str);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack itemStack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		return new ItemStack(Items.glass_bottle);
	}
}