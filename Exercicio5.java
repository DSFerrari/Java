package Curso_java;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double gasolina,alcool;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor do litro do alcool");
		alcool = teclado.nextDouble();
		
		System.out.println("Insira o valor do litro da gasolina");
		gasolina = teclado.nextDouble();

		teclado.close();
		if (alcool < 0.7*gasolina) {
			System.out.println("Abastecer com alcool");
		}
		else {
			System.out.println("Abastecer com gasolina");
		}
	}

}
