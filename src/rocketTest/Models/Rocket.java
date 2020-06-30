package rocketTest.Models;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	
	private String Code;
	private List<Thruster> thrusterList;
	
	
	public Rocket(String code) {
		super();
		Code = code;
		this.thrusterList = new ArrayList<Thruster>();
	}


	public String getCode() {
		return Code;
	}


	public void setCode(String code) {
		Code = code;
	}


	public List<Thruster> getThrusterList() {
		return thrusterList;
	}


	public void setThrusterList(List<Thruster> thrusterList) {
		this.thrusterList = thrusterList;
	}
	
	public void PowerToTarget(int targetPower) {
		for(Thruster thruster: thrusterList)
		{
			thruster.setTargetPower(targetPower);
			Thread t = new Thread(thruster);
			t.start();
		}
	}


	@Override
	public String toString() {
		return "Rocket [Code=" + Code + ", thrusterList=" + thrusterList + "]";
	}
	
	
	

}
