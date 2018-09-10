package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoilerHeaterTest {

	@Test
	public void test_BoilerHeaderTurnOff_pass() {
		OnOffDevice BoilerH = new BoilerHeater();
		BoilerH.turnOff();
		EnumDeviceState RealValue = BoilerH.getState();
		EnumDeviceState Expected = EnumDeviceState.off;
		assertEquals(Expected,RealValue);
	}

	@Test
	public void test_BoilerHeaderTurnOn_pass() {
		OnOffDevice BoilerH = new BoilerHeater();
		BoilerH.turnOn();
		EnumDeviceState RealValue = BoilerH.getState();
		EnumDeviceState Expected = EnumDeviceState.on;
		assertEquals(Expected,RealValue);
	}

}
