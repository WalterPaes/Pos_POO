package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio09 {
    
    public static void main(String[] args) {
        
        String sigla;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira a sigla do seu estado de nascimento: ");
        sigla = tec.nextLine();
        sigla = sigla.toUpperCase();
        
        switch (sigla) {
            case "SP":
                System.out.println("Você nasceu em São Paulo.");
                break;
            case "PA":
                System.out.println("Você nasceu no Pará.");
                break;
            case "RJ":
                System.out.println("Você nasceu no Rio de Janeiro.");
                break;
            default:
                System.out.println("Outros estados.");
        }
        
    }
    
}
