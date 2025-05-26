package ExerciciosLivres;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*Tabuada de um número*/

        Scanner input = new Scanner(System.in);
        
        System.out.println("-------");
        System.out.println("TABUADA");
        System.out.println("-------");
        System.out.println();

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = input.nextInt();

        for (int i = 0; i <= 10; i++){

            int mult = numero * i;
            System.out.println(numero+" X "+i+" = "+mult);

        }

        System.out.println("--------------------------------");
        System.out.println("Obrigado por usar nosso programa");
        System.out.println("--------------------------------");

        input.close();
        

    }
}
