package lista01;

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        double n, res;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira um número:");
        n = tec.nextDouble();
        
        res = n/5;
        
        System.out.println("A quinta parte de "+ n +" é igual a "+ res);
        
    }
    
}
