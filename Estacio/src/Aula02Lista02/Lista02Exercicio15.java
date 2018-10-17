package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio15 {
    
    public static void main(String[] args) {
        
        double valorProd;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o valor do produto: ");
        valorProd = tec.nextDouble();
        
        if (valorProd < 20.00) {
            System.out.println("Valor da venda: " + (valorProd + ((valorProd * 45) / 100)));
        } else {
            System.out.println("Valor da venda: " + (valorProd + ((valorProd * 30) / 100)));
        }
        
    }
    
}
