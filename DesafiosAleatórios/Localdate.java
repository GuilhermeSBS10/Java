import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        System.out.println("Qual o seu nome?");

        Scanner entrada = new Scanner(System.in);
        String nome  = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        Scanner teclado = new Scanner(System.in);
        int idade = teclado.nextInt();

        System.out.println("Fala aí, " + nome + " to ligado que você tem " + idade + " anos!");

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data: " + dataAtual);

        LocalTime horaAtual = LocalTime.now();
        System.out.println("Data e Hora: " + horaAtual);
        
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e Hora: " + dataHoraAtual);

        entrada.close();
        teclado.close();
    }
}