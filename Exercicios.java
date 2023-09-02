package Curso_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double percent,y;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Insira o valor de y :");
		y = teclado.nextDouble();
		
		System.out.println("Insira o valor de porcentagem que deseja do numero " + y);
		percent = teclado.nextDouble();
		teclado.close();
		
		y = y*0.01;
		
		percent = percent*y;
		
		System.out.println("o resultado é : "+ formatador.format(percent));
		
	}

}
