package PadroesCriacionais.factoryMethod.model;

public class PlacaNvidia implements Placas{

	@Override
	public void criarPlaca() {
		System.out.println("Criando Placa Nvidia");
	}

	@Override
	public void nome() {
		System.out.println("RTX3080");
	}

	@Override
	public void marca() {
		System.out.println("Nvidia");
	}

	

}
