import java.time.LocalDate;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private String email;
    private String cpf;
    private long telefone;
    private LocalDate dataNascimento;
    public Scanner scanner;

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
        telefone = scanner.nextLong();

        System.out.println("Data de Nascimento (YYYY-MM-DD): ");
        String dataNascimentoStr = scanner.next();
        dataNascimento = LocalDate.parse(dataNascimentoStr);


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

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}