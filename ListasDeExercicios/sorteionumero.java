package ListasDeExercicios;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Random.*;
import java.lang.Math;

public class sorteionumero {
    public static void main(String[] args) {
        
        System.out.println("Vamos sortear um número?");
        System.out.print("Digite quantos números você quer sortear: ");


        Scanner decidir = new Scanner(System.in);
        int decisao = decidir.nextInt();
        int contador = 0;
        int somador = 1;

        ArrayList<Integer> numeros = new ArrayList<>();

        while (contador != decisao) {

            System.out.print("Digite o "+somador+"º número que você quer sortear: ");
            Scanner mais_um = new Scanner(System.in);
            int numeral = mais_um.nextInt();
            
            numeros.add(numeral);

            contador =  contador +1;
            somador = somador + 1;

            System.out.println(numeros);
            
        }
    

        Random random = new Random();
        int sorteioindice = random.nextInt(numeros.size());
        int sorteionumero = numeros.get(sorteioindice);

        System.out.println("O número sorteado é: "+sorteionumero);

        decidir.close();
        
        
    }
    
}