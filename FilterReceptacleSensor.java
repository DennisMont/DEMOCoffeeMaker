package cfd;
public class FilterReceptacleSensor extends AbstractSensor{
	ConditionFR estado;
		
	public FilterReceptacleSensor() {
		estado = ConditionFR.Detected;		
	}
		
	public ConditionFR getEstado() {
		return estado;
	}
	
	public void setEstate(ConditionFR estado) {
		this.estado=estado;
	}
	
	public boolean filterReceptIsOpen() {
		if(estado == ConditionFR.Detected) 
		{
			return false;
		} else { return true;}
	}
}