package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio16 {
    
    public static void main(String[] args) {
        
        int idade;
        
        Scanner tec =  new Scanner(System.in);
        
        System.out.print("Insira a idade do nadador: ");
        idade = tec.nextInt();
        
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria Infantil A");
        } else if (idade > 7 && idade <= 10) {
            System.out.println("Categoria Infantil B");
        } else if (idade > 10 && idade <= 13) {
            System.out.println("Categoria Juvenil A");
        } else if (idade > 13 && idade <= 17) {
            System.out.println("Categoria Juvenil B");
        } else if (idade > 17) {
            System.out.println("Categoria Sênior");
        } else {
            System.out.println("Ainda não possui categoria");
        }
        
    }
    
}
