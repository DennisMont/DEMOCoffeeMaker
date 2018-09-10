package cfd;
import static org.junit.Assert.*;

import org.junit.Test;

public class BoilerAguaTest {

	@Test
	public void test() {
		BoilerAgua ba = new BoilerAgua();
		
		ba.turnOnHeater();
		assertEquals(ba.getHeaterState(), EnumDeviceState.on);
	}

}
