package lista01;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        
        String nome1, nome2;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o primeiro nome: ");
        nome1 = tec.nextLine();
        System.out.print("Digite o segundo nome: ");
        nome2 = tec.nextLine();
        
        System.out.println("Primeiro Nome: " + nome1);
        System.out.println("Segundo Nome: " + nome2);
        
    }
    
}
