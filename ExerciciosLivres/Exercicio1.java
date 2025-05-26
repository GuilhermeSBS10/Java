package ExerciciosLivres;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){
        
    System.out.println("Digite seu peso: ");
    Scanner entrada = new Scanner(System.in);
    float peso = entrada.nextFloat();
    System.out.println("Digite sua altura em metros: ");
    Scanner teclado = new Scanner(System.in);
    float altura = teclado.nextFloat();


    
    System.out.println("Seu peso é: "+ peso);
    System.out.println("Sua altura em metros é: "+ altura);

    entrada.close();
    teclado.close();



    }
}
