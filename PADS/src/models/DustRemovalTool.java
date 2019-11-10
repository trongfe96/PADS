package models;

public class DustRemovalTool {
	
	// Running status
	private boolean running = false;
	
	public void startDRT() {
		setRunning(true);
	}
	
	public void stopDRT() {
		setRunning(false);
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public boolean isRunning() {
		return running;
	}
	
}
