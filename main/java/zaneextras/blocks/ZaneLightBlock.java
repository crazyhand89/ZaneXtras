package zaneextras.blocks;

import net.minecraft.block.material.Material;

public class ZaneLightBlock extends ZaneBlock {
	
	public ZaneLightBlock(Material mat, String name, float hardness,
			float resitance, SoundType sound, float light) {
		super(mat, name, hardness, resitance, sound);
		this.setLightLevel(light);
	}
	
}
