package lista01;

import java.util.Scanner;

public class Exercicio30 {
    
    public static void main(String[] args) {
        
        String nome;
        double peso, altura, imc;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o nome: ");
        nome = tec.nextLine();
        
        System.out.print("Insira a altura: ");
        altura = tec.nextDouble();
        
        System.out.print("Insira o peso: ");
        peso = tec.nextDouble();
        
        imc = peso / (Math.pow(altura, 2));
        
        System.out.print(nome + "possui o IMC de " + imc);
        
    }
    
}
