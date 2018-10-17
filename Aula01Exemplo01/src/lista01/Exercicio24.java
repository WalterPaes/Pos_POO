package lista01;

import javax.swing.JOptionPane;

public class Exercicio24 {
    
    public static void main(String[] args) {
        
        double n, quadrado, cubo, raizQuadrada;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Insira um número mairo que zero:"));
        
        quadrado = Math.pow(n, 2);
        cubo = Math.pow(n, 3);
        raizQuadrada = Math.sqrt(n);
        
        JOptionPane.showMessageDialog(null, "Quadrado de " + n + " = " + quadrado + "\nCubo de "+ n + " = " + cubo + "\nRaiz Quadrada de " + n + " = " + raizQuadrada);
        
    }
    
}
