package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio18 {
    
    public static void main(String[] args) {
        
        double n1, n2;
        String op;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        n1 = Double.parseDouble(tec.nextLine());
        
        System.out.print("Insira o segundo número: ");
        n2 = Double.parseDouble(tec.nextLine());
        
        System.out.print("Insira o símbolo da operação desejada (+ Adição, - Subtração, * Multiplicação, / Divisão): ");
        op = tec.nextLine();
        
        switch (op) {
            case "+":
                System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
                break;
            case "-":
                System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
                break;
            case "*":
                System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
                break;
            case "/":
                System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
                break;
            default:
                System.out.println("Operação inválida");
        }
        
    }
    
}
