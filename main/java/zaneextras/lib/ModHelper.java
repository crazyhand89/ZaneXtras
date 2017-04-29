package zaneextras.lib;

import cpw.mods.fml.common.Loader;

public class ModHelper {
	
	public static boolean useCofh = false;
	public static boolean useZollernExtras = false;
	public static boolean useBigReactors = false;
	
	public static void detectMods() {
		useZollernExtras = isModLoaded("zollernextras")
				|| isModLoaded("Zollern Extras");
		
		useBigReactors = isModLoaded("BigReactors");
	}
	
	public static boolean isModLoaded(String modName) {
		boolean isLoaded = Loader.isModLoaded(modName);
		if (isLoaded) {
			System.out.println("Detected mod: " + modName + ".");
		}
		return isLoaded;
	}
}