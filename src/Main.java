//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Projeto Screen Match");

        System.out.println("Filme: Divertidamente 2");

        int ano = 2024;

        System.out.println("Ano de lançamento: " + ano);

        boolean incluidoNoPlano = false;

        double notaFilme = 9.8;
        System.out.println("Nota do filme: " + notaFilme);

        double mediaNota = (9.8 + 6.3 + 7.7) / 3;

        System.out.println(mediaNota);

        String sinopse;
        sinopse = "Filme sobre as emoções de uma garota de 14 anos.";

        System.out.println(sinopse);

        int classificacao = (int) (mediaNota /2);

        System.out.printf("Avaliado em %d estrelas%n", classificacao);
    }
}