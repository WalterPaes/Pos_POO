package Aula02Exemplo01;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7: ");
        num = tec.nextInt();
        
        switch (num){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número Inválido");
        }
        
        
    }
    
}
