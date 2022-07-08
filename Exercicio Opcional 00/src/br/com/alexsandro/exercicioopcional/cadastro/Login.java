package br.com.alexsandro.exercicioopcional.cadastro;

import java.util.Scanner;

public class Login implements Dados {

	static Scanner input = new Scanner(System.in);

	public static void login() {

		email();

	}

	public static void email() {
		String usuarioEmail;
		boolean confirmacao = true;

		System.out.println("Informe o seu nome de usu�rio ou email:");
		usuarioEmail = input.next();

		do {
			if (usuarioEmail.equals(email.get(email.indexOf(usuarioEmail)))) {
				System.out.println("Acesso Liberado");
				// retornar um m�todo listando o perfil dele,e dentro vai ter um m�todo
				// praticar();

				confirmacao = true;

				System.out.println("Informe o seu email:");
				usuarioEmail = input.next();

			} else {
				confirmacao = false;
				System.out.println("Usu�rio n�o existe...");
			}

		} while (confirmacao != false);

		System.out.println("Falso");

		// Listar usu�rios cadastrados
		System.out.println("Lista de usu�rios:");
		for (String usuario : email) {
			System.out.println("\t" + usuario.toUpperCase());
		}

	}

}
