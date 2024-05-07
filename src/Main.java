import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ContaCorrente contaCorrente = new ContaCorrente();

        //contaCorrente.solicitarOperacao();

        Cliente cliente = new Cliente();

        cliente.cadastrarCliente();



        Cliente [] clientes = new Cliente[20];

        clientes[1] = new Cliente("Walter Ferreira Cardoso", "cardosu7@gmail.com", "123456798-85", 393914200, 19940421);
        clientes[2] = new Cliente("Ana Lima", "ana@gmail.com", "98746321-85", 39521485, 19960510);
        clientes[3] = new Cliente("Renan Costa", "renan@gmail.com", "985478541-85", 32547856, 19980824);

        System.out.println(clientes[1]);
        System.out.println(clientes[2]);
        System.out.println(clientes[3]);


    }
}