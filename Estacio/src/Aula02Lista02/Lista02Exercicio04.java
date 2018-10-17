package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio04 {
    
    public static void main(String[] args) {
        
        double num;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = tec.nextDouble();
        
        if (num > 0) {
            System.out.println("Raiz Quadrada de " + num + " = " + (Math.sqrt(num)));
        } else if(num < 0) {
            System.out.println("Quadrado de " + num + " = " + (Math.pow(num, 2)));
        } else {
            System.out.println("Número Inválido!");
        }
        
    }
    
}
