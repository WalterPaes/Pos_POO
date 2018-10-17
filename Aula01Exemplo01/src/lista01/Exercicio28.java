package lista01;

import java.util.Scanner;

public class Exercicio28 {
    
    public static void main(String[] args) {
        
        double s, v, t;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o valor da velocidade média em km/h: ");
        v = tec.nextDouble();
        
        System.out.print("Digite o valor da distância percorrida em km: ");
        s = tec.nextDouble();
        
        t = (s/v) * 3600;
        
        System.out.print("Tempo percorrido em segundos = " + t);
        
    }
    
}
