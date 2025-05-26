import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
     
        /*1- Você foi contratado para desenvolver um sistema simples de análise de notas de
        alunos. O sistema deve:
        a. Ler as notas de 10 alunos e armazená-las em um vetor.
        b. Calcular e exibir a média das notas.
        c. Exibir todas as notas acima da média.
        d. Informar quantos alunos tiraram nota abaixo de 5.

        SAÍDA:
        Média das notas: 6.3
        Notas acima da média:
        - 7.0
        - 8.5           */

        Scanner input = new Scanner(System.in);
        ArrayList<Double> notasAcimaDaMedia = new ArrayList<>();


        System.out.println("Vamos ver as notas de até 10 alunos!");
        System.out.println();

        System.out.println("Vão ser quantos alunos!\nDigite quantos alunos você tem: ");
        int qntAlunos = input.nextInt();

        double nota = 0;
        double soma = 0;
        double somaDeAlunos = 0;

        if (qntAlunos > 10) {

            System.out.println("ERRO! São no maximo, 10 alunos");
            
        }else {
                for(int i = 1; i <= qntAlunos; i++){

                System.out.println("Digite a "+i+"º nota");
                nota = input.nextDouble();

                soma = nota + soma;
                    if (nota > 7) {
                        notasAcimaDaMedia.add(nota);
                    
                    }else{
                        somaDeAlunos = somaDeAlunos + 1;
                    }
                }


            double mediaNotas = soma/qntAlunos;

            System.out.println("Média das notas: "+mediaNotas);
            System.out.println("Notas acima da média: "+notasAcimaDaMedia);
            System.out.println("Quantidade de alunos que tiraram notas abaixo da média: "+somaDeAlunos);
        
        }

        input.close();


    }
}
