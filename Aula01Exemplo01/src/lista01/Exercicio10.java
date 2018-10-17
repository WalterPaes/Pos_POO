package lista01;

import javax.swing.JOptionPane;

public class Exercicio10 {
    
    public static void main(String[] args) {
    
        int n, ant, sus;
    
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro.."));
        
        ant = n - 1;
        sus = n + 1;
        
        JOptionPane.showMessageDialog(null, "O número "+ n + " tem como antecessor o "+ ant + " e como sucessor o " + sus);
        
    }
    
}
