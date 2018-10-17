package lista01;

import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String[] args) {
        
        double b, h, a;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o valor da base do triangulo: ");
        b = tec.nextDouble();
        System.out.print("Digite o valor da altura do triangulo: ");
        h = tec.nextDouble();
        
        a = (b * h)/2;
        
        System.out.print("A área de um triangulo é igual a: " + a);
        
    }
    
}
