package lista01;

import java.util.Scanner;

public class Exercicio18 {
    
    public static void main(String[] args) {
        
        String nome;
        double valor, percDesc, valorDesconto, total;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o nome do produto: ");
        nome = tec.nextLine();
        System.out.print("Insira o valor do produto: ");
        valor = tec.nextDouble();
        System.out.print("Insira o percentual de desconto: ");
        percDesc = tec.nextDouble();
        
        valorDesconto = (valor * percDesc)/100;
        total = valor - valorDesconto;
        
        System.out.print("O produto " + nome + " que custa R$"+ valor + " com "+ percDesc+"% de desconto custará R$"+ total);
        
        
    }
    
}
