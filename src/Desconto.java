public class Desconto {
    public static void main(String[] args) {
        double precoProduto = 7.50;
        double desconto = 0.10;

        double valorDesconto = precoProduto * (-desconto);
        double valorFinal = precoProduto + valorDesconto;

        System.out.println("Valor com desconto: "+valorFinal);
    }
}
