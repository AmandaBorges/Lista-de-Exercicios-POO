import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {

        System.out.println("Por favor, informe o valor das notas 1,2,e 3:");
        Scanner ler = new Scanner(System.in);

       Double nota1 = ler.nextDouble();
       Double nota2 = ler.nextDouble();
       Double nota3 = ler.nextDouble();

        System.out.println("Por favor, digite 1 se deseja calcular a media aritmetica ou 2 para média ponderada:");

        Double tipoDeMedia = ler.nextDouble();

        if(tipoDeMedia == 1 ){
            Double mediaAritimetica = (nota1 + nota2 + nota3)/3;
            System.out.println("A média aritimética do aluno(a) é: " +mediaAritimetica);
        }
        else{
            Double mediaPonderada = (nota1*3+nota2*3+nota3*4)/(3+3+4);
            System.out.println("A média podenrada do aluno(a) é: " +mediaPonderada);
        }

    }
}
