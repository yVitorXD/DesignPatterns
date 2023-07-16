package PadroesCriacionais.factoryMethod.factory;

import PadroesCriacionais.factoryMethod.model.Placas;

public abstract class FactoryPlacas {

	public abstract Placas criarProduto();
	
	public void realizarOperacao() {
		
		Placas placa = criarProduto();
		placa.criarPlaca();
		placa.marca();
		placa.nome();
		
	}
	
	
}
