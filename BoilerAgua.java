package cfd;
import cfd.BoilerHeater;
import cfd.IBoiler;
import cfd.Valvula;
import cfd.WaterSensor;

public class BoilerAgua implements IBoiler {
		private BoilerHeater boilerHeater;
		private WaterSensor waterSensor;
		private Valvula valvula;
	
		public BoilerAgua() {
			
			boilerHeater = new BoilerHeater();
			waterSensor = new WaterSensor();
			valvula = new Valvula();
		}

		public boolean isEmpty() {
			return waterSensor.getState() == EnumBoilerState.boilerEmpty;
		}

		public void fillBoiler() {
			waterSensor.setState(EnumBoilerState.boilerNotEmpty);
		}
		
		public void emptyBoiler() {
			waterSensor.setState(EnumBoilerState.boilerEmpty);
		}

		public void turnOffHeater() {
			boilerHeater.turnOff();
		}

		public void turnOnHeater() {
			boilerHeater.turnOn();
		}
		
		public EnumDeviceState getHeaterState() {
			return boilerHeater.getState();
		}
		
		public void OpenValve() {
			valvula.open();
		}
		
		public void CloseValve() {
			valvula.close();
		}

		public boolean IsValveOpen() {
			return valvula.isOpen();
		}

	
}
