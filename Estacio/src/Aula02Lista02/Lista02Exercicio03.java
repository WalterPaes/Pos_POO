package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio03 {
    
    public static void main(String[] args) {
        
        double num;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = tec.nextDouble();
        
        if (num > 0) {
            System.out.println("Número Positivo");
        } else if (num < 0) {
            System.out.println("Número Negativo");
        } else {
            System.out.println("Número Nulo");
        }
        
    }
    
}
