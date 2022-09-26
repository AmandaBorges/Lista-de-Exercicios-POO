import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args){


        System.out.print("Digite o valor da quantidade de chuva em polegadas:" );
        Scanner ler = new Scanner(System.in);
        Double polegadas = ler.nextDouble();
        Double chuvaEmMilimetros = 25.4 * polegadas;
        System.out.print("A quantidade de chuva em mm é: " + chuvaEmMilimetros.toString());

    }


}
