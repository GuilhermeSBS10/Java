package ExerciciosLivres;
import java.util.ArrayList;
import java.lang.Math;

public class Exercicio4 {
    
    public static void main(String[] args){

        ArrayList<Integer> numeros = new ArrayList<>();

        while (numeros.size() < 6) {

           int num = (int)(Math.random()*61);
           if (!numeros.contains(num)){
                numeros.add(num);
                System.out.println(num);

           }
        }

    }
}
