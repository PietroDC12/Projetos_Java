import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroDigitado = 0;
        int contador = 1;

        System.out.println("Digite um número para exibir a tabuada de 1 a 10: ");
        numeroDigitado = leitura.nextInt();

        while (contador < 11){
            System.out.println("Tabuada: "+numeroDigitado*contador);
            contador++;

        }
    }
}
