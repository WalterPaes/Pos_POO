package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio11 {
    
    public static void main(String[] args) {
        
        double n1, n2;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        n1 = tec.nextDouble();
        System.out.print("Insira o segundo número: ");
        n2 = tec.nextDouble();
        
        if (n1 > n2) {
            System.out.println(n1 + " maior que "+ n2);
        } else if(n1 < n2) {
            System.out.println(n2 + " maior que " + n1);
        } else {
            System.out.println("Os números são iguais.");
        }
        
    }
    
}
