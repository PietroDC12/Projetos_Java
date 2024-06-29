import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroDigitado = 0;

        System.out.println("Digite um número");
        numeroDigitado = leitura.nextInt();

        if (numeroDigitado >= 0){
            System.out.println("Número positivo");
        } else if (numeroDigitado < 0){
            System.out.println("Número negativo");
        }
    }
}
