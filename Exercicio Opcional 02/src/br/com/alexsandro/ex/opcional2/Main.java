package br.com.alexsandro.ex.opcional2;

import java.util.Scanner;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino,
		 * feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva: a. a maior
		 * e a menor altura do grupo; b. média de altura dos homens; c. o número de
		 * mulheres.
		 */

		String sexo;
		byte qtMulheres = 0, qtHomens = 0;
		byte qtPessoas[] = new byte[10];
		float altura, soma = 0, mediaHomens = 0, maior = 0, menor = 0;

		System.out.println("Programa baseado na altura e sexo de 10 pessoas fornecido pelo usuário:\n");

		for (byte contador = 1; contador <= qtPessoas.length; contador++) {
			System.out.println("Digite o sexo da " + contador + "ª pessoa: (m = masculino, f = feminino)");
			sexo = entrada.next();

			System.out.println("Digite a altura da " + contador + " ª pessoa.");
			altura = entrada.nextFloat();

			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino")) {
				qtHomens++;
				soma = soma + altura;

			} else if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")) {
				qtMulheres++;

			} else {

			}

			if (contador == 1) {
				menor = altura;

			}

			if (altura > maior) {
				maior = altura;

			} else if (altura < menor) {
				menor = altura;
			}

		}

		mediaHomens = soma / qtHomens;

		System.out.println("\nA maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
		System.out.println("A média de altura dos homens é " + mediaHomens + " m");
		System.out.println("O número de mulheres é " + qtMulheres);

	}

}
