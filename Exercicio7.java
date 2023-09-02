package Curso_java;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
		int computador,jogador;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("____JOKENPO____");
		System.out.println("                ");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a opção desejada");
		jogador = teclado.nextInt();
		teclado.close();
		switch(jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		computador = (int)(Math.random()*3+1);
		switch(computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}
		
		if ((jogador==1 && computador==3) || (jogador==2 && computador==1) || (jogador==3 && computador==2)){
			System.out.println("Jogador ganhou");
		}
		else if ((jogador==1 && computador==2) || (jogador==2 && computador==3) || (jogador==3 && computador==1)){
			System.out.println("Computador ganhou");
		}
		else {
			System.out.println("Empate");
		}
	}

}
