package br.com.alexsandro.ex.opcional03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Criar um programa que calcule a m�dia de sal�rios de uma empresa, pedindo ao
		// usu�rio a
		// grade de funcion�rios e os sal�rios, e devolvendo a m�dia salarial.

		float salario[] = new float[6];
		float mediaSalario;
		float soma = 0;
		ArrayList<String> funcionarios = new ArrayList<>();

		System.out.println("Digite o nome do primeiro  funcion�rio: ");
		funcionarios.add(input.next());
		System.out.println("Digite o sal�rio que o " + funcionarios.get(0) + " recebe:");
		salario[0] = input.nextFloat();

		System.out.println("Digite o nome do segundo funcion�rio: ");
		funcionarios.add(input.next());
		System.out.println("Digite o sal�rio que o " + funcionarios.get(1) + " recebe:");
		salario[1] = input.nextFloat();

		System.out.println("Digite o nome do terceiro funcion�rio: ");
		funcionarios.add(input.next());
		System.out.println("Digite o sal�rio que o " + funcionarios.get(2) + " recebe:");
		salario[2] = input.nextFloat();

		System.out.println("Digite o nome do quarto funcion�rio: ");
		funcionarios.add(input.next());
		System.out.println("Digite o sal�rio que o " + funcionarios.get(3) + " recebe:");
		salario[3] = input.nextFloat();

		System.out.println("Digite o nome do quinto funcion�rio: ");
		funcionarios.add(input.next());
		System.out.println("Digite o sal�rio que o " + funcionarios.get(4) + " recebe:");
		salario[4] = input.nextFloat();

		System.out.println("Digite o nome do sexto funcion�rio: ");
		funcionarios.add(input.next());
		System.out.println("Digite o sal�rio que o " + funcionarios.get(5) + " recebe:");
		salario[5] = input.nextFloat();

		System.out.println("Lista de funcion�rios: " + funcionarios.size());
		for (byte contador = 0; contador < funcionarios.size(); contador++) {
			System.out.println("\t" + funcionarios.get(contador) + " recebe por m�s " + salario[contador] + " reais.");
			soma = soma + salario[contador];
		}

		mediaSalario = soma / salario.length;
		System.out.println("\nA m�dia de sal�rio da empresa � de " + mediaSalario + " reais.");

	}

}
