package org.com.bin;
import org.com.database.Banco;
import java.util.Scanner;
import org.com.tradutor.Tradutor;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        Banco b = new Banco();
//        b.inserir("Eu vou caminhar no parque hoje", "I am going to a walk in the park today");
//        b.localizarTUDO();
//        System.out.println("\n");
//        b.localizarESP(2);
//        System.out.println("\n");
//        b.atualizarContagem();
//        b.deletarFrase(2);
//        System.out.println("\n");
//        b.localizarTUDO();
        Tradutor tr = new Tradutor();
        Scanner sc = new Scanner(System.in,"ISO-8859-1");
        String pt,en;
        boolean res = false;
          
        while(res != true){      
            try{
                System.out.println("\n");
                System.out.println("FRASE PT: ");
                pt = sc.nextLine();
                System.out.println("FRASE EN: ");
                en = sc.nextLine();
                res = tr.validFrases(en,pt);
                System.out.println(res);
            }catch(Exception e){
                System.out.println("ENTRADA INVÁLIDA");
            } 
        }
    }
   
}
