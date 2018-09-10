package cfd;
public class WaterSensor extends DigitalSensor{

	
	public WaterSensor() {
		state = EnumBoilerState.boilerEmpty;
	}
	public void setState(ITypeEnum typ) {
		
		if ( typ==EnumBoilerState.boilerEmpty)
			state=typ;
		if ( typ==EnumBoilerState.boilerNotEmpty)
			state=typ;
	}

	
}
