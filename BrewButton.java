package cfd;

public class BrewButton extends AbstractSensor {
	WaterSensor waterS = new WaterSensor();
	FilterReceptacleSensor filterS = new FilterReceptacleSensor();
	PressureSensor pressureS = new PressureSensor();
	
	public BrewButton()
	{}
	
	public boolean verifyConditions()
	{
		boolean state = false;
		//Verificamos si hay agua y si el recepaculo del filtro esta cerrado.
		if(waterS.getState()==DigitalValue.Detected && filterS.getState()==DigitalValue.Detected)
		{
			//Verificamos que el pot esta en posicion.
			if(pressureS.getState()==AnalogValue.potNotEmpty)
			{
				state=true;//El CoffeeMaker esta en condiciones de iniciar el preparado.
			}
		}
		return state;
	}
	
	public StageCoffeeMaker startBrew()
	{
		StageCoffeeMaker stagePosition = null;
		boolean condition;
		condition = verifyConditions();
		if(condition)
		{
			stagePosition=StageCoffeeMaker.BREW;
		}
		else
		{
			stagePosition=StageCoffeeMaker.FINISHED;
		}
		return stagePosition;
		
	}
	
}
