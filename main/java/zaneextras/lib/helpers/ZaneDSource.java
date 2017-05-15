package zaneextras.lib.helpers;

import net.minecraft.util.DamageSource;

public class ZaneDSource extends DamageSource {
	
	public static ZaneDSource deathAcid = new ZaneDSource("acid");
	public static ZaneDSource deathChlorine = new ZaneDSource("chlorine");
	public static ZaneDSource deathRadite = new ZaneDSource("radite");
	public static ZaneDSource deathLight = new ZaneDSource("light");
	
	public ZaneDSource(String par1) {
		super(par1);
	}
}