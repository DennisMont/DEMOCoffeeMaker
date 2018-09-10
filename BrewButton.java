package cfd;

public class BrewButton extends AbstractSensor {
	WaterSensor waterS = new WaterSensor();
	FilterReceptacleSensor filterS = new FilterReceptacleSensor();
	PlateSensor plateS = new PlateSensor();
	
	public BrewButton()
	{}
	
	public boolean verifyConditions()
	{
		boolean estado = false;
		//Verificamos si hay agua y si el recepaculo del filtro esta cerrado.
		if(waterS.getState()==DigitalValue.BoilerNonEmpty && filterS.getState()==DigitalValue.BoilerNonEmpty)
		{
			//Verificamos que el pot esta en posicion.
			if(plateS.getState()==AnalogValue.potNotEmpty || plateS.getState()==AnalogValue.potEmpty)
			{
				estado=true;//El CoffeeMaker esta en condiciones de iniciar el preparado.
			}
		}
		return estado;
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
