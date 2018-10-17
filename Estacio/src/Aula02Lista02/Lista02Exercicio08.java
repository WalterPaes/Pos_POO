package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio08 {
    
    public static void main(String[] args) {
        
        double num;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = tec.nextDouble();
        
        if (num == 30) {
            System.out.println(num + " é igual que 30.");
        } else if(num > 30) {
            System.out.println(num + " é maior que 30.");
        } else {
            System.out.println(num + " é menor que 30.");
        }
        
    }
    
}
