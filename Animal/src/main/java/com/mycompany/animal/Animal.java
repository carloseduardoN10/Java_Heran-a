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
        nomeGato
        
    }
}
