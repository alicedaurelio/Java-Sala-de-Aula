import java.util.Scanner;
import javax.swing.JOptionPane;

public class ImcSwing {
    
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 

        float altura, peso, imc; 

        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua Altura")); 

        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Peso")); 

        imc = peso / (altura * altura); 

        if (imc <= 19){ 
            JOptionPane.showMessageDialog(null, "Seu imc é:" + imc + "Classificação => Abaixo do peso "); 

        }else if (imc <= 25){ 
            JOptionPane.showMessageDialog(null, "Seu imc é:" + imc + "Classificação => Peso Ideal"); 

        }else if (imc <= 30){ 
            JOptionPane.showMessageDialog(null, "Seu imc é:" + imc + "Classificação => Sobre Peso"); 
            
        }else 
            JOptionPane.showMessageDialog(null, "Seu imc é:" + imc + "Classificação => Obesidade"); 

 

} 
}
