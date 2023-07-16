package PadroesCriacionais.factoryMethod;

import PadroesCriacionais.factoryMethod.factory.FactoryPlacas;
import PadroesCriacionais.factoryMethod.factory.FactoryPlacasAMD;
import PadroesCriacionais.factoryMethod.factory.FactoryPlacasNvidia;

public class Cliente {

	public static void main(String[] args) {
		
		FactoryPlacas placas1 = new FactoryPlacasAMD();
		placas1.realizarOperacao();
		
		System.out.println();
		FactoryPlacas placas2 = new FactoryPlacasNvidia();
		placas2.realizarOperacao();
		
		
		
		
	}
	
}
