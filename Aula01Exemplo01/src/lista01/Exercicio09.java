package lista01;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        
        double n1, n2, soma, sub, multi, div;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        n1 = tec.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = tec.nextDouble();
        
        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        
        System.out.print(
                n1 + " + " + n2 + " = " + soma + "\n" +
                n1 + " - " + n2 + " = " + sub + "\n" +
                n1 + " x " + n2 + " = " + multi + "\n" +
                n1 + " / " + n2 + " = " + div + "\n" 
        );
        
    }
    
}
