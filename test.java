package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void Actuador_getStateActuator_ON_resultON() {
		Actuator method1 = new Actuator();
		EnumActuator expected=EnumActuator.ON;
		method1.turnOnOff();
		assertEquals(expected, method1.getStateActuator());
	}
	@Test
	public void Actuador_getStateActuator_empty_resultOFF() {
		Actuator method1 = new Actuator();
		EnumActuator expected=EnumActuator.OFF;
		assertEquals(expected, method1.getStateActuator());
	}
	
	@Test
	public void BrewButton_verifyConditions_empty_resultFalse() {
		BrewButton method1=new BrewButton();
		boolean expected =false; 
		boolean actual = method1.verifyConditions();
		assertEquals(expected, actual);;
	}
	@Test
	public void BrewButton_startBrew_finished_resultFinished() {
		BrewButton method1=new BrewButton();
		StageCoffeeMaker expected =StageCoffeeMaker.FINISHED; 
		StageCoffeeMaker actual = method1.startBrew();
		assertEquals(expected, actual);;
	}
	@Test
	public void BrewButton_setState_detected_resultDetected() {
		TypeEnum expected=DigitalValue.Detected;
		BrewButton method1=new BrewButton();
		method1.setState(DigitalValue.Detected);
		assertEquals(expected, method1.getState());

	}
	@Test
	public void BrewButton_setState_nonDetected_resultNonDetected() {
		TypeEnum expected=DigitalValue.NonDetected;
		BrewButton method1=new BrewButton();
		method1.setState(DigitalValue.NonDetected);
		assertEquals(expected, method1.getState());
	}
	@Test
	public void BrewButton_getState_empty_resultNull() {
		BrewButton method1=new BrewButton();
		assertEquals(null, method1.getState());

	}
}
