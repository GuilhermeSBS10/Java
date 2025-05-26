import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
        
        /*double n1 = 10;
        double n2 = 3;

        double resultado = n1/n2;

        System.out.print(resultado+"\n");
        System.out.printf("O resultado é: %f\n", resultado);
        System.out.printf("O resultado é: %.2f\n", resultado);*/

        /*int i = 11;
        if (i>10)
        i++;
        i++;
        
        System.out.println(i);*/


        /*int i = 10;
        if (i>10)
        i++;
        i++;

        System.out.println(i);*/

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {

            System.out.println("PODE DIRIGIR");
            
        } else {
            System.out.println("NÃO PODE AINDA");
        }

        input.close();
    }
}