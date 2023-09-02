package Curso_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios4 {

	public static void main(String[] args) {
		
		double hora,remuneração,custo,cargahorária;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Insira a remuneração mensal");
		remuneração = teclado.nextDouble();
		
		System.out.println("Insira o custo de operação");
		custo = teclado.nextDouble();
		
		System.out.println("Insira a carga horária mensal");
		cargahorária = teclado.nextDouble();
		
		teclado.close();
		
		hora = (remuneração+(remuneração*0.3)+custo+(remuneração*0.2))/cargahorária;
		
		System.out.println("Seu valor por hora é : R$ "+ formatador.format(hora));
		
	}
}
