package PadroesCriacionais.factoryMethod.factory;

import PadroesCriacionais.factoryMethod.model.PlacaNvidia;
import PadroesCriacionais.factoryMethod.model.Placas;

public class FactoryPlacasNvidia extends FactoryPlacas{

	@Override
	public Placas criarProduto() {
		return new PlacaNvidia();
	}

	
	
	
}
