import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Bonus {
    public static void main(String[] args) {

        /*1 - Escreva um programa em java para ler a altura e o sexo (feminino, masculino) de 10
        pessoas. Calcular e escrever:
        • a maior e a menor altura.
        • a média de altura das mulheres
        • o número de homens

        Neste programa, o usuário deve inserir a altura e o sexo (feminino ou masculino) de 10
        pessoas. Durante a leitura dos dados, o programa deve verificar e armazenar a maior e a
        menor altura. Além disso, ele calcula a média de altura das mulheres e o número de
        homens. Ao final, os resultados são impressos na saída. */
       
        ArrayList<Integer> sexoM = new ArrayList<>();
        ArrayList<Integer> sexoH = new ArrayList<>();
        ArrayList<Double> alturaM = new ArrayList<>();
        ArrayList<Double> alturaH= new ArrayList<>();
        ArrayList<Double> alturaT= new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int cont = 1;

        System.out.print("Digite a quantidade de pessoas que quer analizar: ");
        int qnt_pessoas = input.nextInt();
        

        while (cont <= qnt_pessoas) {
            System.out.println("Digite se você quer adicionar um Homem ou uma Mulher ['H' para homem e 'M' para mulher]: ");
            String decisao = input.nextLine();

            if (decisao.equalsIgnoreCase("H")) {
    

                sexoH.add(1);
                System.out.println("Digite a altura da " +cont+ "º pessoa: ");
                double altura = input.nextDouble();
                input.nextLine();
                alturaH.add(altura);

                cont++;     

            }else if (decisao.equalsIgnoreCase("M")) {
                
                sexoM.add(1);
                System.out.println("Digite a altura da " +cont+ "º pessoa: ");
                double altura = input.nextDouble();
                input.nextLine();
                alturaM.add(altura);

                cont++;

            } else {

                System.out.println("ERRO TENTE DE NOVO");

            }
            
        }


        alturaT.addAll(alturaH);
        alturaT.addAll(alturaM);
        double maior = Collections.max(alturaT);
        double menor = Collections.min(alturaT);

        System.out.println("A maior altura é: "+maior);
        System.out.println("A menor altura é: "+menor);

        double soma = alturaM.stream().mapToDouble(x -> x).sum();
        double media = (double) soma / alturaM.size();

        System.out.println("A média entre as alturas femininas é: "+media);
        System.out.println("O número de Homens é: "+sexoH.size());
        
        
        input.close();
        input2.close();
        

    }
}

