package cfd;
import cfd.ISensor;
public abstract class DigitalSensor {
	//public WaterSensor();
	protected ITypeEnum state;
	public ITypeEnum getState() {
		return state;
	}
	public abstract void setState(ITypeEnum state);
	
	}
