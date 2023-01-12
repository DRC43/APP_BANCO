import java.util.Scanner;

public abstract class PessoaJuridica {
    Scanner ler = new Scanner(System.in);
    private String nome;
    private String sobrenome;
    private String telefone;
    private String CNPJ;
    private String faturamento;
    private String dataDeNascimento;
    private String endereco;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
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

    public PessoaJuridica(String CNPJ, String endereco, String telefone, String faturamento, String dataDeNascimento, String nome, String sobrenome) {

    }

    public PessoaJuridica(){
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", faturamento='" + faturamento + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public void Perguntas() {
        System.out.println("------------");
        System.out.println("\nPara dar andamento na sua solicitação é obrigatório inserir os seguintes dados:");
        System.out.println();
        System.out.println("Informe seu primeiro nome:");
        nome = ler.nextLine();
        System.out.println("Informe seu sobrenome:");
        sobrenome = ler.nextLine();
        System.out.println("Informe seu CNPJ:");
        CNPJ = ler.nextLine();
        System.out.println("Informe sua data de nascimento:");
        dataDeNascimento = ler.nextLine();
        System.out.println("Informe seu endereço:");
        endereco = ler.nextLine();
        System.out.println("Informe seu telefone com DDD:");
        telefone = ler.nextLine();
    }
}
