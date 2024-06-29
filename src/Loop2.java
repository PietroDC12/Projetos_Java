import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double media = 0;
        int totalNotas = 0;


        while (avaliacao != -1){
            System.out.println("Digite sua nota (Para encerrar -1): ");
            avaliacao = leitura.nextDouble();
            // é o mesmo que media = media + avaliacao
            if (avaliacao != -1) {
                media += avaliacao;
                totalNotas++;
            }
        }
        System.out.println("A média é: "+media/totalNotas);

    }
}
