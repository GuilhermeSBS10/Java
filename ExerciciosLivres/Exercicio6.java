package ExerciciosLivres;

import java.util.ArrayList;

public class Exercicio6 {
        
            public static void main(String[] args) {
            
                
            //Exercitanto o 'for'

            /* Imprimir números de 1 a 10  */

            for(int i = 0; i <= 10; i++){

             System.out.println("Número: "+i);

            }

            System.out.println();
            
            ArrayList<Integer> numeros = new ArrayList<>();

            for(int j = 0; j <= 10; j++){

                numeros.add(j);
                System.out.println("Número: "+numeros.get(j));  

            }
       }
   }    
