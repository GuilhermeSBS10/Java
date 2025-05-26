package ExerciciosLivres;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args){

        System.out.println("Digite a primeira nota: ");
        Scanner primeitira_nota = new Scanner(System.in);
        float nota1 = primeitira_nota.nextFloat();
        System.out.println("Digite a segunda nota: ");
        Scanner segunda_nota = new Scanner(System.in);
        float nota2 = segunda_nota.nextFloat();

               
        System.out.println("A soma entre essas notas é: "+ (nota1 + nota2));
        System.out.println("A subtração entre essas notas é: "+ (nota1 - nota2));
        System.out.println("A média entre essas notas é: "+ ((nota1 + nota2)/2));
        
        primeitira_nota.close();
        segunda_nota.close();

    }
    
}
