package lista01;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        String msg1, msg2;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite a primeira mensagem: ");
        msg1 = tec.nextLine();
        
        System.out.print("Digite a segunda mensagem: ");
        msg2 = tec.nextLine();
        
        System.out.println(msg1 + "\n" + msg2);
        
        
    }
    
}
