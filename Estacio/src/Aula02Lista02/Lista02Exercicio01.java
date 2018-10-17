package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio01 {

    public static void main(String[] args){
        
        double e, result;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        e = tec.nextInt();
        
        if (e > 10) {
            System.out.print("Dobro de " + e + " = " + (e*2));
        } else {
            System.out.print("Metade de " + e + " = " + (e/2));
        }
        
    }
    
}
