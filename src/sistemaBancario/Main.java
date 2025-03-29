package sistemaBancario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria();
        ContaBancaria contaDestino = new ContaBancaria();

        while (true) {
            System.out.println("\n=-=-=-=-=-=-=- Banco Santander -=-=-=-=-=-=-");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Sacar valor da conta");
            System.out.println("4 - Transferir valor");
            System.out.println("5 - Sair");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Escolha a opção desejada: ");


            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é de R$: " + minhaConta.getConsultSaldo());
                    break;

                case 2:
                    System.out.print("Insira o valor a ser depositado: ");
                    double deposito = teclado.nextDouble();
                    minhaConta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Insira o valor que deseja sacar: ");
                    double saque = teclado.nextDouble();
                    minhaConta.sacar(saque);
                    break;

                case 4:
                    System.out.print("Insira o valor a ser transferido: ");
                    double transferencia = teclado.nextDouble();
                    minhaConta.transferir(contaDestino, transferencia);
                    break;

                case 5:
                    System.out.println("=-=-Santander agradece a preferência-=-=");
                    teclado.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
