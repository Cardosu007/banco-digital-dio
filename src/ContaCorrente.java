import java.util.Scanner;

public class ContaCorrente extends Conta {

    private Scanner scanner;

    public ContaCorrente() {
        this.scanner = new Scanner(System.in);
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void nome(String nome) {
        this.nome("");
    }

    public void solicitarOperacao() {
        System.out.println("Escolha uma operação:");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Transferir");

        int opcao = scanner.nextInt();
        double valor;

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor a sacar:");
                valor = scanner.nextDouble();
                sacar(valor);
                break;
            case 2:
                System.out.println("Digite o valor a depositar:");
                valor = scanner.nextDouble();
                depositar(valor);
                break;
            case 3:
                System.out.println("Digite o valor a transferir:");
                valor = scanner.nextDouble();
                System.out.println("Digite o número da conta destino:");
                int numeroContaDestino = scanner.nextInt();
                // Aqui você precisaria acessar a conta destino com base no número informado
                // Exemplo: IConta contaDestino = buscarConta(numeroContaDestino);
                // transferir(valor, contaDestino);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // Método para fechar o scanner
    public void fecharScanner() {
        scanner.close();
    }


}