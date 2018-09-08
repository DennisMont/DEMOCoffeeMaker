package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightIndicatorTest {

	@Test
	public void testTurnOff() {
		Actuator LightIn = new LightIndicator();
		LightIn.turnOff();
		DeviceStates RealValue = LightIn.getState();
		DeviceStates Expected = DeviceStates.NonActivate;
		assertEquals(Expected,RealValue);
	}

	@Test
	public void testTurnOn() {
		Actuator LightIn = new LightIndicator();
		LightIn.turnOn();
		DeviceStates RealValue = LightIn.getState();
		DeviceStates Expected = DeviceStates.Activate;
		assertEquals(Expected,RealValue);
	}

}
