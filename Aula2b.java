package aula2b;

import java.util.Scanner;

/**         
        System.out.printf("O primeiro valor digitado foi %d, e o segundo valor digitado foi %d ", numero1, numero2);
 *
 * @author Aluno01
 */
public class Aula2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    int numero1, numero2;
    
        System.out.println("Digite o valor para 1 e 2 e tecle enter!");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        
        if (numero1 == numero2)
            System.out.printf("%d == *igual que* %d%n", numero1, numero2);
        
        if (numero1 != numero2)
            System.out.printf("%d != *diferente que* %d%n", numero1, numero2);
        
        if (numero1 > numero2)
            System.out.printf("%d > *maior que* %d%n", numero1, numero2);
        
        if (numero1 < numero2)
            System.out.printf("%d < *menor que* %d%n", numero1, numero2);
        
        if (numero1 <= numero2)
            System.out.printf("%d <= *menor ou igual que* %d%n", numero1, numero2);
        
        if (numero1 >= numero2)
            System.out.printf("%d >= *maior ou igual qu* %d%n", numero1, numero2);
    }
}
    