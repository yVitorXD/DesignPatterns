package PadroesCriacionais.factoryMethod.model;

public class PlacaAMD implements Placas{

	@Override
	public void criarPlaca() {
		System.out.println("Criando Placa AMD ");
	}

	@Override
	public void nome() {
		System.out.println("RX 6800");
	}

	@Override
	public void marca() {
		System.out.println("AMD");
	}

	
	
	
}
