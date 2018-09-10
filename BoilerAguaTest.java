package cfd;
import static org.junit.Assert.*;

import org.junit.Test;

public class BoilerAguaTest {

	@Test
	public void testStartBoiler() {
		BoilerAgua ba = new BoilerAgua();
		ba.turnOnHeater();
		assertEquals(ba.getHeaterState(), EnumDeviceState.on);
	}
	
	@Test
	public void testShutdownBoiler() {
		BoilerAgua ba = new BoilerAgua();
		ba.turnOnHeater();
		ba.turnOffHeater();
		assertEquals(ba.getHeaterState(), EnumDeviceState.off);
	}
	
	@Test
	public void testBoilerEmptyByDefect() {
		BoilerAgua ba = new BoilerAgua();
		assertTrue(ba.isEmpty());
	}
	
	@Test
	public void testOpenValve() {
		BoilerAgua ba = new BoilerAgua();
		ba.OpenValve();
		assertTrue(ba.IsValveOpen());
	}
	
	@Test
	public void testCloseValve() {
		BoilerAgua ba = new BoilerAgua();
		ba.CloseValve();
		assertFalse(ba.IsValveOpen());
	}

}
