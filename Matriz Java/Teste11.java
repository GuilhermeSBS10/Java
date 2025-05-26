public class Teste11 {

    public static void main(String[] args) {
        
        int matriz[][] = new int[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if (i == 0) {
                    matriz[i][j] = 1;
                } else if (i == 1) {
                    matriz[i][j] = 2;
                }else if (i == 2) {
                    matriz[i][j] = 3;
                }else if (i == 3) {
                    matriz[i][j] = 4;
                }else if (i == 4) {
                    matriz[i][j] = 5;
                }
                System.out.printf("%2d | ",matriz[i][j]);
            }
            System.out.printf("%n");
        }

     

    }
}