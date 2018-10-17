package Aula02Exemplo01;

public class Arrays {
    
    public static void main(String[] args) {
    
//        int numeros[] = new int[5];
//    
//        numeros[0] = 9;
//        numeros[1] = 50;
//        numeros[2] = 30;
//        numeros[3] = 5;
//        numeros[4] = 7;
        
        int numeros[] = {8, 49, 25, 7, 2};
        int i = 0;

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println((i + 1) + "º número = " + numeros[i]);
//        }
        
        for(int linha: numeros) {
            System.out.println("[" + i + "]" + " = " + linha);
            i++;
        }
        
    }
    
}
