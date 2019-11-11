package models;

import java.util.Stack;

public class Drill {

	// Running Status
	private boolean running = false;
	
	// Drill Bit Storage
	Stack<DrillBit> drillBitStorage = new Stack<DrillBit>();

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	
	public void startDrill() {
		setRunning(true);
	}
	
	public void stopDrill() {
		setRunning(false);
	}

}
