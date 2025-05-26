package ExerciciosLivres;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        /*Inverter uma palavra*/

        Scanner input = new Scanner(System.in);
        
        ArrayList<String> palavras = new ArrayList<>();
        ArrayList<String> palavrasInvertidas = new ArrayList<>();
        
        System.out.println("Quantas palavras você quer inverter?");

        try {
            int decisao = input.nextInt();
            input.nextLine(); // consumir o ENTER após o número

            for(int i = 1; i <= decisao; i++) {
                System.out.print("Digite a " + i + "ª palavra: ");
                String palavra = input.nextLine();
                palavras.add(palavra);

                String invertida = new StringBuilder(palavra).reverse().toString();
                palavrasInvertidas.add(invertida);
            }
            
            System.out.println("\n--------------------------------------------");
            System.out.println("As palavras normais digitadas: " + palavras);
            System.out.println("As palavras invertidas: " + palavrasInvertidas);
            System.out.println("--------------------------------------------");
    

        } catch (Exception e) {
            System.out.println("Você não digitou um número válido.");
        }

       
        input.close();
    }
}
