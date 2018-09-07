package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void Actuador() {
		EnumActuator stateActuator;
		Actuator method1 = new Actuator();
		EnumActuator  expected=EnumActuator.ON;
		method1.turnOff();
		assertEquals(expected, method1.getstateActuator());
	}
	
	@Test
	public void BrewButton1() {
		BrewButton method1=new BrewButton();
		boolean expected =false; 
		boolean actual = method1.verifyConditions();
		assertEquals(expected, actual);;
	}
	@Test
	public void BrewButton2() {
		BrewButton method1=new BrewButton();
		StageCoffeeMaker expected =StageCoffeeMaker.FINISHED; 
		StageCoffeeMaker actual = method1.startBrew();
		assertEquals(expected, actual);;
	}

}
