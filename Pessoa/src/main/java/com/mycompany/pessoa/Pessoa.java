/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author c.marques
 */
import java.util.Scanner;
public class Pessoa {
    String nome;
    int idade;
    
    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("idade: "+idade);
    }
    
    static class Funcionario extends Pessoa{
        Double salario;       
    }
    
    static class Aluno extends Pessoa{
        float nota;       
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Funcionario funcionario = new Funcionario();
        Aluno aluno = new Aluno();
              
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        
        System.out.println("-- 1-Funcionario ou 2-Aluno --");
        int opcao = ler.nextInt();
        
        if (opcao==1){
            funcionario.nome = nome;
            funcionario.idade = idade;
            
            System.out.println("Digite o seu salario: ");
            funcionario.salario = ler.nextDouble();     
            
            System.out.println("--Dados funcionario--");
            funcionario.mostrarDados();
            System.out.println("Salario: "+funcionario.salario);        
                  
        }else if (opcao==2) {
            aluno.nome = nome;
            aluno.idade = idade;
            System.out.println("Digite sua nota: ");
            aluno.nota = ler.nextFloat();
            
            System.out.println("--Dados aluno--");
            aluno.mostrarDados();
            System.out.println("Nota: "+aluno.nota);
        }
        
        
        
    }
}
