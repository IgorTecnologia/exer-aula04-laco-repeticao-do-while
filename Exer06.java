package com.igor.cursojava.aula04;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		int numero;
		int somaMultiplosDeTres =0;
		int contadorMultiplosDeTres =0; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os números: ");
		do{
			numero = scan.nextInt();
			if(numero != 0 && numero % 3 == 0) {
				somaMultiplosDeTres += numero;
				contadorMultiplosDeTres ++;
			}
	}while(numero !=0);
	
	if(contadorMultiplosDeTres >0) {
		double mediaMultiplosDeTres = (double) somaMultiplosDeTres / contadorMultiplosDeTres; 
		System.out.println("A média dos números múltiplos de 3 digitados é: " + mediaMultiplosDeTres);
	}else {
		System.out.println("\nNenhum número múltiplo de 3 foi digitado...");
	}
	
	
	}
}
