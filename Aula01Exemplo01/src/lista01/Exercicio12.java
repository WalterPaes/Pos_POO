package lista01;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        int dividendo, divisor, quociente, resto;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o dividendo: ");
        dividendo = tec.nextInt();
        System.out.print("Digite o divisor: ");
        divisor = tec.nextInt();
        
        quociente = dividendo/divisor;
        resto = dividendo % divisor;
        
        System.out.println(
                "Dividendo: " + dividendo + "\n" +
                "Divisor: " + divisor + "\n" +
                "Quociente: " + quociente + "\n" +
                "Resto: " + resto
        );
        
    }
    
}
