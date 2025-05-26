import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {

            Scanner input1 = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            Scanner input3 = new Scanner(System.in);
            Scanner input4 = new Scanner(System.in);
            Scanner input5 = new Scanner(System.in);
            Scanner input6 = new Scanner(System.in);

            System.out.println("--------------------------------");
            System.out.println("Conversor de moedas de Real (R$)");
            System.out.println("--------------------------------");

            
            System.out.println("[1] para Dollar");
            System.out.println("[2] para Euro");
            System.out.println("[3] para Libras");
            System.out.println("[4] para Pesos Argentinos");
            System.out.println("[5] para todos os anteriores");
            

            int decisao = input1.nextInt();

            if (decisao == 1) {

                System.out.print("Quanto em real você quer converter: ");
                double receberRD = input2.nextDouble();
        
                double dollar = receberRD / 6;

                System.out.println("O valor R$"+ receberRD+" em Dollar é: U$"+dollar);


            } else if (decisao == 2) {
                
                System.out.print("Quanto em real você quer converter: ");
                double receberRE = input3.nextDouble();

                double euro = receberRE / 6.5;

                System.out.println("O valor R$"+ receberRE+" em Euro é: E$"+euro);


            } else if (decisao == 3) {

                System.out.print("Quanto em real você quer converter: ");
                double receberRL = input4.nextDouble();

                double libras = receberRL / 7;

                System.out.println("O valor R$"+ receberRL+" em Libras é: L$"+libras);

            } else if (decisao == 4) {

                System.out.print("Quanto em real você quer converter: ");
                double receberRP = input3.nextDouble();

                double pesos = receberRP * 6.5;

                System.out.println("O valor R$"+ receberRP+" em Pesos Argentinos é: P$"+pesos);

            } else if (decisao == 5) {
                
                System.out.print("Quanto em real você quer converter: ");
                double receberRT = input3.nextDouble();

                double dollar = receberRT / 6;
                double euro = receberRT / 6.5;
                double libras = receberRT / 7;
                double pesos = receberRT * 6.5;

                System.out.println("Dollar: U$"+dollar);
                System.out.println("Euro: E$"+euro);
                System.out.println("Libras: L$"+libras);
                System.out.println("PesosArgentinos: P$"+pesos);

            } else {
                System.out.println("Inválido!");
            }

            input1.close();
            input2.close();
            input3.close();
            input4.close();
            input5.close();
            input6.close();
    
    }
}