package ExerciciosLivres;

import java.util.ArrayList;

public class Exercicio11 {
    public static void main(String[] args) {
        
        /*Números primos de 1 a 100*/

        ArrayList<Integer> numerosPrimos = new ArrayList<>();
        ArrayList<Integer> numerosNaoPrimos = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            boolean ehPrimo = true;

            System.out.println("\nVerificando o número: " + i);

            for (int j = 2; j < i; j++) {
                System.out.println("  Testando se " + i + " é divisível por " + j);
                
                
                if (i % j == 0) {
                    System.out.println("  -> " + i + " é divisível por " + j + " (não é primo)");
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println("  => " + i + " é primo!");
                numerosPrimos.add(i);
            } else {
                numerosNaoPrimos.add(i);
            }
        }

        System.out.println("\n---- Números primos de 2 a 100 ----");
        System.out.println(numerosPrimos);
    }
}