import java.util.Scanner;

    public class Questao05 {

        public static void main(String[] args){

            System.out.println("Digite o valor das variáveis A, B, C e D:" );
            Scanner ler = new Scanner(System.in);

            Double variavelA = ler.nextDouble();
            Double variavelB = ler.nextDouble();
            Double variavelC = ler.nextDouble();
            Double variavelD = ler.nextDouble();

            Double diferenca = (variavelA*variavelB - variavelC*variavelD);
            System.out.print("A diferença do produto de A e B pelo produto de C e D é: " +diferenca.toString() );


        }


    }
