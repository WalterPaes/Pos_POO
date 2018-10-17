package Aula02Lista02;

import java.util.Random;

public class Lista02Exercicio25 {
    
    public static void main(String[] args) {
        
        int jogador1, jogador2;
        
        System.out.println("1 - Pedra; 2 - Papel; 3 - Tesoura");
        
        Random random = new Random();
        
        jogador1 = (int) random.nextInt(3) + 1;
        jogador2 = (int) random.nextInt(3) + 1;
        
        if (jogador1 > jogador2) {
            System.out.println("Jogador 1 vencedor: " + getValor(jogador1) + " vence " + getValor(jogador2));
        } else if (jogador1 < jogador2) {
            System.out.println("Jogador 2 vencedor: " + getValor(jogador2) + " vence " + getValor(jogador1));
        } else {
            System.out.println("Empate: " + getValor(jogador1) + " e " + getValor(jogador2));
        }
        
    }
    
    public static String getValor(int num){
        
        String valor;
        
        switch (num) {
            case 1:
                valor = "Pedra";
                break;
            case 2:
                valor = "Papel";
                break;
            case 3:
                valor = "Tesoura";
                break;
            default:
                valor = "Inválido";
        }
        
        return valor;
    }
    
}
