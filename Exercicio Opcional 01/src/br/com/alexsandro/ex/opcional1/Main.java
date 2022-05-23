package br.com.alexsandro.ex.opcional1;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static float C;
	public static void main(String[] args) {
		/* 1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta 
		e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as
		*/
		
		byte option;
		
		do {
			
			System.out.println(menuOpcoes());
			option = entrada.nextByte();
			
			switch(option) {
			
			case 0:
				System.out.println("Saindo...");
				break;
				
			case 1:
				converterKelvin();
				break;
				
			case 2:
				converterReamur();
				break;
				
			case 3:
				converterRankine();
				break;
				
			case 4:
				converterFahrenheit();
				break;
				
			default:
				System.out.println("Escolha uma opção válida entre 0 e 4.\n");
				break;
			}
			
		}while(option != 0);
		
		System.out.println("Obrigado por utilizar o programa Conversor de Celsius!");
		
		
	}
	
	public static String menuOpcoes() {
		
		String conteudoMenu = "";
		conteudoMenu += "Escolha a conversão desejada ou sair:\n";
		conteudoMenu += "\t0 - Sair\n";
		conteudoMenu += "\t1 - Converter Kelvin\n";
		conteudoMenu += "\t2 - Converter Réamur\n";
		conteudoMenu += "\t3 - Converter Rankine\n";
		conteudoMenu += "\t4 - Converter Fahrenheit\n";
		
		return conteudoMenu;
	}
	
	public static void converterKelvin() {
		
		float K;
				
		System.out.println("Digite a temperatura em graus Celsius");
		C = entrada.nextFloat();
		
		K = (float) (C + 273.15);
		
		System.out.println("\n" +  C + "ºC, em Kelvin é " + K + "ºK" + "\n");
		
	}
	
	public static void converterReamur() {
		
		float Re;
		
		System.out.println("Digite a temperatura em graus Celsius");
		C = entrada.nextFloat();
		
		Re = (float) (C * 0.8);
		
		System.out.println("\n" + C + "ºC, em Réamur é " + Re + "ºRe" + "\n" );
		
	}
	
	public static void converterRankine() {
		
		float Ra;
		
		System.out.println("Digite a temperatura em graus Celsius");
		C = entrada.nextFloat();
		
		Ra = (float) (C * 1.8 +32 +459.67);
		
		System.out.println("\n" + C + "ºC, em Rankine é " + Ra + "ºRa" + "\n");
		
	}
	
	public static void converterFahrenheit() {
		
		float F;
		
		System.out.println("Digite a temperatura em graus Celsius");
		C = entrada.nextFloat();
		
		F = (float) (C * 1.8 + 32);
		
		System.out.println("\n" + C + "ºC, em Fahrenheit é " + F + "ºF" + "\n");
	}

}
