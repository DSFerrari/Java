package Curso_java;

public class FunçõesJava {

	public static void main(String[] args) {
		String nome;
		nome = "Diego Souza";
		char Gênero = 'M';
		int Idade = 18;
		double Temperatura = 17.5;
		boolean Sono = true;
		System.out.println("Uso de variáveis na linguagem java");
		System.out.println("Nome: " + nome);
		System.out.println("Genero: " + Gênero);
		System.out.println("Idade: " + Idade);
		System.out.println("Temperatura: " + Temperatura);
		System.out.println("Sono: " + Sono);
		System.out.println("__________________________________");
		System.out.println(" ");
		System.out.println("Uso de operadores na linguagem java");
		System.out.println("Exemplos");
		double i=37;
		System.out.println("i = "+ i);
		System.out.println("i = " + i + " i + 7|i= "+ (i+7));
		System.out.println("i = " + i + " i - 19|i= "+ (i-19));
		System.out.println("i = " + i + " i * 12|i= "+ (i*12));
		System.out.println("i = " + i + " i / 37|i= "+ (i/37));
		System.out.println("i = " + i + " i % 37|i= "+ (i%37));
		System.out.println("i += 5 " + (i+= 5));
		System.out.println("i -= 5 " + (i-= 5));
		System.out.println("i *= 5 " + (i*= 5));
		System.out.println("i += 5 " + (i/= 5));
		i++;
		System.out.println("i ++ = " + i);
		i--;
		System.out.println("i -- = " + i);
		System.out.println("if e else");
		if (Gênero=='M') {
			System.out.println("Serviço Militar Obrigatório");
		}
		else {
			System.out.println("Servico Militar Nâo é obrigatório");
		}
	}
}
