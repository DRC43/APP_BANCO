import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaInvestimentoPJ INPJ = new ContaInvestimentoPJ();
        ContaInvestimentoPF INPF = new ContaInvestimentoPF();
        ContaCorrentePJ CONPJ = new ContaCorrentePJ();
        ContaCorrentePF CONPF = new ContaCorrentePF();
        ContaPoupanca POU = new ContaPoupanca();

        do {
            try {
                System.out.println("\n----------*** SEJA BEM VINDO AO BANCO START TECH ***----------");
                System.out.println();
                System.out.println("[1] Pessoa Física");
                System.out.println("[2] Pessoa Jurídica");
                System.out.println("[3] Sair");
                System.out.println("\nEscolha qual tipo de conta você deseja atendimento: ");
                int Dados = ler.nextInt();

                switch (Dados) {
                    case 1:
                        POU.Perguntas();
                        System.out.println("\nDigite SIM para acessar o menu da conta:");
                        String letra = ler.next();
                        try {
                            if (letra.equalsIgnoreCase("Sim")) {
                                POU.imprimir();
                                System.out.println("\n________________________________________");
                                System.out.println("[1] Conta Corrente");
                                System.out.println("[2] Conta Poupança");
                                System.out.println("[3] Conta Investimento");
                                System.out.println("[4] Sair");
                                System.out.println("\nEscolha qual operação você deseja realizar (PF):");
                                int PF = ler.nextInt();

                                switch (PF) {
                                    case 1:
                                        CONPF.imprimir();
                                        CONPF.operacao();
                                        CONPF.realizar();
                                        break;
                                    case 2:
                                        POU.imprimirCP();
                                        POU.operacao();
                                        POU.realizar();
                                        break;
                                    case 3:
                                        INPF.imprimirCIPF();
                                        INPF.operacao();
                                        INPF.realizar();
                                        break;
                                    case 4:
                                        System.exit(0);

                                    default:
                                        System.out.println("\nSELECIONE UMA OPÇÃO VALIDA!!!");
                                }
                            } else if (letra.equalsIgnoreCase("Nao")) {
                                System.exit(0);
                            }
                        } catch (Exception e) {
                        }

                    case 2:
                        INPJ.Perguntas();
                        System.out.println("\nDigite Sim para acessar o menu da conta:");
                        String letra1 = ler.next();
                        try {
                            if (letra1.equalsIgnoreCase("Sim")) {
                                System.out.println("\n________________________________________");
                                System.out.println("[1] Conta Corrente");
                                System.out.println("[2] Conta Investimento");
                                System.out.println("[3] Sair");
                                System.out.println("\nEscolha qual operação você deseja realizar (PJ):");
                                int PJ = ler.nextInt();

                                switch (PJ) {
                                    case 1:
                                        CONPJ.imprimirCCPJ();
                                        CONPJ.operacao();
                                        CONPJ.realizar();
                                        break;
                                    case 2:
                                        INPJ.imprimirCIPJ();
                                        INPJ.operacao();
                                        INPJ.realizar();
                                        break;
                                    case 3:
                                        System.exit(0);
                                    default:
                                        System.out.println("\nSELECIONE UMA OPÇÃO VALIDA!!!");
                                }
                            } else if (letra1.equalsIgnoreCase("Nao")) {
                                System.exit(0);
                            }
                        } catch (Exception ignored) {
                        }
                }
            } catch (Exception ignored) {
            }

            System.out.println("\nVocê deseja realizar mais alguma operação ? (S/N)");

        } while (ler.next().equalsIgnoreCase("S"));
    }
}
