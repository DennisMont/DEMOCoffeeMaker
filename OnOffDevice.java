package cfd;
public class OnOffDevice {
	private EnumDeviceState state;

	public OnOffDevice() {
		state = EnumDeviceState.off;
	}

	public void turnOn() {
		state = EnumDeviceState.on;
	}

	public void turnOff() {
		state = EnumDeviceState.off;
	}
	public EnumDeviceState getState() {
	return state;
	}
	
//	public boolean isOn() {
//		return EnumDeviceState state;
//	}
}
