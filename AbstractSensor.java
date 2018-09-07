package cfd;

public abstract class AbstractSensor implements Sensor{

	TypeEnum state;
	
	public void setState(TypeEnum typ) 
	{
		if(typ==DigitalValue.Detected)
		{
			state=DigitalValue.Detected;
		}
		else if(typ==DigitalValue.NonDetected)
		{
			state=DigitalValue.NonDetected;
		}
	}
	
	public TypeEnum getState() 
	{
		return state;
		
	}
	
}
