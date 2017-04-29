package zaneextras.potions;

import zaneextras.config.ZaneConfig;

public class ZanePotion {
	
	public static ZaneBasePotion barrier;
	
	// Radiance variables.
	public static final int radianceTime = 36000;
	public static final float burnDamage = 2.0f;
	
	public static void init() {
		barrier = new ZaneBasePotion("barrier", ZaneConfig.potionBarrierID,
				false, 0);
		
	}
}