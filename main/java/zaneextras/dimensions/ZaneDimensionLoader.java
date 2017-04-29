package zaneextras.dimensions;

import net.minecraftforge.common.DimensionManager;
import zaneextras.config.ZaneConfig;

public class ZaneDimensionLoader {
	
	private static int dimId = ZaneConfig.dimensionLightID;
	
	public static void init() {
		DimensionManager.registerProviderType(dimId, WorldProviderLight.class,
				false);
		DimensionManager.registerDimension(dimId, dimId);
	}
	
	public static int getDimID() {
		return dimId;
	}
	
}