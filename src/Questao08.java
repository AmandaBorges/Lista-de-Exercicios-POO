import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {

        System.out.println("Digite um valor inteiro:");
        Scanner ler = new Scanner(System.in);

        int num = ler.nextInt();

        if(num < 0){
            System.out.println("O número digitado é negativo");
        }
        else{
            if(num > 0){
                System.out.println("Esse número é positivo");
            }  else{
                System.out.println("Este número é neutro");
            }
        }

    }

}
