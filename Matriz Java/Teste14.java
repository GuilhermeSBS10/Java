import java.util.Scanner;

public class Teste14 {
    public static void main(String[] args) {
        int matriz[][] = new int[2][2];

        Scanner input = new Scanner(System.in);

        //Looping para pedir os numeros que vão na matriz
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("Digite o número: ");
                matriz[i][j] = input.nextInt();              
            }
        }

        //Looping para mostrar a matriz
        for(int a = 0; a < 2; a++){
            for(int b = 0; b < 2; b++){
                System.out.printf("%2d | ",matriz[a][b]); 
            }
            System.out.println();
        }

        // Encontrar o maior número da matriz e sua posição
        int maiornumero = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        for(int g = 0; g < matriz.length; g++){

            for(int z = 0; z < matriz[0].length; z++){
                if (matriz[g][z] > maiornumero) {

                    maiornumero = matriz[g][z]; 
                    linha = g;
                    coluna = z;
                }
            }
        }
        
        // Mostrar resultado
        System.out.println("O maior número é: "+maiornumero);
        System.out.println("A linha onde este número está é: "+linha);
        System.out.println("A coluna onde este número está é: "+coluna);

        input.close();
    }
    
}
