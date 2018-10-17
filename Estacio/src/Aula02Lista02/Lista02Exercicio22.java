package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio22 {
    
    public static void main(String[] args) {
        
        int x, y;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        x = tec.nextInt();
        
        System.out.print("Insira o segundo número: ");
        y = tec.nextInt();
        
        if ((x%y) == 0) {
            System.out.println(x + " é divisível por " + y);
        } else {
            System.out.println(x + " não é divisível por " + y);
        }
        
    }
    
}
