package geral;

import javax.swing.JOptionPane;

public class aula04C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("Qual seu nome");
		
		String message = String.format("Bem-vindo %s, Programação Java na veia! - Turma Fatecs SDP", name);    // %s de string é chamando o conteudo da variavel name.
		
		JOptionPane.showMessageDialog(null, message);
	}

}
