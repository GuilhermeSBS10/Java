import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {
        


        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        
        
        System.out.println("Informe seu nome: ");
        String nome = input1.nextLine();

        System.out.println("Informe suas horas trabalhadas no mês: ");
        double horas = input2.nextDouble();

        System.out.println("Informe quanto você ganha por hora: ");
        double quanto = input3.nextDouble();

        double salario = horas * quanto;
        double inss = (salario * 0.08);
        double sindicato = (salario * 0.05);   
        double impostoDeRenda = (salario * 0.11);
        double liquido = (salario - (inss + sindicato + impostoDeRenda));

        System.out.println("O nome do colcaborador é "+nome);
        System.out.println("Salário Bruto: R$"+salario);
        System.out.println("IR (11%): R$"+impostoDeRenda);
        System.out.println("INSS (8%): R$"+inss);
        System.out.println("Sindicato (5%): R$"+sindicato);
        System.out.println("Salário Líquido: R$"+liquido);

        input1.close();
        input2.close();
        input3.close();

    }
}
