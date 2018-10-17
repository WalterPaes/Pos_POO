package lista01;

import java.util.Scanner;

public class Exercicio25 {
    
    public static void main(String[] args) {
        
        int totalParcelas;
        double valorProduto, valorParcelas;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        valorProduto = tec.nextDouble();
        
        System.out.print("Insira o total de parcelas: ");
        totalParcelas = tec.nextInt();
        
        valorParcelas = valorProduto/totalParcelas;
        
        System.out.printf("O valor de cada parcela será de %.2f", valorParcelas);
        
    }
    
}
