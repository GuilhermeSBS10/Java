import java.util.Scanner;

public class Teste7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Você quer começar? [s -> sim / n -> nao]");
        String decisao = input.nextLine().toLowerCase();

        int cont = 1;

        do {

            System.out.println("Digite o "+cont+"º número");
            int n1 = input.nextInt();
            cont++;

            System.out.println("Digite o "+cont+"º número");
            int n2 = input.nextInt();
            cont++;

            System.out.println("A soma é: "+(n1+n2)+"\n"+"A multiplicação é: "+(n1*n2)+"\n"+"A divisão é: "+(n1/n2)+"\n");

            System.out.println("Deseja continuar? [s -> sim / n -> não]");
            decisao = input2.nextLine();
            
        } while (!decisao.equals("n"));

        input.close();
        input2.close();

    }
}
