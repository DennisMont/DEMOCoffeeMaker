package cfd;

public class Actuator {
	EnumActuator stateActuator;
	
	public void turnOff()
	{
		stateActuator=EnumActuator.ON;
	}
	///a�adidoParaTest
	public EnumActuator getstateActuator() {
		return stateActuator;
	}
	
}
