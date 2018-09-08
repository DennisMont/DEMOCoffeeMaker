package cfd;

public class PlateSensor extends AbstractSensor{

	@Override
	public void setState(TypeEnum typ) {
		if(typ==AnalogValue.potEmpty)
		{
			state=AnalogValue.potEmpty;
		}
		else if(typ==AnalogValue.potNotEmpty)
		{
			state=AnalogValue.potNotEmpty;
		}
		else if(typ==AnalogValue.warmerEmpty)
		{
			state=AnalogValue.warmerEmpty;
		}
	}
}
