package aula5;

import java.util.Scanner;

public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int idade;
        String nome;
        
        System.out.printf("Digite seu nome: ");
        nome = input.nextLine();
        
        System.out.printf("Digite sua idade: ");
        idade = input.nextInt();
        
        System.out.printf("Seu nome é %s , e sua idade é %d\n\n", nome, idade);
        
        if (idade >= 18){
               System.out.printf("%s, você é maior de idade", nome);
        }else{
            System.out.printf("%s, você é menor de idade\n", nome);
        }
    }
}
