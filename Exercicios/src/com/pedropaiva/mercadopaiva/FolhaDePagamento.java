package com.pedropaiva.mercadopaiva;

import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Nome do Funcionario: ");
		nome = scan.nextLine();
		
		System.out.println("Dias Trabalhados: ");
		int diasTrabalhados = scan.nextInt();
		
		System.out.println("Comisao: ");
		double comisao = scan.nextDouble();
		
		double inss = 0.08;
		
		double diaDoServiço = 52.50;
		
		double valordoSalarioBruto = diasTrabalhados * diaDoServiço;
		
		double valordosalarioinnsdescontado = (valordoSalarioBruto * (-inss)) + valordoSalarioBruto;
		
		double valorComisao = valordoSalarioBruto * (comisao/100);
		
		double valordoSalarioLiquido = valordosalarioinnsdescontado + valorComisao;
		
			System.out.println("Nome do Funcionario: " + nome);
			
		System.out.println("Dias Trabalahados: " + diasTrabalhados);
		
		System.out.println("Valor de Comisao: " + valorComisao);
	
		System.out.println("Valor Salario Liquido: " + valordoSalarioLiquido);
		
		System.out.println("Valor Salario Bruto: " + valordoSalarioBruto);
		
		
		
		
		

	}

}
