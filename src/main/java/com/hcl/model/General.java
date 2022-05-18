package com.hcl.model;

public class General {
//HAS A
	Vehicle vehicle;

	public void output() {
		vehicle.speed();
	}

//DI via setter injection
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

//DI via constructor injection
	public General(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
