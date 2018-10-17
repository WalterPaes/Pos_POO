package lista01;

import java.util.Scanner;

public class Exercicio26 {
    
    public static void main(String[] args) {
        
        String nome;
        double salarioAtual, salarioNovo, percentAumento;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Insira o nome do funcionário: ");
        nome = tec.nextLine();
        
        System.out.print("Insira o valor do salário: ");
        salarioAtual = tec.nextDouble();
        
        System.out.print("Insira o percentual de aumento salarial: ");
        percentAumento = tec.nextDouble();
        
        salarioNovo = ((salarioAtual * percentAumento)/100 + salarioAtual);
        
        System.out.printf("Nome: " + nome + "\nSalário Atual: " + salarioAtual + "\nNovo Salário: "+ salarioNovo);
        
    }
    
}
