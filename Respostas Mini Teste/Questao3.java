import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        /*
         *Crie um programa em Java que:
            a. Solicite ao usuário que digite os valores inteiros de uma matriz 3x3.
            b. Armazene esses valores em uma matriz bidimensional do tipo int.
            c. Calcule e exiba:
            a. A soma de todos os elementos da matriz.
            b. A própria matriz formatada, com os números organizados em
            forma de tabela.
        */

        int[][] matriz = new int[3][3];
        Scanner input = new Scanner(System.in);

        int soma = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Digite o valor da posição: ");
                matriz[i][j] = input.nextInt();

                soma = matriz[i][j] + soma;
            }
        }

        System.out.println("\n Matriz!");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%2d", matriz[i][0]);
            for (int j = 1; j < 3; j++) {
                System.out.printf(" | %2d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("A soma de todos os numeros dentro da matriz é: "+soma);

        input.close();
    }
    
}
