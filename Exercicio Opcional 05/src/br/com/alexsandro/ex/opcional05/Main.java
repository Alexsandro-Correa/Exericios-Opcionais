package br.com.alexsandro.ex.opcional05;

public class Main {

	public static void main(String[] args) {
		// Calcular e apresentar o valor do volume de uma lata de �leo, utilizando f�rmula: V = 3.14159 * R * R * A,
		//em que as vari�veis: V, R e A representam respectivamente o volume, o raio e a altura.
		//Vamos declarar as vari�veis V, R e A como double e definir um valor qualquer para as vari�veis
		//de altura e de raio. Agora vamos escrever a f�rmula, conforme dita no enunciado e, em seguida, 
		//exibir na tela uma mensagem contendo o resultado do volume encontrado.
		
		System.out.println("O volume dessa lata de �leo �: " + calcularValor() + "m�.");

	}
	
	public static Float calcularValor() {
		
		float volume, raio = 1.6f, altura = 0.80f;
		volume = 3.14159f * raio * raio * altura;
		
		return volume;
	}

}
