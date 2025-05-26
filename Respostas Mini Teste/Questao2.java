import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
         /*

        Você deve criar um programa em Java para gerenciar o código de 8 produtos de
        uma loja. O programa deve:

        a. Armazenar 8 códigos de produtos (valores inteiros) em um vetor.
        b. Ordenar os códigos em ordem crescente.
        c. Permitir que o usuário digite um código e o programa deve dizer se ele
        está cadastrado ou não (busca binária).
        d. Exibir a lista de códigos ordenada ao final. 
        
        */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> codigos = new ArrayList<>();

        System.out.println("Vamos cadastrar até 8 produtos!");
        System.out.print("Digite quantos produtos você quer cadastrar: ");
        int qntProdutos = input.nextInt();

        if (qntProdutos > 8) {
            System.out.println("ERRO! São no máximo 8 produtos");
        } else {
            for (int i = 1; i <= qntProdutos; i++) {
                System.out.print("Digite o " + i + "º código do produto: ");
                int codigoProduto = input.nextInt();
                codigos.add(codigoProduto);
            }

            Collections.sort(codigos);
            System.out.println("\nLista de códigos em ordem crescente: " + codigos);

            input.nextLine();
            System.out.print("\nVocê quer pesquisar se algum produto foi cadastrado? [sim ou não]: ");
            String decisao = input.nextLine();

            if (decisao.equalsIgnoreCase("sim") || decisao.equalsIgnoreCase("s")) {
                System.out.print("Quantos produtos você quer pesquisar? ");
                int pesquisa = input.nextInt();

                for (int j = 1; j <= pesquisa; j++) {
                    System.out.print("Informe o código do produto a pesquisar: ");
                    int pesquisaProduto = input.nextInt();

                    int resultadoBusca = Collections.binarySearch(codigos, pesquisaProduto);
                    if (resultadoBusca >= 0) {
                        System.out.println("O código *" + pesquisaProduto + "* está cadastrado com sucesso.");
                    } else {
                        System.out.println("O código *" + pesquisaProduto + "* NÃO está cadastrado.");
                    }
                }
            } else {
                System.out.println("OK! Programa finalizado\nBoas vendas!!");
            }
        }

        input.close();
    }
}
