package geral;

import java.util.Scanner;

public class aula4B {

	public static void main(String[] args) {
		
		//Defini��o de variaveis (crio o nome e tipifico a variavel / opcional atribuir valor)
		
		
	try (Scanner input = new Scanner(System.in)){
		float VarA, VarB, soma, divisao, multiplicacao, subtracao;
		
		System.out.println("Entre com o valor inteiro para VarA, e clique ENTER:");
		VarA = input.nextFloat ();
		

		System.out.println("Entre com o valor inteiro para VarB, e clique ENTER:");
		VarB = input.nextFloat ();
		
		soma = (VarA + VarB);
		System.out.printf("O resultado da sua soma �: %.2f\n", soma);
		
		
		divisao = (VarA / VarB);
		System.out.printf("O resultado da sua divisao �: %.2f\n", divisao);
		
		
		multiplicacao = (VarA * VarB);
		System.out.printf("O resultado da sua multiplicacao �: %.2f\n", multiplicacao);
		
		
		subtracao = (VarA - VarB);
		System.out.printf("O resultado da sua subtra��o �: %.2f", subtracao);
		}
	}
}
