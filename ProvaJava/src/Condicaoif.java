import java.util.Scanner;

public class Condicaoif {
    public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
		    
    int numero1, numero2;
		    
    System.out.println("Digite o valor para 1 e 2 e tecle enter!");
    numero1 = input.nextInt();
    numero2 = input.nextInt();
		        
    if (numero1 == numero2)
    System.out.printf("%d == %d%n", numero1, numero2);  // igual que
    
    if (numero1 != numero2)
      System.out.printf("%d != %d%n", numero1, numero2);  // diferente que
		        
    if (numero1 > numero2)
      System.out.printf("%d > %d%n", numero1, numero2);  // maior que
		        
    if (numero1 < numero2)
      System.out.printf("%d < %d%n", numero1, numero2);  // menor que
		        
    if (numero1 <= numero2)
      System.out.printf("%d <= %d%n", numero1, numero2);  // menor ou igual que
		        
    if (numero1 >= numero2)
       System.out.printf("%d >= %d%n", numero1, numero2);  // maior ou igual que
		    }
}
