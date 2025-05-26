import java.util.Scanner;

public class Teste11 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        Scanner input = new Scanner(System.in);
        

        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){

                System.out.println("Digite o primeiro número: ");
                int numero = input.nextInt();
                matriz[x][y] = numero;


            }

        }

        System.out.println(matriz);
        
    }
}
