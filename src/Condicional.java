public class Condicional {
    public static void main(String[] args) {

        int ano = 2015;
        boolean incluidoNoPlano = false;
        double notaFilme = 9.8;
        String tipoPlano = "basic";

        if (ano >= 2023){

        System.out.println("Novos sucessos.");
        } else {
            System.out.println("Já são sucesso.");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Visualização permitida.");
        } else {
            System.out.println("Altere seu plano.");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Visualização permitida.");
        } else {
            System.out.println("Altere seu plano.");
        }
    }
}
