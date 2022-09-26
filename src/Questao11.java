import java.util.Scanner;

    public class Questao11 {
        public static void main(String[] args) {

        System.out.println("Por favor informe as notas do aluno:");
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        Double nota1 = ler.nextDouble();
        System.out.println("Digite a nota 2");
        Double nota2 = ler.nextDouble();
        System.out.println("Digite a nota 3");
        Double nota3 = ler.nextDouble();

        Double mediaFinal = (nota1 + nota2 + nota3)/3;
        String conceitoNota = "";

            if(mediaFinal >= 8.0 && mediaFinal <= 10 ){
                conceitoNota = "A";

            }
            else if(mediaFinal < 8.0 && mediaFinal >= 5.0){
                conceitoNota = "B";

            }else {
                conceitoNota = "C";
            }

            System.out.println("A média final do aluno foi de : " +mediaFinal+ " Com conceito : " +conceitoNota);

    }
}
