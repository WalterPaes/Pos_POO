package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio07 {
    
    public static void main(String[] args) {
        
        double num;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = tec.nextDouble();
        
        if (num >= 50 && num <= 100) {
            System.out.println("O número " + num + " está compreendido entre 50 e 100.");
        } else {
            System.out.println("O número " + num + " nâo está compreendido entre 50 e 100.");
        }
        
    }
    
}
