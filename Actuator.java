package cfd;

public class Actuator {

	DeviceStates stateActuator;
	
	public Actuator() {
		stateActuator = DeviceStates.NonActivate;
	}

	public void turnOff()
	{
		stateActuator = DeviceStates.NonActivate;
	}
	
	public void turnOn()
	{
		stateActuator = DeviceStates.Activate;
	}
	
	public DeviceStates getState()
	{
		return stateActuator;
	}
}

