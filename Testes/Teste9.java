import java.util.Scanner;

public class Teste9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] par = new int[10];
        int[] impar = new int[10];
        int decisao;
        int indI = 0;
        int indP = 0;
        

        for(int i = 1; i <= 10; i++){

            System.out.println("Escreva o "+i+"º número");
            decisao = input.nextInt();

            if (decisao % 2 == 0) {

                par[indP] = decisao;

                indP++;
                
            }else{
                impar[indI] = decisao;

                indI++;
            }
            
        }

        input.close();

        System.out.println("IMPAR:");

        for(int j = 0; j < indI; j++){

            System.out.println(impar[j]);

        }

        System.out.println("PAR:");

        
        for(int j = 0; j < indP; j++){

            System.out.println(par[j]);

        }
        

    }
    
}
