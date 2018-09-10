package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoilerHeaterTest {

	@Test
	public void test_BoilerHeaderTurnOff_pass() {
		Actuator BoilerH = new BoilerHeater();
		BoilerH.turnOff();
		DeviceStates RealValue = BoilerH.getState();
		DeviceStates Expected = DeviceStates.NonActivate;
		assertEquals(Expected,RealValue);
	}

	@Test
	public void test_BoilerHeaderTurnOn_pass() {
		Actuator BoilerH = new BoilerHeater();
		BoilerH.turnOn();
		DeviceStates RealValue = BoilerH.getState();
		DeviceStates Expected = DeviceStates.Activate;
		assertEquals(Expected,RealValue);
	}

}
