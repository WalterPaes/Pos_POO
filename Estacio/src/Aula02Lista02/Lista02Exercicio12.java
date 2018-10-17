package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio12 {
    
    public static void main(String[] args) {
        
        double n1, n2, qn2;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        n1 = tec.nextDouble();
        System.out.print("Insira o segundo número: ");
        n2 = tec.nextDouble();
        
        qn2 = Math.pow(n2, 2);
        
        if (n1 > qn2) {
            System.out.println(n1 + " maior que "+ n2 + " ao quadrado.");
        } else if(n1 < qn2) {
            System.out.println(n1 + " menor que " + n2 + " ao quadrado.");
        } else {
            System.out.println(n1 + " igual a " + n2 + " ao quadrado.");
        }
        
    }
    
}

