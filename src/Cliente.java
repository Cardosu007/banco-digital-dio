import java.util.Scanner;

public class Cliente {

    private String nome;
    private String email;
    private String cpf;
    private int telefone;
    private int dataNascimento;
    public Scanner scanner;

    public Cliente(String nome, String email, String cpf, int telefone, int dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public Cliente(){
        this.scanner = new Scanner(System.in);
    }


    public void nomeCliente(String nome){
        System.out.println("Nome Completo: ");
    }

    public void emailCliente(){
        System.out.println("Email: ");
    }

    public void cpfCliente(){
        System.out.println("CPF: ");
    }

    public void telefoneCliente(){
        System.out.println("Telefone: ");
    }

    public void dataNasceimentoCliente(){
        System.out.println("Data de Nascimento: ");
    }


    public void cadastrarCliente(){
        System.out.println("--------------------------------------");
        System.out.println("- CADASTRO CLIENTE BANCO DIGITAL DIO -");
        System.out.println("--------------------------------------");
        System.out.println("---- APERTE ENTER PARA CONTINUAR! ----");

        scanner.nextLine();

        System.out.println("Nome Completo: ");
        nome = scanner.nextLine();

        System.out.println("Email: ");
        email = scanner.nextLine();

        System.out.println("CPF: ");
        cpf = scanner.nextLine();

        System.out.println("Telefone: ");
        telefone = scanner.nextInt();

        System.out.println("Data de Nascimento (YYYYMMDD): ");
        dataNascimento = scanner.nextInt();


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "- CLIENTE BANCO DIGITAL DIO - \n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone: " + telefone + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "-----------------------------";

    }
}