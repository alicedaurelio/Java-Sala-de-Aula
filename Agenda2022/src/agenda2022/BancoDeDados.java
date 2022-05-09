package agenda2022;
/**
 * @author Alice Daurelio Dias      4 semestre
 * @since 09/05/2022
 */

// Bibliotecas que precisam importar para utilizar o Banco de Dados
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class BancoDeDados{

private Connection connection = null;
private Statement statement = null;
private ResultSet resultset = null;
    
    public void aliceConectar(){
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
      
    public boolean aliceEstaConectado(){
        if(this.connection != null){
            return true;
        }else {
            return false;
        }     
    }
    
    public void aliceDesconectar(){
        try{
            this.connection.close();
            System.out.println("Desconectado do banco de dados com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public void aliceInserir(){
        try{
            String query = "INSERT INTO `agenda`.`contato` (`id`, `nome`, `telefone`, `email`) VALUES ('5', 'Natalia', '35202150', 'natalia@gmail.com')";
            System.out.println("query");
            this.statement.execute(query);
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public void aliceInserirAtrib(String nome, String telefone, String email){
         try{
            String query = "INSERT INTO `agenda`.`contato` (`nome`, `telefone`, `email`) VALUES ('" + nome + "' , '" + telefone + "', '" + email + "');";
            System.out.println(query);
            this.statement.execute(query);
         }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
    
    public void aliceAlterar(){
        
        try{
            String query = "UPDATE `AGENDA`.`CONTATO` SET `nome` = 'Patricia', `email` = 'patricia@gmail.com', `telefone` = '41257849'  WHERE (`id` = '5')";
            System.out.println("query");
            this.statement.execute(query);
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public void aliceAlterarAtrib(String id, String nome, String telefone, String email){
         try{
            String query = "UPDATE `AGENDA`.`CONTATO` SET `nome` = '"+nome+"', `telefone` = '"+ telefone+"', `email` = '"+ email+" WHERE `id` = "+ id +";";
            System.out.println(query);
            this.statement.execute(query);
         }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
      
    public void aliceListarAsc(){
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
     
    public void aliceListarDesc(){
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
     
    public void aliceListarAtrib(String id){
        try{
        String query = "\nSELECT * FROM agenda.contato WHERE `id` = "+ id +" ORDER BY id ASC";
        System.out.println(query);
        this.resultset = this.statement.executeQuery(query);
        while(this.resultset.next()){
            System.out.println("ID: " + this.resultset.getString("id") + " - Nome: " + this.resultset.getString("nome") + " - Telefone: " + this.resultset.getString("telefone") + " - Email: " + this.resultset.getString("email"));
        }
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
     
    public void aliceApagar(){
         try{
            String query = "DELETE FROM `AGENDA`.`CONTATO` WHERE (`id` = '5');";
            System.out.println(query);
            this.statement.execute(query);
         }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
    
    public void aliceApagarAtrib(String id){
         try{
            String query = "DELETE FROM `AGENDA`.`CONTATO` WHERE `id` = " + id + ";";
            System.out.println(query);
            this.statement.execute(query);
         }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
     }
 }
