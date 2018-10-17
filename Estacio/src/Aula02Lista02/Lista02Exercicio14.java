package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio14 {
    
    public static void main(String[] args) {
        
        double n1, n2, n3, n4, media;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira a primeira nota: ");
        n1 = tec.nextDouble();
        
        System.out.print("Insira a segunda nota: ");
        n2 = tec.nextDouble();
        
        System.out.print("Insira a terceira nota: ");
        n3 = tec.nextDouble();
        
        System.out.print("Insira a quarta nota: ");
        n4 = tec.nextDouble();
        
        media = (n1 + n2 + n3 + n4)/4;
        
        if (media >= 7) {
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado");
        }
        
    }
    
}
