package Aula02Exemplo01;

import java.util.Scanner;

public class DigiteNomesRepeticao {
    
    public static void main(String[] args) {
        
        String nome;
        
        Scanner tec = new Scanner(System.in);
        
//        while (!nome.equalsIgnoreCase("fim")) {
//            
//            System.out.print("Digite um nome ou 'fim' para parar: ");
//            nome = tec.nextLine();
//            
//        }

        do {
            System.out.print("Digite um nome ou 'fim' para parar: ");
            nome = tec.nextLine();
        } while (!nome.equalsIgnoreCase("fim"));

    }
    
}
