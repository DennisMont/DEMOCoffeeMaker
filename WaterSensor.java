package cfd;
public class WaterSensor extends DigitalSensor{

	public void setState(ITypeEnum typ) {
		
		if ( typ==EnumBoilerState.boilerEmpty)
			state=typ;
		if ( typ==EnumBoilerState.boilerNotEmpty)
			state=typ;
	}

	
}
