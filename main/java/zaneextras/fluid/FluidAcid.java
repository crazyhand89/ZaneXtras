package zaneextras.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import zaneextras.lib.ModInfo;

public class FluidAcid extends Fluid {
	
	public FluidAcid(String fluidName) {
		super(fluidName);
		this.setDensity(80);
		this.setViscosity(800);
		this.setLuminosity(5);
		this.setUnlocalizedName(ModInfo.MODID + "acidfluid");
		this.setGaseous(true);
		this.setTemperature(300);
		this.rarity = rarity.common;
		FluidRegistry.registerFluid(this);
	}
}