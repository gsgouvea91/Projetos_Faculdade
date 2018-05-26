package aula4;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
    String n1;
    String dn;
    int rg;
    String cpf1;
    
    Scanner sc1 = new Scanner(System.in);
    Pessoa p1 = new Pessoa ();
    
   
    System.out.print("Digite o Nome: ");
    n1 = sc1.nextLine();
    p1.setNome(n1);
    
    System.out.print("Digite a data de nascimento: ");
    dn = sc1.nextLine();
    p1.setDataNasc(dn);
    
    System.out.print("Digite o RG: ");
    rg = sc1.nextInt();
    p1.setRg(rg);
      
    sc1 = new Scanner(System.in);  //Cria nova instancia para limpar o buffer e evitar dar pau
 
    System.out.print("Digite o CPF: ");
    cpf1 = sc1.nextLine();
    p1.setCpf(cpf1);
    
    System.out.println("");    
    System.out.println("Nome:"+p1.getNome());
    System.out.println("Nasceu em: "+p1.getDataNasc());
    System.out.println("RG:"+ p1.getRg());
    System.out.println("CPF:"+ p1.getCpf());
    
    
    }
    
}
