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

		System.out.println("Informe o seu nome de usuário ou email:");
		usuarioEmail = input.next();

		do {
			if (usuarioEmail.equals(email.get(email.indexOf(usuarioEmail)))) {
				System.out.println("Acesso Liberado");
				// retornar um método listando o perfil dele,e dentro vai ter um método
				// praticar();

				confirmacao = true;

				System.out.println("Informe o seu email:");
				usuarioEmail = input.next();

			} else {
				confirmacao = false;
				System.out.println("Usuário não existe...");
			}

		} while (confirmacao != false);

		System.out.println("Falso");

		// Listar usuários cadastrados
		System.out.println("Lista de usuários:");
		for (String usuario : email) {
			System.out.println("\t" + usuario.toUpperCase());
		}

	}

}
