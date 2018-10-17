package exemplos;

import javax.swing.JOptionPane;

public class OperacaoEntreNumeros {

    public static void main(String[] args) {
        
        double x, y, z, w, result;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y: "));
        z = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Z: "));
        w = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de W: "));
        
        result = (Math.pow(x, 2)) + (2 * Math.sqrt(y)) + (Math.pow(z, 3)) + (4 * Math.pow(w, 2));
        
        JOptionPane.showMessageDialog(null, "O resultado da equação é: " + result);
    }
    
}
