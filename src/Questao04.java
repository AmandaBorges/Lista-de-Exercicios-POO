import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args){


        System.out.println("Digite o valor das notas A, B e C do aluno:" );
        Scanner ler = new Scanner(System.in);
        Double notaA = ler.nextDouble();
        Double notaB = ler.nextDouble();
        Double notaC = ler.nextDouble();

        Double media = (notaA*2+notaB*3+notaC*5)/(2+3+5);
        System.out.print("A media do aluno é: " + media.toString());


    }


}
