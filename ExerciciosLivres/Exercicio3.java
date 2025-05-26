package ExerciciosLivres;
import java.lang.Math;

public class Exercicio3 {

    public static void main(String[] args){

        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);
        int num3 = (int)(Math.random()*100);

        float num11 = (int) num1;
        float num22 = (int) num2;
        float num33 = (int) num3;
        

        System.out.println(num1 + " e " + num11/2);
        System.out.println(num2 + " e " + num22/2);
        System.out.println(num3 + " e " + num33/2);

    }
}
