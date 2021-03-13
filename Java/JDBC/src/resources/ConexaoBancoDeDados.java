package resources;

import java.sql.*;

public class ConexaoBancoDeDados {
    
    private Connection conexao;
    private final String URLDB = "jdbc:mysql://localhost:3311/mysql?zeroDateTimeBehavior=convertToNull";
    private final String usuario = "root";
    private final String senha = "root";
    
    public ConexaoBancoDeDados(){
    
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conexao = DriverManager.getConnection(URLDB,usuario,senha);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
    public void inserir(String nome, String sobrenome,int idade){
        Statement inserir;
         
        try{
          inserir = conexao.createStatement();
          inserir.execute("INSERT INTO cliente(nome,sobrenome,idade)VALUES ("+nome+","+sobrenome+","+idade+")");
        }catch(SQLException ex){
            
        }
    }
    
    public void update(String nome, String sobrenome,int idade){
        Statement comando;
        
        try{
           comando = conexao.createStatement();
           comando.execute("INSERT INTO cliente(nome,sobrenome,idade)VALUES ("+nome+","+sobrenome+","+idade+")");
        }catch(SQLException ex){
           
        }
        
    }
    
    public void delete(int id){
        Statement comando;
        
        try{
           comando = conexao.createStatement();
           comando.execute("delete from cliente WHERE idCliente="+id+")");
        }catch(SQLException ex){
           
        }
        
    }
    
     public void prepareSelect(){
        try{
           PreparedStatement psSelect = this.conexao.prepareStatement("Select * from cliente where idCliente=?");
           psSelect.setString(1,"1");
           ResultSet res = psSelect.executeQuery();
           while(res.next()){
               System.out.print(res.getString("nome"));
           }
        }catch(SQLException ex){
            
        }
        
    }
        
    
    
    
}
