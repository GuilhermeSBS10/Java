package ExerciciosLivres;

import java.util.ArrayList;

public class Exercicio7 {
    
    public static void main(String[] args) {

        /*Use um for para somar os números de 1 a 100 e imprimir o resultado.*/

        ArrayList<Integer> numeros = new ArrayList<>();

        int soma = 0;

        for(int i = 0; i <= 100; i++){
            
            soma = soma + i;
            numeros.add(i);
        }
        
        

        System.out.println(numeros);
        System.out.println();
        System.out.println("A soma entre os números de 1 a 100 é: "+soma);

    }
    
}
