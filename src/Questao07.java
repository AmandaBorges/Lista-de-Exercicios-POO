import java.util.Scanner;

public class Questao07 {

        public static void main(String[] args){

            //7) Leia um valor inteiro X e diga se ele é par ou ímpar.

            System.out.println("Digite um valor inteiro:" );
            Scanner ler = new Scanner(System.in);


            int num = ler.nextInt();
            if(num % 2 == 0){
                System.out.println("É um número par");
            }
            else{
                System.out.println("Esse é um número impar");
            }
 }

}


