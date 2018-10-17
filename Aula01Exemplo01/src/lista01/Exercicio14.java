package lista01;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        
        double n1, n2, n3, n4, m;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o 1º número: ");
        n1 = tec.nextDouble();
        System.out.print("Digite o 2º número: ");
        n2 = tec.nextDouble();
        System.out.print("Digite o 3º número: ");
        n3 = tec.nextDouble();
        System.out.print("Digite o 4º número: ");
        n4 = tec.nextDouble();
        
        m = ((n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4)) / (1+2+3+4);
        
        System.out.print("Média ponderada = " + m);
        
    }
    
}
