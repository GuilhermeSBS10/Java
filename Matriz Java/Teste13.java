import java.util.Scanner;

public class Teste13 {
    public static void main(String[] args) {
        
        int matriz[][] = new int[3][3];

        Scanner input = new Scanner(System.in);

        //Looping que pede e armazena os números na matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                System.out.println("Qual número vai querer colocar agora?");
                matriz[i][j] = input.nextInt();
                
            }
        }

        //Looping que percorre a matriz e mostra cada linha e coluna!
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                System.out.printf("%2d | ", matriz[a][b]);
            }
            System.out.println(); //Vai pular uma linha a cada linha mostrada da matriz
        }
        
        input.close();

    }
    
}
