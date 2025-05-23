/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veiculo;

/**
 *
 * @author c.marques
 */
import java.util.Scanner;
public class Veiculo {
    
    String marca;
    String modelo;
    
    public void exibirInformacoes(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);       
    }
    
    static class Carro extends Veiculo{
        int qntPortas;    
    }
    
    static class Moto extends Veiculo{
        int cilindradas;
    }
    
    

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Carro carro = new Carro();
        Moto moto = new Moto();
        int opcao;
        
        do{
        System.out.println("\n---Cadastrar veiculo---");
        System.out.println("Cadastrar carro = 1 / Cadastrar moto= 2 ");
        System.out.println("Sair = 0");
        opcao = ler.nextInt();
        ler.nextLine();
        
        switch (opcao){
            case 1:
                System.out.println("Digite a marca: ");
                carro.marca = ler.nextLine();
                
                System.out.println("Digiteo o modelo: ");
                carro.modelo = ler.nextLine();
                
                System.out.println("Digite a quantidade de portas: ");
                carro.qntPortas = ler.nextInt();
                
                break;
                
            case 2:
                System.out.println("Digite a marca: ");
                moto.marca = ler.nextLine();
                
                System.out.println("Digiteo o modelo: ");
                moto.modelo = ler.nextLine();
                
                System.out.println("Digite a quantidade de cilindradas: ");
                moto.cilindradas = ler.nextInt();             
                
                break;        
        }
        System.out.println("\n--informações carro--");
        carro.exibirInformacoes();
        System.out.println("quantidade de portas: "+carro.qntPortas);
        
        System.out.println("--informções moto--");
        moto.exibirInformacoes();
        System.out.println("quantidade de cilindradas: "+moto.cilindradas);
        
        }while (opcao != 0);
    }
}
