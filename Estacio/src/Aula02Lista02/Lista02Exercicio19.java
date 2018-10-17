package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio19 {
    
    public static void main(String[] args) {
        
        String nome1, nome2;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        nome1 = tec.nextLine();
        
        System.out.print("Digite o segundo número: ");
        nome2 = tec.nextLine();
        
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println(nome1 + " igual a " + nome2);
        } else {
            System.out.println(nome1 + " diferente de " + nome2);
        }
        
    }
    
}
