package zaneextras.items;

import net.minecraft.item.ItemStack;

public class ItemChefKnife extends ZaneItem {
	
	public ItemChefKnife() {
		super("chefknife");
		this.setMaxDamage(500);
		this.setMaxStackSize(1);
	}
	
	@Override
	public boolean getShareTag() {
		return true;
	}
	
	@Override
	public boolean hasContainerItem(ItemStack itemStack) {
		return true;
	}
	
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
		return false;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		ItemStack cStack = itemStack.copy();
		cStack.setItemDamage(cStack.getItemDamage() + 1);
		cStack.stackSize = 1;
		return cStack;
	}
}