package lista01;

import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args){
        
        int n;
        float nd;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o número de lados: ");
        n = tec.nextInt();
        
        nd = n * (n-3)/2;
        
        System.out.print("Número de diagonais diferentes: " + nd);
        
    }
    
}
