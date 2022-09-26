import java.util.Scanner;

    public class Questao10 {
        public static void main(String[] args) {

        System.out.println("Por favor informe o seu nome:");
        Scanner ler = new Scanner(System.in);

        String nomeHospede = ler.nextLine();

        System.out.println("Por favor informe o tipo de apartamento escolhido A, B,C ou D:");
        String tipoDeQuarto = ler.nextLine();

        System.out.println("Por favor informe o número de diárias desejadas:");
        Double diarias = ler.nextDouble();


        Double totalDiarias = 0d;
        Double diariaUnitaria = 0d;

        switch (tipoDeQuarto) {

            case "A":
                    totalDiarias = 150 * diarias;
                    diariaUnitaria = 150d;
                    break;
            case "B":
                    totalDiarias = 100 * diarias;
                    diariaUnitaria = 100d;
                    break;
            case "C":
                    totalDiarias = 75 * diarias;
                    diariaUnitaria = 75d;
                    break;
            case "D":
                    totalDiarias = 50 * diarias;
                    diariaUnitaria = 50d;
                    break;
            }

        System.out.println("Por favor informe o consumo interno do hospede:");
        Double consumoInterno = ler.nextDouble();

        Double subtotal = totalDiarias + consumoInterno;
        Double taxaServiço = 0.1 * subtotal;

        Double totalGeral = subtotal + taxaServiço;

        System.out.println("O nome do hospede é : " +nomeHospede);
        System.out.println("O tipo de apartamento escolhido foi : " +tipoDeQuarto);
        System.out.println("O número de diárias foram de : " +diarias+ " e seu valor unitário foi de: " +diariaUnitaria);
        System.out.println("O valor total das diárias foi de  : " +totalDiarias);
        System.out.println("O consumo interno do hospede foi de : " +consumoInterno);
        System.out.println("O subtotal foi de : " +subtotal);
        System.out.println("O Valor da taxa de serviço foi de  : " +taxaServiço+ " e o valor total da conta do hospde foi de :" +totalGeral);


    }
}
