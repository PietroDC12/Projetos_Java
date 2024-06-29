import java.util.Scanner;

public class Comparativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroDigitadoP = 0;
        int numeroDigitadoS = 0;

        System.out.println("Digite o primeiro número");
        numeroDigitadoP = leitura.nextInt();

        System.out.println("Digite o segundo número");
        numeroDigitadoS = leitura.nextInt();

        if (numeroDigitadoP > numeroDigitadoS){
            System.out.println("Primeiro número é maior");
        } else if (numeroDigitadoP < numeroDigitadoS){
            System.out.println("Segundo número é maior");
        } else if (numeroDigitadoP == numeroDigitadoS) {
            System.out.println("São números iguais.");

        }
    }
}


