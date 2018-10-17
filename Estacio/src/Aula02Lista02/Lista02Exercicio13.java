package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio13 {
    
    public static void main(String[] args) {
        
        double n1, n2, n3;
    
        Scanner tec = new Scanner(System.in);
    
        System.out.print("Insira o primeiro número: ");
        n1 = tec.nextDouble();
        
        System.out.print("Insira o segundo número: ");
        n2 = tec.nextDouble();
        
        System.out.print("Insira o terceiro número: ");
        n3 = tec.nextDouble();
        
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " é maior que " + n2 + " e " + n3);
        } else if (n2 > n1 && n2 > n3 ) {
            System.out.println(n2 + " é maior que " + n1 + " e " + n3);
        } else if (n3 > n1 && n3 > 2) {
            System.out.println(n3 + " é maior que " + n1 + " e " + n2);
        } else {
            System.out.println("Dois ou mais números possuem valores iguais.");
        }
        
    }
    
}
