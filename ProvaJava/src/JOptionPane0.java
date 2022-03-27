import javax.swing.JOptionPane;
        
public class JOptionPane0 {
public static void main(String[] args) {
        int a, b, soma, multi, sub, pot, raiz;
        float divi;
        String numA, numB;
        
        //Entrada de dados em formato de String - SEMPRE!
        numA = JOptionPane.showInputDialog(null,"Digite o valor inteiro para A:","valor de A", 1); // Entrada de dados showInput, mostrar codigo com visual gráfica
        numB = JOptionPane.showInputDialog(null, "Digite o valor inteiro para B: ","valor de B",1); 
        
        //Conversão de String para inteiro
        a = Integer.parseInt(numA); // Integer.parseInt está convertendo a String numA e numB receber um valor inteiro, pois declaramos as variaveis como int.
        b = Integer.parseInt(numB); // Utilização do parser para conversão de String para inteiro
        
        soma = a + b;
        multi = a * b;
        sub = a - b;
        divi = (float)a / b;    //casthing para mostrar o resultado completo com decimais, e não só mostrar o resultado inteiro
        pot = (int) Math.pow(a,b);  //casthing para inteiro // pot de potencia
        raiz = (int) Math.sqrt(a); // casthing para inteiro // raiz de raiz quadrada
        
        // Configuração dos parâmetros para a caixa de diálogo:
        // JOptionPane.showMessageDialog(1,2,3,4 parâmetros)
        // 1- null (que não esta relacionada a nada) ou this (que esta relacionada a alguma janela)
        // 2- texto que aparece dentro da caixa de diálogo
        // 3- texto da barra de título da caixa
        // 4- ícone de -1 a 3 (-1 não aparece icon) (0 aparece icon de X - erro) (1 aparece icon de informação)(2 icon de atenção, aviso) (3 icon de questionamento)
        
        
        JOptionPane.showMessageDialog(null, "A Soma é: " + soma, "Resultado", 1); // Saida de dados showMessage, incluindo o null na frente para nao dar erro
        JOptionPane.showMessageDialog(null, "A Multiplicação é: " + multi, "Resultado", 1);
        JOptionPane.showMessageDialog(null, "A Subtração é: " + sub, "Resultado", 1);
        JOptionPane.showMessageDialog(null, "A Divisão é: " + divi, "Resultado", 1);
        JOptionPane.showMessageDialog(null, "A Potenciação de " + a + " elevado a " + b + " é => " + pot, "Resultado", 1);
        JOptionPane.showMessageDialog(null, "A Raiz quadrada de " + a + " é => " + raiz, " Resultado da raiz quadrada", 1);
        
        
        
    }//fim do main    
}
