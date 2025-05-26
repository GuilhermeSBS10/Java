import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do produto: ");
        String produto = input1.nextLine();

        System.out.println("Digite o preço do produto: ");
        String preco = input1.nextLine();
        
        System.out.println("Digite a quantidade do produto: ");
        String quantidade = input1.nextLine();

        System.out.println("PARABÉNS, o produto foi cadastrado: '"+produto+ "' com o preço de 'R$ "+preco+"' e com a quantidade '"+quantidade+ "' ");

        input1.close();
        input2.close();
    }
    
}
