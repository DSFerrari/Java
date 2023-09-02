package Curso_java;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double peso,altura,imc;
		
		Scanner teclado = new Scanner(System.in);
		
	System.out.println("Insira o peso");
	peso = teclado.nextDouble();
	
	System.out.println("Insira a altura");
	altura = teclado.nextDouble();
	
	teclado.close();
	
	imc = peso/(altura*altura);
	
	if (imc<=18.5) {
		System.out.println("Abaixo do peso");
	}
	else if (imc>=18.6 && imc<=24.9) {
		System.out.println("Peso ideal");
	}
	else if (imc>=25.0 && imc<=29.9) {
		System.out.println("Levemente acima do peso");
	}
	else if (imc>=30.0 && imc<=34.9) {
		System.out.println("Obesidade grau I");
	}
		else if (imc>=35.0 && imc<=38.9) {
			System.out.println("Obesidade grau II(severa)");
		}
	else {
		System.out.println("Obesidade III (morbida)");
	}
}
}
