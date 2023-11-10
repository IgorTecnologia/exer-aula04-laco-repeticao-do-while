package com.igor.cursojava.aula04;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		int numero, soma =0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			numero = scan.nextInt();
			if(numero >=0) {
				soma += numero;
			}
		}while(numero !=0);
		
		System.out.println("\nA soma dos números positivos é: " + soma);

	}

}
