
package calc_medias.gerenciador_de_estoque;

public class Produto {
    private String nome = "";
    private int QuantidadeProduto;
    private double precoProduto;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: Nome inválido!");
        }
    }


    public int getQuantidadeProduto() {
        return QuantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        if (quantidadeProduto >= 0) {
            this.QuantidadeProduto = quantidadeProduto;
        } else {
            System.out.println("Erro: Quantidade não pode ser negativa!");
        }
    }


    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        if (precoProduto > 0) {
            this.precoProduto = precoProduto;
        } else {
            System.out.println("Erro: O preço deve ser maior que zero!");
        }
    }


    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.QuantidadeProduto += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Erro: Quantidade inválida para adicionar ao estoque!");
        }
    }


    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.QuantidadeProduto) {
            this.QuantidadeProduto -= quantidade;
            System.out.println(quantidade + " unidades vendidas.");
        } else {
            System.out.println("Erro: Quantidade inválida ou estoque insuficiente.");
        }
    }


    public void exibirEstoque() {
        System.out.println("\n=== Estoque Atual ===");
        System.out.println("Produto: " + this.getNome());
        System.out.println("Valor unitário: R$ " + this.getPrecoProduto());
        System.out.println("Unidades disponíveis: " + this.getQuantidadeProduto());
    }
}


