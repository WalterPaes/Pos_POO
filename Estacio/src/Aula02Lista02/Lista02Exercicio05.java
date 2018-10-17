package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio05 {
    
    public static void main(String[] args) {
        
        double num;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = tec.nextDouble();
        
        if ((num % 5) == 0) {
            System.out.println(num + " é divisível por 5.");
        } else {
            System.out.println(num + " não é divisível por 5.");
        }
        
    }
    
}
