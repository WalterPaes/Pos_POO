package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio06 {
    
    public static void main(String[] args) {
        
        double salario, prestacao, percent;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o salário bruto: ");
        salario = tec.nextDouble();
        
        System.out.print("Insira o valor da prestação: ");
        prestacao = tec.nextDouble();
        
        percent = (salario * 30)/100;
        
        if (prestacao > percent) {
            System.out.println("Empréstimo não pode ser concedido.");
        } else {
            System.out.println("Empréstimo pode ser concedido.");
        }
        
    }
    
}
