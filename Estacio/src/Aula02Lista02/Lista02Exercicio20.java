package Aula02Lista02;

import java.util.Scanner;

public class Lista02Exercicio20 {
    
    public static void main(String[] args) {
        
        String nome, sexo;
        int idade;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        nome = tec.nextLine();
        
        System.out.print("Digite o seu sexo [Masculino ou Feminino]: ");
        sexo = tec.nextLine();
        
        System.out.print("Digite a sua idade: ");
        idade = tec.nextInt();
        
        if (sexo.equalsIgnoreCase("Feminino") && idade >= 18) {
            System.out.println("Candidata apta para o serviço.");
        } else if (sexo.equalsIgnoreCase("Feminino") && idade < 18) {
            System.out.println("Dados da candidata salvos no banco de dados.");
        } else {
            System.out.println("Candidato não condizente com o cargo.");
        }
        
    }
    
}
