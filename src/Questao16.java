import java.util.Scanner;

public class Questao16 {

    public static void main(String[] args) {

        System.out.println("Por favir digiti um valor inteiro para soma: ");

        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);
            multiplicador++;
        }
    }


  }

