
package agenda2022;

// Bibliotecas que precisam importar para utilizar o Banco de Dados
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class BancoDeDados{

private Connection connection = null;
private Statement statement = null;
private ResultSet resultset = null;
    
    public void conectar(){
        String servidor = "jdbc:mysql://localhost:3306/agenda";
        String usuario = "root";
        String senha = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            this.connection = DriverManager.getConnection(servidor,usuario,senha);
            this.statement = this.connection.createStatement();
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
      
    public boolean estaConectado(){
        if(this.connection != null){
            return true;
        }else {
            return false;
        }     
    }
    
    public void desconectar(){
        try{
            this.connection.close();
            System.out.println("Desconectado do banco de dados com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public void inserir(){
        
        try{
            String query = "INSERT INTO `agenda`.`contato` (`id`, `nome`, `telefone`, `email`) VALUES ('5', 'Natalia', '35202150', 'natalia@gmail.com')";
            System.out.println("query");
            this.statement.execute(query);
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public void alterar(){
        
        try{
            String query = "UPDATE `AGENDA`.`CONTATO` SET `nome` = 'Patricia', `email` = 'patricia@gmail.com', `telefone` = '41257849'  WHERE (`id` = '5')";
            System.out.println("query");
            this.statement.execute(query);
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
      
    public void listarAsc(){
        try{
         String query = "\nSELECT * FROM agenda.contato ORDER BY id ASC;";    //   Crescente - ASC Decrescente - DESC
        System.out.println(query);
        this.resultset = this.statement.executeQuery(query);
        while(this.resultset.next()){
            System.out.println("ID: " + this.resultset.getString("id") + " - Nome: " + this.resultset.getString("nome") + " - Telefone: " + this.resultset.getString("telefone") + " - Email: " + this.resultset.getString("email"));
        }
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
     
    public void listarDesc(){
        try{
         String query = "\nSELECT * FROM agenda.contato ORDER BY id DESC;";    //   Crescente - ASC Decrescente - DESC
        System.out.println(query);
        this.resultset = this.statement.executeQuery(query);
        while(this.resultset.next()){
            System.out.println("ID: " + this.resultset.getString("id") + " - Nome: " + this.resultset.getString("nome") + " - Telefone: " + this.resultset.getString("telefone") + " - Email: " + this.resultset.getString("email"));
        }
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
     
    public void inserirAtrib(String nome, String telefone){
         try{
            String query = "INSERT INTO `agenda`.`contato` (`nome`, `telefone`) VALUES ('" + nome + "' , '" + telefone + "');";
            System.out.println(query);
            this.statement.execute(query);
         }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
     
    public void apagar(){
         try{
            String query = "DELETE FROM `AGENDA`.`CONTATO` WHERE (`id` = '5');";
            System.out.println(query);
            this.statement.execute(query);
         }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
    
    public void apagarAtrib(String id){
         try{
            String query = "DELETE FROM `AGENDA`.`CONTATO` WHERE `id` = " + id + ";";
            System.out.println(query);
            this.statement.execute(query);
         }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
 }
