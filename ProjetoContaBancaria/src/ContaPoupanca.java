import java.util.Scanner;

public class ContaPoupanca extends PessoaFisica{


    // ----- ATRIBUTOS -----

    Scanner ler = new Scanner(System.in);
    private int conta = 12;
    private String numConta = "3456";
    private String operacao = "018";
    private String agencia = "09";
    private double saldo = 2000;
    private double contaInvestimento;


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

    public double getContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(double contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }


    // ----- TO STRING -----

    @Override
    public String toString() {
        return super.toString() +
                "conta=" + conta +
                ", numConta='" + numConta + '\'' +
                ", operacao='" + operacao + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", contaInvestimento=" + contaInvestimento +
                '}';
    }


    // ----- METODOS -----

    public void imprimirCP(){
        System.out.println(toString());
    }

    public void verSaldo() {
        System.out.println("\nSeu saldo atual é R$" + getSaldo());
    }

    public void saque(double saqueValor) {
        if (getSaldo() < 0 || saqueValor > getSaldo())
            System.out.println("\nVocê não tem saldo suficiente para raealizar a operação. ");
        else
            setSaldo(getSaldo() - saqueValor);
        this.saldo = saqueValor - saldo;
        System.out.println("\nSaque realizado no valor de R$" + saqueValor);
    }

    public void depositar(double depositarValor) {
        setSaldo(depositarValor + getSaldo());
        System.out.println("\nO valor depositado foi R$" + depositarValor);
    }

    public void transferir(double transferencia) {
        if (getSaldo() < 0 || transferencia > getSaldo())
            System.out.println("\nVocê não tem saldo suficiente para raealizar a operação. ");
        else
            setSaldo(getSaldo() - transferencia);
        System.out.println("\nVocê transferiu R$" + transferencia);
    }

    public void investir(double investimento) {
        setSaldo(getSaldo() - investimento);
        double investimentoTotal = investimento * 0.05;
        setContaInvestimento(getContaInvestimento() + investimento + investimentoTotal);
        System.out.println("\nVocê investiu R$" + investimento + "e irá ter uma rentabilidade de R$" +
                investimentoTotal);
    }

    public void operacao() {
        System.out.println("------------");
        System.out.println("Qual operacao deseja realizar ?");
        System.out.println("------------");
        System.out.println("[1] Saque");
        System.out.println("[2] Depositar");
        System.out.println("[3] Transferencia");
        System.out.println("[4] Investimento");
        System.out.println("[5] Ver saldo");
        System.out.println("[6] Voltar");
        System.out.println("[7] Sair");
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
                System.out.println("\nInsira o valor que deseja sacar:");
                double saqueValor = ler.nextDouble();
                saque(saqueValor);
                break;

            case 2:
                System.out.println("Deposito");
                System.out.println("\nInsira o valor que deseja depositar:");
                double depositarValor = ler.nextDouble();
                depositar(depositarValor);
                break;

            case 3:
                System.out.println("Transferencia");
                System.out.println("\nInsira o valor que deseja transferir:");
                double transferencia = ler.nextDouble();
                transferir(transferencia);
                break;

            case 4:
                System.out.println("Investimento");
                System.out.println("\nInsira o valor que deseja Investir:");
                double investimento = ler.nextDouble();
                investir(investimento);
                break;

            case 5:
                verSaldo();
                break;

            case 6:


            case 7:
                System.exit(0);

            default:
                System.out.println("\nSELECIONE UMA OPÇÃO VALIDA!!!");
                operacao();
        }
    }
}
