import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {
        
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        
        System.out.println("Digite o Grau atual em Celsius: ");
        double gCelcius = input1.nextDouble();

        System.out.println("Você quer transformar para que?['1' para Fahrenheit] ['2' para Kelvin] ");
        double decisao = input2.nextDouble();

        if (decisao == 1) {

        
            System.out.println("------------------------------------------");
            System.out.println("Você descidiu transformar para Fahrenheit.");
            System.out.println("------------------------------------------");

            System.out.println("A temperatura em Fahrenheit é: "+ ((gCelcius*1.8)+32));        
            
        } else if (decisao == 2) {

            System.out.println("--------------------------------------");
            System.out.println("Você descidiu transformar para Kelvin.");
            System.out.println("--------------------------------------");

            System.out.println("A temperatura em Fahrenheit é: "+ ((gCelcius+273.15)));  
            
        } else if (decisao == ) {

            System.out.println("OPÇÃO INVÁLIDA!");
            
        } else {

            System.out.println("OPÇÃO INVÁLIDA!");

        }

        input1.close();
        input2.close();
    }
}
