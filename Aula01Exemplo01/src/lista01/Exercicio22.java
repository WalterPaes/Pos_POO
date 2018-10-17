package lista01;

import java.util.Scanner;

public class Exercicio22 {
    
    public static void main(String[] args) {
        
        double tempCelsius, tempFahreinheit;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira a temperatura em Celsius(Cº): ");
        tempCelsius = tec.nextDouble();
        
        tempFahreinheit = 1.8 * tempCelsius + 32;
        
        System.out.printf(tempCelsius + "Cº em na escala Fahreinheit é igual a %.2f", tempFahreinheit);
        
    }
    
}