/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.database;

import com.gtranslate.Language;
import com.gtranslate.Translator;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javafx.scene.transform.Transform.translate;
/**
 *
 * @author Gustavo
 */
public class Banco {
    
    private Connection conn = null;
    private  String url= "jdbc:sqlite:Frases.db";
    private final Translator ts = Translator.getInstance();
    private final Language ln = Language.getInstance();
    private int sequence = 0;
    private Connection connect() {  
        // SQLite connection string  
        try {  
            conn = DriverManager.getConnection(url);
             if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    } 
    
    public static void createNewDatabase(String filename){
    
    
    
    }

    public void inserir(String frasePT, String fraseEN){
        
      String sql1 = "INSERT INTO pt_frases(pt_frase)VALUES(?)";
      String sql2 = "INSERT INTO en_frase(en_text)VALUES(?)";
            try{  
                 Connection conn = this.connect();  
                 PreparedStatement pstmt1 = conn.prepareStatement(sql1);  
                 pstmt1.setString(1,frasePT); 

                 PreparedStatement pstmt2 = conn.prepareStatement(sql2);  
                 pstmt2.setString(1,fraseEN);

                 pstmt1.executeUpdate();  
                 pstmt2.executeUpdate(); 
                 System.out.println("REGISTRO INSERIDO COM SUCESSO");
                 conn.close();
             } catch (SQLException e) {  
                 System.out.println(e.getMessage());  
             }

    }
    
    public String localizarTUDO(){
     
      String sql1 = "SELECT id_pt, pt_frase FROM pt_frases";
      String sql2 = "SELECT id_en, en_text FROM en_frase";

        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);  
            PreparedStatement pstmt2 = conn.prepareStatement(sql2); 
            
            ResultSet rs1 = pstmt1.executeQuery();
            ResultSet rs2 = pstmt2.executeQuery();
            
            while(rs1.next() && rs2.next()){
                //System.out.println(rs1.getInt("id_pt")+"\t"+ rs1.getString("pt_frase")+"\t"+ rs2.getInt("id_en")+ "\t"+ rs2.getString("en_text")+"\t");
                //System.out.println(rs2.getInt("id_en")+ "\t"+ rs2.getString("en_text")+"\t");
                return rs1.getString("pt_frase");
            }
 
            System.out.println("PROCURA COMPLETA");
            conn.close();
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        return null;
    }
    
    public void atualizarContagem(){ 
      this.sequence = 0;
      String sql1 = "SELECT id_pt, pt_frase FROM pt_frases";
      String sql2 = "SELECT id_en, en_text FROM en_frase";
      
      String sql3 = "UPDATE SQLITE_SEQUENCE SET SEQ=NEWSQUENCE WHERE NAME= ?";
        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);  
            PreparedStatement pstmt2 = conn.prepareStatement(sql2); 
            
            ResultSet rs1 = pstmt1.executeQuery();
            ResultSet rs2 = pstmt2.executeQuery();
            
            while(rs1.next() && rs2.next()){
                this.sequence = this.sequence + 1;
            }
            System.out.println(this.sequence);
            conn.close();
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
    }
    
    public void localizarESP(int id){
      String sql1 = "SELECT id_pt, pt_frase FROM pt_frases";
      String sql2 = "SELECT id_en, en_text FROM en_frase";

        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);  
            PreparedStatement pstmt2 = conn.prepareStatement(sql2); 
            
            ResultSet rs1 = pstmt1.executeQuery();
            ResultSet rs2 = pstmt2.executeQuery();
            
            while(rs1.next() && rs2.next()){
                if(rs1.getInt("id_pt") == id && rs2.getInt("id_en")== id){
                    System.out.println(rs1.getInt("id_pt")+"\t"+ rs1.getString("pt_frase")+"\t"+ rs2.getInt("id_en")+ "\t"+ rs2.getString("en_text")+"\t");
                    break;
                    //System.out.println(rs2.getInt("id_en")+ "\t"+ rs2.getString("en_text")+"\t");
                }
            }
            conn.close();
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
    }
    
    public void deletarFrase(int id){
        
      String sql1 = "DELETE FROM pt_frases where id_pt = ?";
      String sql2 = "DELETE FROM en_frase where id_en = ?";
      
        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);  
            PreparedStatement pstmt2 = conn.prepareStatement(sql2); 
            
            pstmt1.setInt(1, id);
            pstmt2.setInt(1, id);
            
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            conn.close();
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
    }
    
    
        
}

