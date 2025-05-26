package ListasDeExercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class ListadeExercicio {
    public static void main(String[] args) {

        
        System.err.println();
        System.out.println("1º QUESTÃO:");
        System.err.println();

        System.out.println("--------------------------");
        System.out.println("Digite o primeiro número: ");
        

        Scanner primeiro_num = new Scanner(System.in);
        double num1 = primeiro_num.nextDouble();

        System.out.println("-------------------------");
        System.out.println("Digite o segundo número: ");

        Scanner segundo_num = new Scanner(System.in);
        double num2 = segundo_num.nextDouble();

        System.out.println("A soma entre os dois números é: "+ (num1+num2));
        System.out.println("A subtração entre os dois números é: "+ (num1-num2));
        System.out.println("A multiplicação entre os dois números é: "+ (num1*num2));
        System.out.println("A divisão entre os dois números é: "+ (num1/num2));


        System.err.println();
        System.out.println("2º QUESTÃO:");
        System.err.println();


        
        System.out.println("------------------------");
        System.out.println("Digite a primeira nota: ");  
        
        Scanner primeira_nota = new Scanner(System.in);
        String nota1 = primeira_nota.nextLine();
        double primeiranota = Double.parseDouble(nota1);

        System.out.println("-----------------------");
        System.out.println("Digite a segunda nota: "); 
        
        Scanner segunda_nota = new Scanner(System.in);
        String nota2 = segunda_nota.nextLine();
        double segundanota = Double.parseDouble(nota2);

        System.out.println("------------------------");
        System.out.println("Digite a terceira nota: ");  
        
        Scanner terceira_nota = new Scanner(System.in);
        String nota3 = terceira_nota.nextLine();
        double terceiranota = Double.parseDouble(nota3);

        System.out.println("A média entre os tres notas é: "+ ((primeiranota+segundanota+terceiranota)/3));


        System.err.println();
        System.out.println("3º QUESTÃO:");
        System.err.println();


        System.out.println("------------------");
        System.out.println("Informe seu nome: ");

        Scanner identidade = new Scanner(System.in);
        String nome = identidade.nextLine();

        System.out.println("-------------------------------------------");
        System.out.println("Informe a quantidade de horas trabalhadas: ");

        Scanner htrabalho = new Scanner(System.in);
        double hora = htrabalho.nextDouble();

        System.out.println("----------------------------");
        System.out.println("Você ganha quanto por hora: ");

        Scanner dinheiro = new Scanner(System.in);
        double salario = dinheiro.nextDouble();

        double calculo_do_salario = (hora*salario);

        System.out.println("O nome do colaborador é: "+nome);
        System.out.println("O salário a receber é: "+calculo_do_salario);


        System.err.println();
        System.out.println("4º QUESTÃO:");
        System.err.println();

        System.out.println("------------------------");
        System.out.println("Qual o Preço do produto?");

        Scanner produto = new Scanner(System.in);
        double custo = produto.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("Quanto o cliente pagou no produto?");

        Scanner produto_pago = new Scanner(System.in);
        double pago = produto_pago.nextDouble();

        if ((custo - pago)>0) {
            System.out.println("O troco que precisa dar ao cliente é: "+(custo - pago));
        } else if ((custo - pago) == 0) {
            System.out.println("O produto está pago! Obrigado pela preferência");
        } else {
            System.out.println("O cliente pagou pagou mais que o normal, ele pagou a mais R$"+(pago - custo));
        }


        System.err.println();
        System.out.println("5º QUESTÃO:");
        System.err.println();

        ArrayList<Integer> triangulo = new ArrayList<>();

        System.out.println("-----------------------------------");
        System.out.println("Informe a base maior do triângulo: ");
        Scanner base_maior = new Scanner(System.in);
        int maior = base_maior.nextInt();
        triangulo.add(maior);

        System.out.println("-----------------------------------");
        System.out.println("Informe a base menor do triângulo: ");
        Scanner base_menor = new Scanner(System.in);
        int menor = base_menor.nextInt();
        triangulo.add(menor);

        System.out.println("-------------------------------");
        System.out.println("Informe a altura do triângulo: ");
        Scanner h_altura = new Scanner(System.in);
        int altura = h_altura.nextInt();
        triangulo.add(altura);
        

        int area = triangulo(0) * triangulo(1) / 2;

        System.out.println("A área do triangulo é: "+area);

        

        System.err.println();
        System.out.println("6º QUESTÃO:");
        System.err.println();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Escreva o grau em Fahrenheit, para transferir para Celsius.");
        Scanner graus = new Scanner(System.in);
        double fahrenheit = graus.nextDouble();

        System.out.println("A temperatura em Celsius é: "+((fahrenheit-32)/9)*5);


        primeiro_num.close();
        segundo_num.close();
        primeira_nota.close();
        segunda_nota.close();
        terceira_nota.close();
        identidade.close();
        htrabalho.close();
        dinheiro.close();
        produto.close();
        produto_pago.close();
        base_maior.close();
        base_menor.close();
        h_altura.close();
        graus.close();


    }
    public static int triangulo(int indice) {
        if (indice == 0) {
            return 5; // Base do triângulo
        } else if (indice == 1) {
            return 10; // Altura do triângulo
        }
        return 0; // Caso inválido
    }

}