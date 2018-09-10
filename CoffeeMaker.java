package cfd;

public class CoffeeMaker {
	FilterReceptacle filterRecept;
	Pot pot;
	
	public CoffeeMaker() {
		
		filterRecept = new FilterReceptacle();
		pot = new Pot();
	}

	public String introducirFiltroCafe() {
		return filterRecept.putFilterAndCoffe();
	}
	
	public String abrirFiltroCafe() {
		filterRecept.Open();
		return "Receptaculo de Filtro y Cafe Abierto";
	}
	
	public String cerrarFiltroCafe() {
		filterRecept.close();
		return "Receptaculo de Filtro y Cafe cerrado";
	}
	
	
	// W
	
	

	public String introducirAgua() {

		return null;
		// TODO Auto-generated method stub

	}

	public String colocarPot() {
		return null;
		// TODO Auto-generated method stub
	}

	public String presionarBotonPreparado() {
		return null;
		// TODO Auto-generated method stub

	}

	public String retirarPot() {
		// TODO Auto-generated method stub
		return null;
	}

	public String servirCafe() {
		// TODO Auto-generated method stub
		return null;
	}

		

}
