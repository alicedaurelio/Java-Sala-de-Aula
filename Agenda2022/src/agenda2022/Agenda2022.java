
package agenda2022;

/**
 *
 * @author Aluno02
 */
public class Agenda2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BancoDeDados bancodedados = new BancoDeDados();
        
        bancodedados.conectar();
        //bancodedados.inserir();
        //bancodedados.alterar();
        //bancodedados.listarAsc();
        //bancodedados.listarDesc();
        //bancodedados.inserirAtrib("Milena", "11954492704");
        //bancodedados.apagar();
        bancodedados.apagarAtrib("3");
        
        if (bancodedados.estaConectado()){
            System.out.println("Conectado");
        }else{
            System.out.println("Não está conectado");
        }
        
        // bancodedados.desconectar();
    }
}
