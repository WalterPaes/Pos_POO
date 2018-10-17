package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio23 {
    
    public static void main(String[] args) {
        
        double ax, ay, bx, by, distancia;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o valor da coordenada X de A: ");
        ax = tec.nextDouble();
        System.out.print("Insira o valor da coordenada Y de A: ");
        ay = tec.nextDouble();
         
        System.out.print("Insira o valor da coordenada X de B: ");
        bx = tec.nextDouble();
        System.out.print("Insira o valor da coordenada Y de B: ");
        by = tec.nextDouble();
        
        distancia = Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2));
        
        System.out.println("Distância igual a " + distancia);
    }
    
}
