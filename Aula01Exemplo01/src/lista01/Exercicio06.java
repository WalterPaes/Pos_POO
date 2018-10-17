package lista01;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        String nome;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Qual o seu nome? ");
        nome = tec.nextLine();
        
        System.out.println("O meu nome é " + nome);
    }
    
    
}
