/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class No {
    int valor;
    No nd_left;
    No nd_right;
    int maior;
    
    public static void main(String[] args) {
        inserir(1);
        inserir(20);
        inserir(52);
        inserir(11);
    }
    
    public static No raiz;
    public No(int valor) {
        this.valor = valor;
    }
    
    public static void preordem(No node) {
        if (node != null) {
            System.out.print(node.valor + ", ");
            preordem(node.nd_left);
            preordem(node.nd_right);
        }
    }
    public static void posordem(No node) {
        if (node != null) {
            posordem(node.nd_left);
            posordem(node.nd_right);
            System.out.print(node.valor + ", ");
        }
    }
    public static void ordem(No node) {
        if (node != null) {
            ordem(node.nd_left);
            System.out.print(node.valor + ", ");
            ordem(node.nd_right);
        }
    }

    public static void inserir(int valor) {
        inserir(raiz, valor);
    }
    public static void inserir(No node, int valor) {
        if (node == null) {
            System.out.println("Raiz " + valor);
            raiz = new No(valor);
        } else {
            if (valor < node.valor) {
                if (node.nd_left != null) {
                    inserir(node.nd_left, valor);
                } else {
                    System.out.println("Inserindo " + valor + " a esquerda de " + node.valor);
                    node.nd_left = new No(valor);
                }
            } else {
                if (node.nd_right != null) {
                    inserir(node.nd_right, valor);
                } else {
                    System.out.println("Inserindo " + valor + " a direita de " + node.valor);
                    node.nd_right = new No(valor);
                }
            }
        }
    }
}