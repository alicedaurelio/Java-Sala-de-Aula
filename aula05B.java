
package aula5;

import javax.swing.JOptionPane;

public class aula05B{
    
    public  static  void  main ( String [] args ) {
		// stub do método TODO gerado automaticamente

		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String message = String.format("Seu nome é %s", nome);
		JOptionPane.showMessageDialog(null, message);
                
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
                JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
               
                
                if (idade >= 18){
                    JOptionPane.showMessageDialog(null,nome + ", você é maior de idade ");
                }else{
                    JOptionPane.showMessageDialog(null, nome + ", você é menor de idade ");
            }
                
	}
}
