package lista01;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        String nome;
        int idade;
        double altura;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Qual seu nome? ");
        nome = tec.nextLine();
        System.out.print("Qual sua idade? ");
        idade = tec.nextInt();
        System.out.print("Qual sua altura? ");
        altura = tec.nextDouble();
        
        System.out.println("Nome: " + nome + "\nIdade: "+ idade +"\nAltura: "+ altura);
        
    }
    
}
