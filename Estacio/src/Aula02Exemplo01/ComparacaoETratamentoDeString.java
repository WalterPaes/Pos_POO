package Aula02Exemplo01;

import java.util.Scanner;

public class ComparacaoETratamentoDeString {
    
    public static void main(String[] args) {
        
        String nome1, nome2 = "Walter";
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite um nome: ");
        nome1 = tec.nextLine();
        
        nome1 = nome1.toUpperCase();        // Transforma todas para maisculas
        nome2 = nome2.toUpperCase();
        nome1 = nome1.trim();               // Retira os espaços
        nome1 = nome1.replace("  ", " ");   // Realoca 
        
        if (nome1.equals(nome2)) {
            System.out.println("São Iguais");
        } else {
            System.out.println("São diferentes");
        }
        
        
    }
    
}
