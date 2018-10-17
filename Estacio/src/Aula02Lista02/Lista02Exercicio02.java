package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio02 {
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = tec.nextInt();
        
        if ((num % 2) == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar");
        }
        
    }
    
}
