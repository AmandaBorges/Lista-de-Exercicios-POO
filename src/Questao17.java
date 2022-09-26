import java.util.Scanner;

public class Questao17 {


        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.println("Informe o primeiro nome 1 é: ");
            String nome1 = ler.nextLine();
            System.out.println("Informe o segundo nome 2 é: ");
            String nome2 = ler.nextLine();
            System.out.println("Informe o terceiro nome 3 é: ");
            String nome3 = ler.nextLine();
            System.out.println("Informe o quarto nome 4 é: ");
            String nome4 = ler.nextLine();
            System.out.println("Informe o quinto nome 5 é: ");
            String nome5 = ler.nextLine();
            System.out.println("Informe o sexto nome 6 é: ");
            String nome6 = ler.nextLine();
            System.out.println("Informe o setimo nome 7 é: ");
            String nome7 = ler.nextLine();
            System.out.println("Informe o oitavo nome 8 é: ");
            String nome8 = ler.nextLine();

            int tamanhoNome1 = nome1.replace(" ", "").length();
            System.out.println("A quantidade de letras do nome é : " + tamanhoNome1);

            int tamanhoNome2 = nome2.replace(" ", "").length();
            System.out.println("A quantidade de letras do nome é : " + tamanhoNome2);

            int tamanhoNome3 = nome3.replace(" ", "").length();
            System.out.println("A quantidade de letras do nome é : " + tamanhoNome3);

            int tamanhoNome4 = nome4.replace(" ", "").length();
            System.out.println("A quantidade de letras do nome é : " + tamanhoNome4);

            int tamanhoNome5 = nome5.replace(" ", "").length();
            System.out.println("A quantidade de letras do nome é : " + tamanhoNome5);

            int tamanhoNome6 = nome6.replace(" ", "").length();
            System.out.println("A quantidade de letras do nome é : " + tamanhoNome6);

            int tamanhoNome7 = nome7.replace(" ", "").length();
            System.out.println("A quantidade de letras do nome é : " + tamanhoNome7);

            int tamanhoNome8 = nome8.replace(" ", "").length();
            System.out.println("A quantidade de letras do nome é : " + tamanhoNome8);


        }
}
