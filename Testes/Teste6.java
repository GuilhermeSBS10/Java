import java.util.Scanner;

public class Teste6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        int decisao;
        int somaSim = 0;
        int somaNao = 0;

        do {
            System.out.println("Você quer ter aula na quarta feira de cinzas?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            System.out.println("0 - ENCERRAR");
            decisao = input.nextInt();

            if (decisao == 1) {

                somaSim ++;
                
            } else if (decisao == 2) {

                somaNao ++;

            } else {

                System.out.println("Digite algo válido!");

            }

            System.out.println("Quantidade de pessoas a favor: "+somaSim);
            System.out.println("Quantidade de pessoas a favor: "+somaNao);

        } while (decisao != 0);

        if (decisao == 0) {

            System.out.println("Programa encerrado");
            System.out.println();
            
        }

        System.out.println("Total a favor: "+somaSim);
        System.out.println("Total contra: "+somaNao);

        input.close();

    }
    
}
