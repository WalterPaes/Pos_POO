package lista01;

import java.util.Scanner;

public class Exercicio23 {
    
    public static void main(String[] args) {
        
        float angulo01, angulo02, angulo03;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o valor do primeiro ângulo: ");
        angulo01 = tec.nextFloat();
        System.out.print("Insira o valor do segundo ângulo: ");
        angulo02 = tec.nextFloat();
        
        angulo03 = 180 - (angulo01 + angulo02);
        
        System.out.printf("O valor do terceiro ângulo interno de um triângulo é igual a %.2f", angulo03);
        
    }
    
}
