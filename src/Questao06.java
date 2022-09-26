import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o valor dos lados do triângulo A, B e C :" );
        Scanner ler = new Scanner(System.in);

        int  A , B , C ; //Escreva um programa que leia três valores para os lados de um triângulo

        System.out.print( "Verificador de Triângulo\n\n" );


        System.out.print( "Digite o lado A=" );
        A = entrada.nextInt (); //Escreva um programa que leia três valores para os lados de um triângulo

        System.out.print( "Digite o lado B=" );
        B = entrada.nextInt (); //Escreva um programa que leia três valores para os lados de um triângulo

        System.out.print( "Digite o lado C=" );
        C = entrada.nextInt (); //Escreva um programa que leia três valores para os lados de um triângulo


        if ( A < B + C && B < A + C && C < A + B ){ //Verificar se cada lado é menor que a soma dos dois outros lados.
            if ( A == B && B == C ){ //saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero
                System.out.print( "O triângulo é Equilátero." );
            } else  if ( A == B || A == C || B == C ){ //Não se verifica de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles
                System.out.print( "O triângulo é isósceles." );
            } else { //e caso contrário, o triângulo será escaleno
                System.out.print( "O triângulo é Escaleno." );
            }
        } else { //Caso os lados digitados não caracterizarem um triângulo, avisar a ocorrência.
            System.out.print( "Os lados fornecidos não caracterizam um triângulo" );
        }

    }

}
