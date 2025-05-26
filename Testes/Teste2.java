import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = input.nextInt();

        if (numero > 0) {

            System.out.println("O NÚMERO É POSITIVO");
            
        } else if(numero < 0){

            System.out.println("O NÚMERO É NEGATIVO");

        } else {

            System.out.println("O ZERO É NEUTRO IRMÃO!!");

        }

        input.close();
    }
}
