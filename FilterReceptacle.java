package cfd;

public class FilterReceptacle {
	FilterReceptacleSensor sensorFilter;
	ConditionFR filterAndCoffe;
	
	public FilterReceptacle() {
		sensorFilter = new FilterReceptacleSensor();
		filterAndCoffe = ConditionFR.NonDetected;
	}

	public void close() {
		sensorFilter.setEstate(ConditionFR.Detected);
	}

	public void Open() {
		sensorFilter.setEstate(ConditionFR.NonDetected);
	}
	
	// Metodo para introducir granos de cafe y filtro
	public String putFilterAndCoffe() {
		if(sensorFilter.filterReceptIsOpen()) 
		{
			if(hasFilterAndCoffe()) 
			{
				return "El receptaculo ya contiene cafe";
			} else {
				filterAndCoffe = ConditionFR.Detected;
				return "Cafe Colocado en el receptaculo";
				}
		} else {
			return "Favor cerrar el receptaculo del cafe";
		}
	}

	public boolean hasFilterAndCoffe() {
		if (filterAndCoffe == ConditionFR.Detected) {
			return true;
		} else {
			return false;
		}
	}

}
