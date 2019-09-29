/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import classes.Pessoa;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class GBDConn {
    private Connection conexao;
    private final String URLDB = "jdbc:mysql://localhost:3306/formulario?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private final String usuario = "root";
    private final String senha = "";
    
    public GBDConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(URLDB,usuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    public void inserir(Pessoa ps){
        
        Statement inserir;
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        
        try{
        
           stmt = conexao.prepareStatement("INSERT INTO tb_pessoa(ps_nome,ps_dtnasc,ps_fres,ps_fcel) VALUES(?,?,?,?)");
           stmt.setString(1,ps.getNome());
           stmt.setString(2,ps.getDataNasc());
           stmt.setString(3,ps.getTelRes());
           stmt.setString(4,ps.getTelCel());
           
           stmt1 = conexao.prepareStatement("INSERT INTO tb_endereco(en_rua,en_bairro,en_cep,en_cidade,en_uf) VALUES(?,?,?,?,?)");
           stmt1.setString(1,ps.getEndereco().getEndereco());
           stmt1.setString(2,ps.getEndereco().getBairro());
           stmt1.setString(3,ps.getEndereco().getCep());
           stmt1.setString(4,ps.getEndereco().getCidade());
           stmt1.setString(5,ps.getEndereco().getUf());
           
           stmt2 = conexao.prepareStatement("INSERT INTO tb_rg(rg_numero,rg_npai,rg_nmae,rg_dtexp,rg_oem) VALUES(?,?,?,?,?)");
           stmt2.setDouble(1,ps.getRg().getNumero());
           stmt2.setString(2,ps.getRg().getNomePai());
           stmt2.setString(3,ps.getRg().getNomeMae());
           stmt2.setString(4,ps.getRg().getDataEXP());
           stmt2.setString(5,ps.getRg().getOrgEmissor());
          
           stmt.executeUpdate();
           stmt1.executeUpdate();
           stmt2.executeUpdate();
           JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no Insert no Banco!"+ex);
        }
        
    }
}
