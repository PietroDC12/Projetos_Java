import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        float saldo = 0;
        float pagamento = 0;
        float soma = 0;
        String nomeCliente;
        String tipoConta;

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite seu modelo de conta: ");
        tipoConta = scanner.nextLine();

        System.out.println("-----Menu-----");
        System.out.println("Cliente: "+ nomeCliente);
        System.out.println("Tipo de Conta: "+ tipoConta);
        System.out.println("Saldo: "+saldo);
        System.out.println("--------------");

        while (escolha != 4) {
            System.out.println("1. Mostrar Saldo.");
            System.out.println("2. Realizar pagamento.");
            System.out.println("3. Adicionar saldo.");
            System.out.println("4. Sair.");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("O saldo atual da conta é de: "+saldo);
            } else if (escolha == 2) {
                System.out.print("Insira o valor para pagamento: ");
                pagamento = scanner.nextFloat();
                if (pagamento > saldo){
                    System.out.print("Saldo insuficiente");
                } else if (pagamento <= saldo) {
                    saldo = saldo - pagamento;
                    System.out.print("Seu saldo atual é de: "+saldo);
                }

            } else if (escolha == 3) {
                System.out.print("Insira o valor para pagamento: ");
                soma = scanner.nextFloat();
                saldo = saldo + soma;

                System.out.println("Seu saldo atualizado é: "+saldo);
                System.out.println("Opção inválida!");
            }

        }
        }
}

