/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoDB mongo = new MongoDB();
        //mongo.InserirDocumentos("Joao Carlin", "000.000.000-00", "Alunos");
        mongo.AlterarDocumento("Carlos", "Miguel", "testeJava");
        //mongo.removerAluno("Carlos", "testejava");

    }
    
}
