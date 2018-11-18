package com.pedropaiva.mercadopaiva;

import java.util.Scanner;

public class MercadoPayva {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double biscoitoRecheado = 3.50;
		Double cerveja = 2.50;
		Double leite = 1.00;
		
		String nome  ;
		
	System.out.println("Nome do Cliente: ");
	 nome = scan.nextLine();
	
	 System.out.println("Quantidade de Cerveja: ");
	 int quantC = scan.nextInt();
	 
	 System.out.println("Quantidade de Leite: ");
	 int quantL = scan.nextInt();
	 
	 System.out.println("Quantidade de Biscoito Recheado: ");
	 int quantBR = scan.nextInt();
	 
	 System.out.println("Nome do Cliente: " + nome );
	 
	 Double valordacompraBiscoito = quantBR * biscoitoRecheado;
	 System.out.println("Total Biscoito: " + valordacompraBiscoito);
	 
	 Double valordacompraCerveja = quantC * cerveja;
	 System.out.println("Total Cerveja: " + valordacompraCerveja);
	 
	 Double valordacompraLeite = quantL * leite;
	 System.out.println("Total Leite: " + valordacompraLeite);
	 
	 Double valorTotalCompra = valordacompraBiscoito + valordacompraCerveja + valordacompraLeite;
	 System.out.println("Valor Total da Compra: " + valorTotalCompra);
	 
	 
		
	 
		

	}

}
