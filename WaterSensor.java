package cfd;
public class WaterSensor extends DigitalSensor{

	public void setState(TypeEnum typ) {
		
		switch(typ) {
		case EnumBoilerState.boilerEmpty,EnumBoilerState.boilerNotEmpty:
			state=typ;
		}
	}
}
