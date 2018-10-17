package lista01;

import java.util.Scanner;

public class Exercicio21 {
    
    public static void main(String[] args) {
        
        int horaNormal, horaExtra;
        float valorRecebido;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o total de horas normais trabalhadas: ");
        horaNormal = tec.nextInt();
        System.out.print("Insira o total de horas extras extras: ");
        horaExtra = tec.nextInt();
        
        valorRecebido = (horaNormal * 30) + (horaExtra * ((50 * 30)/100));
        
        System.out.printf("O valor total recebido é de %.2f", valorRecebido);
        
    }
    
}