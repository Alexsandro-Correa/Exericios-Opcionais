package br.com.alexsandro.ex.opcional04;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		// Uma parede em formato retangular, cuja altura e a
		// largura precisa ser coberta por azulejos tamb�m
		// retangulares. O azulejo retangular tem dimens�es altura do azulejo e
		// largura do azulejo. Escreva um programa que leia as quatro medidas
		// calcule e imprima quanto azulejos com as medidas dadas s�o
		// necess�rios para cobrir a parede dada.
		
		float alturaParede, larguraParede, alturaAzulejo, larguraAzulejo, azulejosNecessarios;
		
		System.out.println("Digite a altura da parede:");
		alturaParede = input.nextFloat();
		
		System.out.println("Digite a largura da parede:");
		larguraParede = input.nextFloat();
		
		System.out.println("Digite a altura do azulejo:");
		alturaAzulejo = input.nextFloat();
		
		System.out.println("Digite a largura do azulejo:");
		larguraAzulejo = input.nextFloat();
		
		azulejosNecessarios = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);
		
		System.out.println("\nSer�o necess�rios " + azulejosNecessarios + " azulejos para cobrir a parede.");
		
		
	}
}
