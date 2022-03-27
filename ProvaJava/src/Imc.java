import java.util.Scanner;
public class Imc {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 

        float peso, altura, imc; 

        System.out.println("Informa sua altura: "); 

            altura = input.nextFloat(); 

        System.out.println("Informe seu peso: (kg)"); 

            peso = input.nextFloat();  

            imc = (peso / (altura * altura)); 

        System.out.printf("Seu IMC é: %.2f\n", imc); 

            if (imc <= 19) { 

                System.out.println ("Classificação => Abaixo do Peso"); 
            } 

            else if (imc <= 25) { 

        	System.out.println ("Classificação => Peso Ideal"); 
            } 
            else if (imc <= 30){ 

                System.out.println ("Classificação => Sobrepeso"); 
                }
            else
                System.out.println ("Classificação => Obesidade"); 
    }
}
