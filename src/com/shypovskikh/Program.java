package com.shypovskikh;
import static java.lang.System.out;
public class Program {

	public static void main(String[] args) {
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
	    Radio radio = new Radio();
	   //****event subscribe***//
		//sw.consumer = lamp;
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(radio);
		
		/*sw.addElectricityListener(new ElectricityConsumer() {
			public void electricityOn() {
			 out.println("Fire");	
			}
		});
		*/
		//lambda expression  - using object as function
		String message = "message";
		sw.addElectricityListener(sender-> { 
			out.println("Fire");
			out.println(message);
			
	  }
		);
		//sw.addElectricityListener(s -> Program.fire(s));
	   Program program = new Program();
		sw.addElectricityListener(Program::fire);
		sw.addElectricityListener(program::fire2);
		sw.switchOn();

	}
	
	public static void fire(Object object) {
		out.println("Fire");
	}

	public  void fire2(Object object) {
		out.println("Fire2");
	}
}
