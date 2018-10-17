package lista01;

import javax.swing.JOptionPane;


public class Exercicio13 {
    
    public static void main(String[] args) {
        
        String nome;
        double n1, n2, n3, n4, media;
        
        nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 1ª nota:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 2ª nota:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 3ª nota:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 4ª nota:"));
        
        media = (n1 + n2 + n3 + n4)/4;
        
        JOptionPane.showMessageDialog(null, "A média final de "+ nome +" é " + media);
    }
    
}
