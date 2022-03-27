import java.util.Scanner;

public class Scanner02 {
 
    public static void main(String[] args){
				
	Scanner input = new Scanner(System.in);
		        
	int idade;
	String nome;
		        
	System.out.printf("Digite seu nome: ");
	nome = input.nextLine();				// nextLine() ler conteudo String
		        
	System.out.printf("Digite sua idade: ");		// nextInt() ler conteudo Inteiro
	idade = input.nextInt();
		        
        System.out.printf("Seu nome é %s , e sua idade é %d\n\n", nome, idade);
	}
}
