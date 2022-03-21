package procon;

/**
 *
 * @author Aluno02
 */
public class Consumidor extends Thread {      // extends é porque a classe é estendida - Thread é o processo.
 
    private int idConsumidor;
    private Buffer pilha;                    // buffer é um tipo de memoria que armazena temporariamente os dados.
    private int totalConsumir;
    
public Consumidor(int id, Buffer p, int totalConsumir){ 
    
    idConsumidor = id;
    pilha = p;
    this.totalConsumir = totalConsumir;
} // fim do public Consumidor

public void run(){
    for (int i = 0; 1 < totalConsumir; i++){;
        pilha.get(idConsumidor, i);                    // get: pegar, consumir.
    }
    System.out.println("Consumidor #  " + idConsumidor + "concluído!");
}

} // fim do main
