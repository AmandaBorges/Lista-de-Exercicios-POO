import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args){

        System.out.println("Digite o valor das notas A e B:" );
        Scanner ler = new Scanner(System.in);
        Double notaA = ler.nextDouble();
        Double notaB = ler.nextDouble();

        Double media = (notaA*3.5+notaB*7.5)/(3.5+7.5);
        System.out.print("A media do aluno é: " + media.toString());


    }

}
