package lista01;

import java.util.Scanner;

public class Exercicio27 {
    
    public static void main(String[] args) {
        
        double raio, area;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o valor do raio: ");
        raio = tec.nextDouble();
        
        area = Math.PI * (Math.pow(raio, 2));
        
        System.out.printf("Área da circunferência = %.2f", area);
        
    }
    
}
