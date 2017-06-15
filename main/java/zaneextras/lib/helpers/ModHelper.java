package zaneextras.lib.helpers;

import cpw.mods.fml.common.Loader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class ModHelper {
	
	public static boolean useZollernExtras = false;
	public static boolean useBigReactors = false;
	public static boolean useThermalFoundation = false;
	public static boolean useThermalExpansion = false;
	public static boolean useThermalDynamics = false;
	
	public static void detectMods() {
		useZollernExtras = isModLoaded("zollernextras");
		useBigReactors = isModLoaded("BigReactors");
		useThermalFoundation = isModLoaded("ThermalFoundation");
		useThermalExpansion = isModLoaded("ThermalExpansion");
		useThermalDynamics = isModLoaded("ThermalDynamics");
	}
	
	public static boolean isModLoaded(String modName) {
		boolean isLoaded = Loader.isModLoaded(modName);
		if (isLoaded) {
			System.out.println("Detected mod: " + modName + ".");
		}
		return isLoaded;
	}
	
	public static void addChatMessage(EntityPlayer player, String text) {
		player.addChatMessage(new ChatComponentText(text));
	}
}