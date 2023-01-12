import java.util.Scanner;

public class ContaCorrentePJ extends PessoaJuridica {


    // ----- ATRIBUTOS -----

    Scanner ler = new Scanner(System.in);
    private int conta = 12;
    private String numConta = "4321";
    private String operacao = "014";
    private String agencia = "09";
    private double saldo = 10900;


   // ----- GET E SET -----

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    // ----- CONSTRUCTOR -----

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    // ----- TO STRING -----

    @Override
    public String toString() {
        return "ContaInvestimentoPJ{" +
                "conta=" + conta +
                ", numConta='" + numConta + '\'' +
                ", operacao='" + operacao + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }


    // ----- METODOS -----

    public void imprimirCCPJ() {
        System.out.println(toString());
    }

    public void verSaldo() {
        System.out.println("Seu saldo atual é: " + getSaldo());
    }

    public void saque(double saqueValor) {
        if (getSaldo() < 0 || saqueValor > getSaldo())
            System.out.println("Você não tem saldo suficiente para raealizar a operação. ");
        else
            setSaldo(getSaldo() - saqueValor);
        System.out.println("Saque realizado no valor de R$" + saqueValor);
    }

    public void depositar(double depositarValor) {
        setSaldo(depositarValor + getSaldo());
        System.out.println("O valor depositado foi R$" + depositarValor);
    }

    public void transferir(double transferencia) {
        if (getSaldo() < 0 || transferencia > getSaldo())
            System.out.println("Você não tem saldo suficiente para raealizar a operação. ");
        else
            setSaldo(getSaldo() - transferencia);
        System.out.println("Você transferiu R$" + transferencia);
    }

    public void operacao() {
        System.out.println("------------");
        System.out.println("Qual operação você deseja realizar ?");
        System.out.println("------------");
        System.out.println("[1] Saque");
        System.out.println("[2] Deposito");
        System.out.println("[3] Transferencia");
        System.out.println("[4] Ver saldo");
        System.out.println("[5] Voltar");
        System.out.println("[6] Sair");
        System.out.println("------------");
        System.out.println();
        System.out.println("\nEscolha a operação desejada:");
        realizar();
    }

    public void realizar() {
        int operacao = ler.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Saque");
                System.out.println("Insira o valor que deseja sacar:");
                double saqueValor = ler.nextDouble();
                saque(saqueValor);
                break;

            case 2:
                System.out.println("Deposito");
                System.out.println("Insira o valor que deseja depositar:");
                double depositarValor = ler.nextDouble();
                depositar(depositarValor);
                break;

            case 3:
                System.out.println("Transferencia");
                System.out.println("Insira o valor que deseja transferir:");
                double transferencia = ler.nextDouble();
                transferir(transferencia);
                break;

            case 4:
                verSaldo();
                break;

            case 5:


            case 6:
                System.exit(0);

            default:
                System.out.println("\nSELECIONE UMA OPÇÃO VALIDA!!!");
                operacao();
        }
    }
}
