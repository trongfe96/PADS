package models;

public class DrillBit {

	// Bit Health
	private int health;

	public DrillBit() {
		// Starting Health Will Be 100
		this.health = 100;
	}

	public int getHealth() {
		return health;
	}
	
	public void reduceHealthByAmount(int amountToReduce) {
		health -= amountToReduce;
	}
}
