package exemplos;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class AloMundo {
    
    public static void main(String[]args){
        
        /*System.out.println("Alô mundo!");
        JOptionPane.showMessageDialog(null, "Hello World!");*/
        
        // Criação das variáveis
        String nome, nomeMae, nomePai;
        int idade;
        double altura;
        
        // Entrada de Dados        
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        nomeMae = JOptionPane.showInputDialog("Digite o nome da sua mãe: ");
        nomePai = JOptionPane.showInputDialog("Digite o nome do seu pai: ");
        
        // Saída
        JOptionPane.showMessageDialog(null, "Meu nome é " + nome + " e minha idade é " + idade + " anos e minha altura é "
                            + altura + " metros.\nNome da Mãe: " + nomeMae + "\nNome do Pai: " + nomePai);
        
        /*Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu Nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua Idade: ");
        idade = Integer.parseInt(sc.nextLine());
        System.out.print("Digite sua Altura: ");
        altura = Double.parseDouble(sc.nextLine());
        System.out.print("Digite o Nome de Sua Mãe: ");
        nomeMae = sc.nextLine();
        System.out.print("Digite seu Nome do seu Pai: ");
        nomePai = sc.nextLine(); */
        
        // Inicialização das Variáveis
        /*nome = "Walter";
        idade = 23;
        altura = 1.77;*/
        
        // Saída
        /*System.out.println("Meu nome é " + nome + " e minha idade é " + idade + " anos e minha altura é "
                            + altura + " metros. \n Nome da Mãe: " + nomeMae + " \n Nome do Pai: " + nomePai);*/
        
    }
    
}
