package zaneextras.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import zaneextras.lib.ModInfo;

public class FluidRadite extends Fluid {
	
	public FluidRadite(String fluidName) {
		super(fluidName);
		this.setDensity(80);
		this.setViscosity(6000);
		this.setLuminosity(15);
		this.setUnlocalizedName(ModInfo.MODID + "raditefluid");
		this.setGaseous(true);
		this.setTemperature(600);
		this.rarity = rarity.rare;
		FluidRegistry.registerFluid(this);
	}
	
}
