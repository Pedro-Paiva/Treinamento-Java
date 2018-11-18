package com.pedropaiva.operacoesaritimeticasbasicas;

public class CarroFlex {

	public void abastecer(Combustivel combustivel){
		System.out.println("Carro abastecido com : " + combustivel);
	}
	
	
	public static void main(String[] args) {
		CarroFlex carro = new CarroFlex();
		Etanol etanol = new Etanol();
		Gasolina gasolina = new Gasolina();
		
		carro.abastecer(etanol);
	}
}
