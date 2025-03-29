package calc_medias.gerenciador_de_estoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("=== Gerenciador de Estoque ===");


        System.out.print("Insira o nome do produto: ");
        produto.setNome(teclado.nextLine());


        System.out.print("Insira o preço do produto: ");
        produto.setPrecoProduto(Double.parseDouble(teclado.nextLine()));

        System.out.print("Insira a quantidade de produtos disponíveis: ");
        produto.setQuantidadeProduto(teclado.nextInt());
        teclado.nextLine();


        while (true) {
            System.out.println("\n======== Menu ========");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Exibir estoque");
            System.out.println("4 - Alterar preço");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade que será adicionada: ");
                    int adicionar = teclado.nextInt();
                    produto.adicionarEstoque(adicionar);
                    break;

                case 2:
                    System.out.print("Insira a quantidade que deseja vender: ");
                    int vender = teclado.nextInt();
                    produto.vender(vender);
                    break;

                case 3:
                    produto.exibirEstoque();
                    break;

                case 4:
                    System.out.print("Insira o novo preço do produto: ");
                    double novoPreco = teclado.nextDouble();
                    produto.setPrecoProduto(novoPreco);
                    System.out.println("Preço atualizado com sucesso!");
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    teclado.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
