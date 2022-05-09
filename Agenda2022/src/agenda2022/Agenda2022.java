
package agenda2022;

/**
 *
 * @author Alice Daurelio Dias      4 semestre
 * @since 09/05/2022
 */
public class Agenda2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BancoDeDados bancodedados = new BancoDeDados();
        
        //bancodedados.aliceDesconectar();
        bancodedados.aliceConectar();
        //bancodedados.aliceInserir();
        //bancodedados.aliceInserirAtrib("Milena", "11954492704", "milena@gmail.com");
        //bancodedados.aliceListarAsc();
        //bancodedados.aliceListarDesc();
        //bancodedados.aliceListarAtrib("1");
        //bancodedados.aliceApagar();
        //bancodedados.aliceApagarAtrib("3");
        //bancodedados.aliceAlterar();
        //bancodedados.aliceAlterarAtrib("01", "Manuela", "11954492704", "manuela@gmail.com");
        
        
        if (bancodedados.aliceEstaConectado()){
            System.out.println("Conectado");
        }else{
            System.out.println("Não está conectado");
        }
       
    }
}
