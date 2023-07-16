package PadroesCriacionais.factoryMethod.factory;

import PadroesCriacionais.factoryMethod.model.PlacaAMD;
import PadroesCriacionais.factoryMethod.model.Placas;

//subclasse concreta de factoryplacas
public class FactoryPlacasAMD extends FactoryPlacas {

	@Override
	public Placas criarProduto() {
		return new PlacaAMD();
	}

}
