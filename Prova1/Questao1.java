import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        
        System.out.println("Digite o primeiro número: ");
        double num1 = input1.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = input1.nextDouble();

        System.out.println("Você deseja fazer qual operação básica?");
        System.err.println();
        System.out.println("Digite: ('1' para adição) ('2' para subtração) ('3' para multiplicação) ('4' para divisão)");

        int receber = input2.nextInt();

        if (receber == 1) {

            System.out.println("A adição entre os dois números é: "+(num1+num2));
            
        } else if (receber == 2){

            System.out.println("A subtração entre os dois números é: "+(num1-num2));

        } else if (receber == 3){

            System.out.println("A multiplicação entre os dois números é: "+(num1*num2));

        } else if (receber == 4) {
            
            System.out.println("A divisão entre os dois números é: "+(num1/num2));

        } else {

            System.out.println("INVÁLIDO, TENTE DE NOVO MAIS TARDE!");

        }

        input1.close();
        input2.close();

    }
}