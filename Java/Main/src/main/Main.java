/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
public class Main {   
    public static void main(String args[]) {
            Scanner menu = new Scanner (System.in);
            String search;
            Hashtable TS = new Hashtable();
            TS.put("break","Comando para forçar a saída imediata dos comandos switch, for, while, e , do…while.");
            TS.put("case","Utilizado dentro do comando switch para selecionar uma constante.");
            TS.put("for","Estrutura de repetição que utiliza condições e contador.");
            TS.put("if","Comando condicional que altera o fluxo do programa de acordo com uma condição que pode ser verdadeira ou falsa.");
            TS.put("asm","Indica instruções em assembly");
            while (true) {            
            System.out.print("\n\n");    
            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Pesquisa          |\n");
            System.out.print("| Opção 2 - Leitura de Arquivo|\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");
            int opcao = menu.nextInt();
            if (opcao == 3) {
                System.out.print("\nAté logo!");
                menu.close(); 
            }
            switch (opcao) {
            case 1:
                System.out.print("\n\n");
                System.out.print("Pesquise a chave: ");
                search = menu.next();                    
                if (TS.containsKey(search) == true){
                    System.out.println(search+": "+TS.get(search).toString());
                } else {
                    System.out.println("Termo não encontrado");
                }
                break;
            case 2:
               System.out.printf("Informe o nome de arquivo texto:\n");
               String nome = menu.next();  
               System.out.printf("\nConteúdo do arquivo texto:\n");
                    try {
                      FileReader arq = new FileReader("C:\\"+nome+".txt");
                      BufferedReader lerArq = new BufferedReader(arq);
                      String linha = lerArq.readLine();
                      while (linha != null) {                        
                        if (TS.containsKey(linha) == true){       
                            System.out.print(linha+ ":"+ TS.get(linha).toString());
                            System.out.println();
                            linha = lerArq.readLine();
                        } else {
                            linha = lerArq.readLine();
                        }
                      }
                      arq.close();
                    } catch (IOException e) {
                        System.err.printf("Erro na abertura do arquivo: %s.\n",
                        e.getMessage());
                    }
               break;    
            default:
                System.out.print("\nOpção Inválida!");
                break;
            }
        }
    }      
}
