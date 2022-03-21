package procon;

public class Buffer {
    private int conteudo;
    private boolean disponivel;
    
    public synchronized void set(int idProdutor, int valor){
        while (disponivel == true){
            try{                                                    // controla a execução se verdade ou falso
                System.out.println("Produtor #  " + idProdutor + " esperando... " );
                wait();
            }catch(Exception e){
                e.printStackTrace();                // saber qual é o erro
            }
        }
        conteudo = valor;
        System.out.println("Produtor #  " + idProdutor + " colocou " + conteudo);
        disponivel = true;
        notifyAll();
    }
     public synchronized int get(int idConsumidor, int valor){
         while (disponivel == false){
             try{
                 System.out.println("Consumidor " + idConsumidor + " esperando ...");
                 wait();
             }catch (Exception e){
                 e.printStackTrace();
             }
        }
         System.out.println("Consumidor # " + idConsumidor + " consumiu: ");
         disponivel = false;
         notifyAll();
         return conteudo;
     }
}