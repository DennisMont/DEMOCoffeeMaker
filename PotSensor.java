package cfd;

public class PotSensor extends AbstractSensor{

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
	
	public TypeEnum getState() {
		return state;
	}
}
