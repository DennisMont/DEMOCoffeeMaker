import cfd.ISensor;
public abstract class DigitalSensor {
	//public WaterSensor();
	private ITypeEnum state;
	public ITypeEnum getState() {
		return state;
	}
	public abstract void setState(ItypeEnum state);
	
	}
