package cfd;

public class Actuator {

	EnumDeviceState stateActuator;
	
	public Actuator() {
		stateActuator = EnumDeviceState.off;
	}

	public void turnOff()
	{
		stateActuator = EnumDeviceState.off;
	}
	
	public void turnOn()
	{
		stateActuator = EnumDeviceState.on;
	}
	
	public EnumDeviceState getState()
	{
		return stateActuator;
	}
}

