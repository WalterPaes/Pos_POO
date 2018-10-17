package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio24 {
    
    public static void main(String[] args) {
        
        int c = 0, idades[] = new int[5];
        String nomes[] = new String[5];
        
        Scanner tec = new Scanner(System.in);
        
        do {
            
            System.out.print("Digite o nome: ");
            nomes[c] = tec.nextLine();
            
            System.out.print("Digite a idade: ");
            idades[c] = Integer.parseInt(tec.nextLine());
            
            c++;
            
        } while (c < 5);
        
        for (int i = 0; i < 5; i++) {
            
            if (idades[i] > 18) {
                System.out.print(nomes[i] + "\n");
            }
            
        }
        
    }
    
}
