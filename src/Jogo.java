import java.util.Scanner;
import java.util.Random;

public class Jogo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroEspecial = new Random().nextInt(100);
        int tentativa = 0;
        int tentativas = 0;


        while (tentativas < 5) {
            System.out.println("Digite um número: ");
            tentativa = leitura.nextInt();
            tentativas++;

            if (tentativa == numeroEspecial) {
                System.out.println("Número correto. ");
                break;
            } else if (tentativa < numeroEspecial) {
                System.out.println("O número digitado é menor ");
            } else if (tentativa > numeroEspecial) {
                System.out.println("O número digitado é maior ");
            }
            if (tentativas == 5 && tentativa != numeroEspecial) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroEspecial);
            }
        }

    }
}


