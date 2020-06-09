package rocketTest.Models;

public class Thruster {
	
	private static int CONT=1;
	private int id;
	private int maxPower;
	private int currentPower;
	private int targetPower;

		
	public Thruster(int maxPower) {
		
		this.id= CONT;
		CONT++;
		this.maxPower = maxPower;
		this.currentPower = 0;
		this.targetPower = 0;
	}

	
	
	public int getMaxPower() {
		return maxPower;
	}


	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}


	public int getCurrentPower() {
		return currentPower;
	}


	public void setCurrentPower(int currentPower) {
		this.currentPower = currentPower;
	}


	public int getTargetPower() {
		return targetPower;
	}


	public void setTargetPower(int targetPower) {
		this.targetPower = targetPower;
	}



	@Override
	public String toString() {
		return "Thruster [ID:"+id+", maxPower=" + maxPower + ", currentPower=" + currentPower + ", targetPower=" + targetPower
				+ "]";
	}
	
	

}
