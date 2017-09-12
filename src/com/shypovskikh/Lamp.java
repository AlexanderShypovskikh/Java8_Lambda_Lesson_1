package com.shypovskikh;

public class Lamp implements ElectricityConsumer{

	@Override
	public void electricityOn(Object object){
		lightOn();
	}
	
	public void lightOn() {
		System.out.println("Lamp is on");
	}
	
}
