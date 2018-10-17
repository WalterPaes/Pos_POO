package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio21 {
    
    public static void main(String[] args) {
        
        String nome;
        double salario;
        int idade;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        nome = tec.nextLine();
        
        System.out.print("Insira seu salário: ");
        salario = tec.nextDouble();
        
        System.out.print("Insira sua idade: ");
        idade = tec.nextInt();
        
        if (salario < 1000 || idade > 45) {
            System.out.println(nome + " contemplado com um aumento.");
        } else {
            System.out.println("Não contemplado.");
        }
        
    }
    
}
