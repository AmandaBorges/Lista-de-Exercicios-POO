import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args){

        System.out.println("Digite o valor do lado a e b:" );
        Scanner ler = new Scanner(System.in);
        Double ladoA = ler.nextDouble();
        Double ladoB = ler.nextDouble();

        Double hipotenusa = ladoA*ladoA + ladoB*ladoB;
        System.out.print("O valor da hipotenusa é: " + hipotenusa.toString());

    }

}
