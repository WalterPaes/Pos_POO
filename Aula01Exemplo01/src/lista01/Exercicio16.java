package lista01;

import java.util.Scanner;

public class Exercicio16 {
    
    public static void main(String[] args) {
        
        int n, ano, mes, dia;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o número total de dias: ");
        n = tec.nextInt();
        
        ano = n/365;
        mes = (n % 365)/30;
        dia = ((n % 365) % 30);
        
        System.out.print(ano + " ano(s), "+ mes +" mes(es) " + dia + " dia(s)");
        
    }
    
}
