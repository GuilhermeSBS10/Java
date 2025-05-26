import java.util.ArrayList;
import java.util.Scanner;

public class Teste3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        
        double soma = 0;

        for(int i = 1; i <= 3; i++){

            System.out.println("Digite a "+i+"º nota");
            double notaN = input.nextInt();

            soma = soma + notaN;

            notas.add(notaN);

        }

        double média = soma / 3;

        System.out.printf("A média é: %.2f\n", média);

        if (média >= 7) {

            System.out.println("VOCÊ PASSOU!");
            
        } else if (média < 7 && média >= 5) {
            
            System.out.println("VOCÊ NÃO PASSOU!");

        } else {

            System.out.println("VOCÊ É BURRO!");

        }

        input.close();
    }

    
}
