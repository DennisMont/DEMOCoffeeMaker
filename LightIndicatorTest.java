package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightIndicatorTest {

	@Test
	public void testTurnOff() {
		OnOffDevice LightIn = new LightIndicator();
		LightIn.turnOff();
		EnumDeviceState RealValue = LightIn.getState();
		EnumDeviceState Expected = EnumDeviceState.off;
		assertEquals(Expected,RealValue);
	}

	@Test
	public void testTurnOn() {
		OnOffDevice LightIn = new LightIndicator();
		LightIn.turnOn();
		EnumDeviceState RealValue = LightIn.getState();
		EnumDeviceState Expected = EnumDeviceState.on;
		assertEquals(Expected,RealValue);
	}

}
