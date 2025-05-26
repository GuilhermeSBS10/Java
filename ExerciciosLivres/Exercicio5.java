package ExerciciosLivres;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ESSA PRIMEIRA PARTE DO PROGRAMA MOSTRA 3 NUMEROS SORTEADOS ENTRE 0 A 100 E MOSTRA ESSE NUMERO DIVIDIDO POR 2, TEM RISCO DE REPETIR UM NÚMERO JÁ SORTEADO");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");


        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);
        int num3 = (int)(Math.random()*100);

        float num11 = (int) num1;
        float num22 = (int) num2;
        float num33 = (int) num3;
        

        System.out.println(num1 + " e " + num11/2);
        System.out.println(num2 + " e " + num22/2);
        System.out.println(num3 + " e " + num33/2);


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ESSA SEGUNDA PARTE DO PROGRAMA ELE ESCOLHE 6 NUMEROS SORTEADOS ENTRE 0 A 100 E MOSTRA, MAS AGORA NÃO TEM REISCO DE REPETIR O NÚMERO NO SORTEIO");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");


        ArrayList<Integer> numeros = new ArrayList<>();

        while (numeros.size() < 6) {

           int num = (int)(Math.random()*61);
           if (!numeros.contains(num)){
                numeros.add(num);
                System.out.println(num);

           }
        }


        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("ESSA TERCEIRA PARTE DO PROGRAMA ELA LER 2 COORDDENADAS E CALCCULA A DISTÂNCIA ENTRE ELAS");
        System.out.println("----------------------------------------------------------------------------------------");


        int x1;
        int x2;
        int y1;
        int y2;
        double d;
        

        System.out.print("Digite a primeira cordenada X1: ");
        Scanner X1 = new Scanner(System.in);
        x1 = X1.nextInt();
        

        System.out.print("Digite a primeira cordenada X2: ");
        Scanner X2 = new Scanner(System.in);
        x2 = X2.nextInt();
        

        System.out.print("Digite a primeira cordenada Y1: ");
        Scanner Y1 = new Scanner(System.in);
        y1 = Y1.nextInt();

        System.out.print("Digite a segunda cordenada Y2: ");
        Scanner Y2 = new Scanner(System.in);
        y2 = Y2.nextInt();

        d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.println(d);

        X1.close();
        X2.close();
        Y1.close();
        Y2.close();

    }
}
