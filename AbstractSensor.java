package cfd;

public abstract class AbstractSensor implements Sensor{

	TypeEnum state;
	
	public AbstractSensor() {
		state = DigitalValue.BoilerEmpty;
	}

	public void setState(TypeEnum typ) 
	{
		if(typ==DigitalValue.BoilerNonEmpty)
		{
			state=DigitalValue.BoilerNonEmpty;
		}
		else if(typ==DigitalValue.BoilerEmpty)
		{
			state=DigitalValue.BoilerEmpty;
		}
	}
	
	public TypeEnum getState() 
	{
		return state;
		
	}
	
}
