import java.util.Scanner;

public abstract class PessoaFisica {


    // ----- ATRIBUTOS -----

    Scanner ler = new Scanner(System.in);
    private String nome;
    private String sobrenome;
    private String cpf;
    private String documento;
    private String dataDeNascimento;
    private String endereco;
    private String telefone;


    // ----- GET E SET -----

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public PessoaFisica(String nome, String sobrenome, String cpf, String documento, String dataDeNascimento, String endereco, String telefone) {

    }

    public PessoaFisica() {
    }


    // ----- TO STRING -----

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "Nome ='" + getNome() + '\'' +
                ", Sobrenome ='" + getSobrenome() + '\'' +
                ", CPF ='" + getCpf() + '\'' +
                ", Data de Nascimento ='" + getDataDeNascimento() + '\'' +
                ", Endereço ='" + getEndereco() + '\'' +
                ", Telefone ='" + getTelefone() + '\'' +
                '}';
    }


    // ----- METODOS -----

    public void imprimir() {
        System.out.println(toString());
    }

    public void Perguntas() {
        System.out.println("------------");
        System.out.println("\nPara dar andamento na sua solicitação é obrigatório inserir os seguintes dados:");
        System.out.println();
        System.out.println("Informe seu primeiro nome:");
        nome = ler.nextLine();
        System.out.println("Informe seu sobrenome:");
        sobrenome = ler.nextLine();
        System.out.println("Informe seu CPF:");
        cpf = ler.nextLine();
        System.out.println("Informe sua data de nascimento:");
        dataDeNascimento = ler.nextLine();
        System.out.println("Informe seu endereco:");
        endereco = ler.nextLine();
        System.out.println("Informe seu telefone com DDD:");
        telefone = ler.nextLine();
    }
}
