package zaneextras.lib.enums;

public enum ZaneState {
	OFF(0), ON(1);
	
	private ZaneState st;
	private int intState;
	
	private ZaneState(int st) {
		intState = st;
	}
	
	private ZaneState(ZaneState st) {
		this.st = st;
	}
	
	public void setState(int st) {
		intState = st;
	}
	
	public void setState(ZaneState st) {
		this.st = st;
	}
	
	public int getState() {
		return intState;
	}
	
	public ZaneState getActualState() {
		return st;
	}
}
