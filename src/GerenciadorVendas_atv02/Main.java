package GerenciadorVendas_atv02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto(1, "notebook", "2kg", "prata",
                2.500, 15);

        while (true){
            System.out.println("$-=-Host tech estoque-=-$");
            System.out.println("1 - Exibir detalhes do produto.");
            System.out.println("2 - Vender produto.");
            System.out.println("3 - Adicionar estoque");
            System.out.println("4 - Sair do Estoque");
            System.out.println("Escolha uma opção: ");

            int opcao = teclado.nextInt();

            switch (opcao){

                case 1:
                    System.out.println(produto.exibirDetalhes());
                    break;

                case 2:
                    System.out.println("Quantas unidades: ");
                    int quantidade = teclado.nextInt();
                    System.out.println("Forma de pagamento (pix, espécie, transferência, débito, crédito: ");
                    String formaPagamento = teclado.next();
                    double valorPago = 0;
                    if (formaPagamento.equals("espécie")){
                        System.out.println("Valor pago: ");
                        valorPago = teclado.nextDouble();
                    }
                    System.out.println(produto.vender(quantidade, formaPagamento, valorPago));
                    break;

                case 3:
                    System.out.println("Unidades a adicionar ao estoque: ");
                    int quantAdicionar = teclado.nextInt();
                    System.out.println(produto.adicionarEstoque(quantAdicionar));
                    break;

                case 4:
                    System.out.println("Saindo do estoque...");
                    teclado.close();
                    return;

                default:
                    System.out.println("Opção inválida!");




            }
        }
    }
}
