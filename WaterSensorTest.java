package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class WaterSensorTest {

	@Test
	public void AbsSensor_WaterSensorState_detected() {
		DigitalSensor waterS = new WaterSensor();
		waterS.setState(EnumBoilerState.boilerNotEmpty);
		ITypeEnum st = waterS.getState();
		ITypeEnum exp = EnumBoilerState.boilerNotEmpty;
		assertEquals(exp,st);
	}
	
	@Test
	public void AbsSensor_WaterSensorState_nondetected() {
		DigitalSensor waterS = new WaterSensor();
		waterS.setState(EnumBoilerState.boilerEmpty);
		ITypeEnum st = waterS.getState();
		ITypeEnum exp = EnumBoilerState.boilerEmpty;
		assertEquals(exp,st);
	}
}
