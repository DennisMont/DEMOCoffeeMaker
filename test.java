package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void actuador_getstateActuator_nothing_resultOn() {
		Actuator method1 = new Actuator();
		EnumActuator  expected=EnumActuator.ON;
		method1.turnOff();
		assertEquals(expected, method1.getstateActuator());
	}
	
	@Test
	public void brewButton_verifyConditions_nothing_resultFalse() {
		BrewButton method1=new BrewButton();
		boolean expected =false; 
		boolean actual = method1.verifyConditions();
		assertEquals(expected, actual);;
	}
	@Test
	public void brewButton_startBrew_nothing_resulFinished() {
		BrewButton method1=new BrewButton();
		StageCoffeeMaker expected =StageCoffeeMaker.FINISHED; 
		StageCoffeeMaker actual = method1.startBrew();
		assertEquals(expected, actual);;
	}
}
