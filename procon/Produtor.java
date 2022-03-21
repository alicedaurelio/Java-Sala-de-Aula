package procon;

public class Produtor extends Thread {
    
    private int idProdutor;
    private Buffer pilha;     
    private int producaoTotal;
    
    
    public Produtor (int id, Buffer p, int produtoTotal){
        idProdutor = id;
        pilha = p;
        this.producaoTotal = produtoTotal;  
    }
    public void run(){
        for (int  i = 0; i < producaoTotal; i++){
            pilha.set(idProdutor, i);               // set: setar, enviar.
        }
        System.out.println("Produtor #  " + idProdutor + "concluído!" );
    }
} // fim do void
