package com.pedropaiva.operacoesaritimeticasbasicas;

import java.util.Scanner;

public class OperacoesAritimeticasBasica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
System.out.println("Somar");
		
		System.out.println("Digite o valor de A");
		
		int valordeA = scan.nextInt();
		
		System.out.println("Digite o valor de B");
		
		
		int valordeB = scan.nextInt();
		
	int somadeAeB = valordeA + valordeB;
	
		
		System.out.println("Soma e: " + somadeAeB);
		
		System.out.println("Subtrair");
		
		System.out.println("Digite o valor de C");
		int valordeC = scan.nextInt();
		
		System.out.println("Digite o valor de D");
		int valordeD = scan.nextInt();
		
		int subtrairCeD = valordeC - valordeD;
		System.out.println("subtraçao e" + subtrairCeD);
		
		System.out.println("Multiplicaçao");
		
		System.out.println("Valor de E");
		int valordeE = scan.nextInt();
		
		System.out.println("Valor de F");
		int valordeF = scan.nextInt();
		
		int multiplicarEeF = valordeE * valordeF;
		System.out.println("multiplicaçao e" + multiplicarEeF);
		
		System.out.println("Diviçao");
		
		System.out.println("Valor de G");
		Double valordeG = scan.nextDouble();
		
		System.out.println("valor de H");
		Double valordeH = scan.nextDouble();
		
		Double divisaodeGeH = valordeG / valordeH;
		System.out.println("divisao e" + divisaodeGeH);
		
	}

}
