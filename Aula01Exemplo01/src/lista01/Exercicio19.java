package lista01;

import java.util.Scanner;

public class Exercicio19 {
    
    public static void main(String[] args) {
        
        int n, dias, horas, min, seg;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de dias: ");
        n = tec.nextInt();
        
        dias = n/86400;
        horas = (n % 86400)/3600;
        min = ((n % 86400) % 3600) / 60;
        seg = ((n % 86400) % 3600) % 60;
        
        System.out.print(dias + " dia(s), " + horas + " hora(s)," + min + " minuto(s) e "+ seg+ " segundo.");
        
    }
    
}
