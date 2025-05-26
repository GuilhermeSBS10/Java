import java.util.ArrayList;
import java.util.Scanner;

public class Teste4 {

    public static void main(String[] args) {
        
        ArrayList<Integer> notas = new ArrayList<>();

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("Deseja começar? [Sim/Não]");
        String decisao = input1.nextLine().toLowerCase();

        int notasAlunos;

        if (decisao.equals("sim")) {
            
            System.out.println("Quantos alunos existem na classe?");
            int nAlunos = input2.nextInt();

            int cont = 1;
            if (nAlunos < 0) {
                System.out.println("Peraí pô, não existe pessoa negativa!");
            } else {

                while (cont != (nAlunos + 1)) {

                    System.out.println("Digite a "+cont+"º nota");
                    notasAlunos = input3.nextInt();
                    notas.add(notasAlunos);

                    cont++;
            
                }

                int somaLista = 0;

                for(int num : notas){

                    somaLista += num;
                }

                int mediaLista = somaLista/nAlunos;

                System.out.println("Vamos lá, essa é a lista de notas: "+notas);
                System.out.println();
                System.out.println("A média da turma foi: "+mediaLista);
            
            }
        } else {
            System.out.println("Obrigado e até mais!");
        }

        input1.close();
        input2.close();
        input3.close();

    }
    
}
