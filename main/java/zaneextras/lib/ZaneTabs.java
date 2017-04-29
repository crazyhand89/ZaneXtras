package zaneextras.lib;

import net.minecraft.creativetab.CreativeTabs;

public class ZaneTabs {
	
	public static CreativeTabs zTab;
	
	public static void init() {
		zTab = new ZaneExtrasTab("Zane_Extras");
	}
	
}