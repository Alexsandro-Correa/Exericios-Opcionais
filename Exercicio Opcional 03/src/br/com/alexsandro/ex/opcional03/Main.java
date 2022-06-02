package br.com.alexsandro.ex.opcional03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Criar um programa que calcule a média de salários de uma empresa, pedindo ao
		// usuário a
		// grade de funcionários e os salários, e devolvendo a média salarial.

		float salario[] = new float[6];
		float mediaSalario;
		float soma = 0;
		ArrayList<String> funcionarios = new ArrayList<>();

		System.out.println("Digite o nome do primeiro  funcionário: ");
		funcionarios.add(input.next());
		System.out.println("Digite o salário que o " + funcionarios.get(0) + " recebe:");
		salario[0] = input.nextFloat();

		System.out.println("Digite o nome do segundo funcionário: ");
		funcionarios.add(input.next());
		System.out.println("Digite o salário que o " + funcionarios.get(1) + " recebe:");
		salario[1] = input.nextFloat();

		System.out.println("Digite o nome do terceiro funcionário: ");
		funcionarios.add(input.next());
		System.out.println("Digite o salário que o " + funcionarios.get(2) + " recebe:");
		salario[2] = input.nextFloat();

		System.out.println("Digite o nome do quarto funcionário: ");
		funcionarios.add(input.next());
		System.out.println("Digite o salário que o " + funcionarios.get(3) + " recebe:");
		salario[3] = input.nextFloat();

		System.out.println("Digite o nome do quinto funcionário: ");
		funcionarios.add(input.next());
		System.out.println("Digite o salário que o " + funcionarios.get(4) + " recebe:");
		salario[4] = input.nextFloat();

		System.out.println("Digite o nome do sexto funcionário: ");
		funcionarios.add(input.next());
		System.out.println("Digite o salário que o " + funcionarios.get(5) + " recebe:");
		salario[5] = input.nextFloat();

		System.out.println("Lista de funcionários: " + funcionarios.size());
		for (byte contador = 0; contador < funcionarios.size(); contador++) {
			System.out.println("\t" + funcionarios.get(contador) + " recebe por mês " + salario[contador] + " reais.");
			soma = soma + salario[contador];
		}

		mediaSalario = soma / salario.length;
		System.out.println("\nA média de salário da empresa é de " + mediaSalario + " reais.");

	}

}
