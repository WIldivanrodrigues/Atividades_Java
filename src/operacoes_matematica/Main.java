package operacoes_matematica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Matematica matematica = new Matematica();

        while (true) {
            System.out.println("Calculadora de operações.");
            System.out.println("==========================");
            System.out.println("Escolha uma operação:");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - dividir");
            System.out.println("4 - multiplicar");
            System.out.println("5 - sair");
            System.out.println("==========================");
            System.out.println("digite o número da opção desejada: ");


            int opcao;

            try {
                opcao = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("erro: Digite um número válido!");
                continue;
            }
            if (opcao == 5) {
                System.out.println("Encerrando o programa...");
                break;
            }
            if (opcao < 1 || opcao > 4) {
                System.out.println("Erro: Escolha uma opção válida!");
                continue;
            }
            try {
                System.out.println("Insira o primeiro número: ");
                double num_1 = Double.parseDouble(teclado.nextLine());

                System.out.println("insira o segundo número: ");
                double num_2 = Double.parseDouble(teclado.nextLine());

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = matematica.somar(num_1, num_2);
                        break;
                    case 2:
                        resultado = matematica.subtrair(num_1, num_2);
                        break;
                    case 3:
                        resultado = matematica.dividir(num_1, num_2);
                        break;
                    case 4:
                        resultado = matematica.multiplicar(num_1, num_2);
                        break;
                }
                System.out.println("Resultado da operação: " + resultado);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida, digite apenas números.");
            }
        }
        teclado.close();



    }
}
