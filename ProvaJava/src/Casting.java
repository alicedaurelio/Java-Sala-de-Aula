
public class Casting {
    public static void main(String[] args) {
		
        int a,b;
	double resultado;
		
	a = 5;
	b = 2;
		
	resultado = (double) a / b;		// CASTING feito
		
	System.out.println("O seu resultado é: " + resultado);
		
	/* Esta retornando um valor inteiro, porque a e b são do tipo inteiro e a variavel resultado do tipo double.
	desta forma o java entende que por a e b serem do tipo inteiro o resultado tambem deve ser inteiro. 
	5 / 2 daria 2,5 e o java esta nos retornando 2.0 inteiro. Mostrar o resultado certo temos que fazer um CASTING*/
		
	/*	resultado = (double) a / b; */

    }

}
