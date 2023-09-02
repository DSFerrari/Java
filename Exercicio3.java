package Curso_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double percent_valor,valor_total,desconto,total_com_desconto,valor_pago,troco;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Insira o valor total :");
		valor_total = teclado.nextDouble();
		
		System.out.println("Insira o valor de desconto :");
		desconto = teclado.nextDouble();
		
		percent_valor= (100 - desconto)/100;
		
		total_com_desconto = valor_total*percent_valor;
		
		System.out.println("Valor total com desconto : R$ "+ total_com_desconto);
		
		System.out.println("Insira o valor pago :");
		valor_pago= teclado.nextDouble();
		
		troco = valor_pago - total_com_desconto;
		
		teclado.close();
		
		System.out.println("Troco = R$ " + formatador.format(troco));
		
	}

}
