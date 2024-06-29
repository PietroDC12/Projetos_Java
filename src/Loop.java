import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double media = 0;


        for (int i=0; i < 3; i++){
            System.out.println("Digite sua nota");
            avaliacao = leitura.nextDouble();
            // é o mesmo que media = media + avaliacao
            media += avaliacao;
        }
        System.out.println("A média é: "+media/3);

    }
}
