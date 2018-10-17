package lista01;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        double n1, n2, soma, sub, multi, div;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o 1º número: ");
        n1 = Double.parseDouble(tec.nextLine());
        System.out.print("Insira o 2º número: ");
        n2 = Double.parseDouble(tec.nextLine());
        
        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1/n2;
        
        System.out.print(
                n1 + " + " + n2 + " = " + soma + "\n" +
                n1 + " - " + n2 + " = " + sub + "\n" +
                n1 + " x " + n2 + " = " + multi + "\n" +
                n1 + " / " + n2 + " = " + div + "\n" 
        );
        
    }
    
}
