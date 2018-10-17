package lista01;

import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        
        double b, h, p, a, d;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o valor da base(b) do retângulo: ");
        b = tec.nextDouble();
        System.out.print("Digite o valor da altura(h) do retângulo: ");
        h = tec.nextDouble();
        
        d = Math.sqrt((Math.pow(b, 2) + Math.pow(h, 2)));
        
        System.out.println(
                "Base: " + b + "\n" +
                "Altura: " + h + "\n" +
                "Área do retângulo: " + (b*h) + "\n" +
                "Perímetro: " + (2*(b+h)) + "\n" +
                "Diagonal: " + d
        );
        
    }
    
}
