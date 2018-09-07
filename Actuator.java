package cfd;

public class Actuator {
	EnumActuator stateActuator;
	
	public void turnOff()
	{
		stateActuator=EnumActuator.ON;
	}
	///añadidoParaTest
	public EnumActuator getstateActuator() {
		return stateActuator;
	}
	
}
