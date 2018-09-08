package cfd;

import static org.junit.Assert.*;

import org.junit.Test;

public class WaterSensorTest {

	@Test
	public void AbsSensor_WaterSensorState_detected() {
		AbstractSensor waterS = new WaterSensor();
		waterS.setState(DigitalValue.BoilerNonEmpty);
		TypeEnum st = waterS.getState();
		TypeEnum exp = DigitalValue.BoilerNonEmpty;
		assertEquals(exp,st);
	}
	
	@Test
	public void AbsSensor_WaterSensorState_nondetected() {
		AbstractSensor waterS = new WaterSensor();
		waterS.setState(DigitalValue.BoilerEmpty);
		TypeEnum st = waterS.getState();
		TypeEnum exp = DigitalValue.BoilerEmpty;
		assertEquals(exp,st);
	}
}
