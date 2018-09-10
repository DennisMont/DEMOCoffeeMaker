package cfd;

public class Pot {
	final int capMax = 12;
	Sensor potSensor;
	protected int actualCapacity;
	Pot() {
		potSensor = new PotSensor();
		actualCapacity = 0;
	}
	
	public void putCoffeeInPot(int cupOfCoffe) {
		actualCapacity = actualCapacity+cupOfCoffe;
	}
	
	public int getActualCapacity () {
		return actualCapacity;	
	}
	
	public void removePot() {
		potSensor.setState(AnalogValue.warmerEmpty);	
	}
	
	public void putPot( ) {
		if(actualCapacity != 0) 
		{
			potSensor.setState(AnalogValue.potNotEmpty);
		} else {
			potSensor.setState(AnalogValue.potEmpty);
		}
		
	}
	

}
