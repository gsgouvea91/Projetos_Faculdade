package bin;

import resources.ConexaoBancoDeDados;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ConexaoBancoDeDados conexao = new ConexaoBancoDeDados();
       conexao.inserir("helio", "Silva", 30);
       conexao.prepareSelect();
    }
    
}
