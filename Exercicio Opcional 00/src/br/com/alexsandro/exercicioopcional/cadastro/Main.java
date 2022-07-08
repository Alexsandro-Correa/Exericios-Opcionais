package br.com.alexsandro.exercicioopcional.cadastro;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Criar um cadastro com login e senha

		byte option;

		do {
			System.out.println(menu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				Cadastro.cadastro();
				break;

			case 2:
				Login.email();
				break;

			default:
				System.out.println("Digite uma opção válida...");
				break;

			}

		} while (option != 0);
		System.out.println("Obrigado por usar o programa 'Cadastro de usuário'");
	}

	public static String menu() {

		String menu = "Escolha uma opção do menu:";
		menu += "\n\t0 - Sair";
		menu += "\n\t1 - Cadastrar-se";
		menu += "\n\t2 - Login";

		return menu;

	}

}
