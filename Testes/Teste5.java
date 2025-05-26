import java.util.Scanner;

public class Teste5 {

    public static void main(String[] args) {
        
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        

        System.out.println("========================");
        System.out.println("Vamos descobrir a senha!");
        System.out.println("========================");

        int cont = 5;
        String senha;

        System.out.print("Digite a senha: ");
        senha = input1.next();

        System.out.println("Digite a senha para descobrir a frase escondida: ");
        String resposta = input2.nextLine();

        while (cont >= 0) {
            
            if (resposta == senha) {

                System.out.println("Parabéns, você acertou!");
                
            } else {

                System.out.println("Errou, você tem mais "+cont+ " chanses");

            }

            cont--;    
                
        }

        System.out.println("Já era!");
            

    }
    
}
