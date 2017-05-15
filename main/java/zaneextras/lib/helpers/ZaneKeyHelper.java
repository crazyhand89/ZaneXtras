package zaneextras.lib.helpers;

import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;

public class ZaneKeyHelper {
	
	/**
	 * Returns true if Ctrl key (Windows) or Option key (Mac) is pressed.
	 * 
	 * @return
	 */
	public static boolean isCtrlKeyDown() {
		boolean isCtrlKeyDown = Keyboard.isKeyDown(Keyboard.KEY_LCONTROL)
				|| Keyboard.isKeyDown(Keyboard.KEY_RCONTROL);
		if (!isCtrlKeyDown && Minecraft.isRunningOnMac) {
			isCtrlKeyDown = Keyboard.isKeyDown(Keyboard.KEY_LMETA)
					|| Keyboard.isKeyDown(Keyboard.KEY_RMETA);
		}
		return isCtrlKeyDown;
	}
	
	/**
	 * Returns true if the Shift key is pressed.
	 * 
	 * @return
	 */
	public static boolean isShiftKeyDown() {
		return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)
				|| Keyboard.isKeyDown(Keyboard.KEY_RSHIFT);
	}
}