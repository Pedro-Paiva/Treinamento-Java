package com.pedropaiva.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo e: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome e: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade e: " + idade );
		
		System.out.println("Digite a sua altura: ");
		Double altura = scan.nextDouble();
		System.out.println("A sua altura e " +altura);
		
		System.out.println("Digite o seu primeiro nome, idade, quantidades de filhos, altura, e sem tem bicho de estimaçao:");
		String primeiroNome2 = scan.next();
		int idade2 = scan.nextInt();
		byte qtdfilhos = scan.nextByte();
		Double altura2 = scan.nextDouble();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valors:");
		System.out.println("Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de Filhos; " + qtdfilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem Bicho de Estimaçao: " + temPet);
		
		
		
		
		
		

	}

}
