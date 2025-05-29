/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

/**
 *
 * @author c.marques
 */
import java.util.Scanner;

public class Animal {
    String nome;
    int idade;
    
    public void fazerSom(){
        
    }
        
    static class Cachorro extends Animal {
        
        public void fazerSom(){
            System.out.println("O cachorro late: AU!");
        }
    }
    
    static class Gato extends Animal {
        
        public void fazerSom(){
            System.out.println("O gato mia: MIAU!");
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        System.out.println("Digite o nome do gato: ");
        gato.nome = ler.nextLine();
        
        System.out.println("Digite a idade do gato: ");
        gato.idade = ler.nextInt();
        ler.nextLine();
        
        System.out.println("Digite a nome do cachorro: ");
        cachorro.nome = ler.nextLine();
        
        System.out.println("Digite a idade do cachorro: ");
        cachorro.idade = ler.nextInt();
        
        System.out.println("\nnome: "+gato.nome);
        System.out.println("Idade: "+gato.idade);
        gato.fazerSom();
        
        System.out.println("nome: "+cachorro.nome);
        System.out.println("Idade: "+cachorro.idade);
        cachorro.fazerSom();                      
        
    }
}
