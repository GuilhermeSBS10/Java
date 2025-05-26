package ExerciciosLivres;

import java.util.ArrayList;

public class Exercicio8 {
    public static void main(String[] args) {
        
        /*Imprimir os múltiplos de 5 entre 0 e 50*/

        ArrayList<Integer> numerosmultiplos = new ArrayList<>();
        ArrayList<Integer> numerosnmultiplos = new ArrayList<>();


        for(int i = 0; i <= 50; i++){

            if (i % 5 == 0) {

                numerosmultiplos.add(i);
                
            } else {

                numerosnmultiplos.add(i);

            }

        }

        System.out.println("Números multiplos de 5: ");
        System.out.println(" * "+numerosmultiplos+" * ");
        System.out.println();
        System.out.println("Números que não são multiplos de 5: ");
        System.out.println(" * "+numerosnmultiplos+" * ");

    }
    
}
