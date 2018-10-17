package exemplos;

import javax.swing.JOptionPane;

public class Media3Numeros {
    
    public static void main(String[] args){
        
        // Declararção de váriaveis
        double n1, n2, n3, media;
        
        // Entrada de dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3º número: "));
        
        // Processamento de dados 
        media = (n1 + n2 + n3)/3;
        
        // Saída de dados
        JOptionPane.showMessageDialog(null, "A Média entre "+ n1 +", "+ n2 +" e "+ n3 +" é igual a "+ media);
        
    }
    
}
