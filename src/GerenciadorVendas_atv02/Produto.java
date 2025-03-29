package GerenciadorVendas_atv02;



public class Produto {
    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantStoque;


    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantStoque ){
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantStoque = quantStoque;
    }

    public String exibirDetalhes() {
        return "Código: " + codigo + ", Nome: " + nome + ", Tamanho/Peso: " + tamanhoPeso +
                ", Cor: " + cor + ", Valor: R$" + String.format("%.2f", valor) +
                ", Quantidade: " + quantStoque;
    }

    public String vender (int quantidade, String formaPagamento, double valorPago){
        if (quantidade > quantStoque){
            return "Estoque insuficiente.";
        }

        double valorTotal = this.valor *quantidade;

        if (formaPagamento.equals("pix") || formaPagamento.equals("especie") || formaPagamento.equals("transferencia")
                || formaPagamento.equals("debito")) {
            valorTotal *= 0.95;

        } else if (formaPagamento.equals("credito")) {
            int parcelas = 3;
            double parcelamento = valorTotal / parcelas;
            System.out.println("PAgamento parcelado em " + parcelas + "x de R$: " +
                    String.format("%.2f", parcelamento) + " Sem juros.");
        }
        if (formaPagamento.equals("especie")){
            if (valorPago < valorTotal){
                return "valor insuficiente.";
            }
          double troco = valorPago - valorTotal;
            System.out.println("Seu troco: R$" + String.format("%.2f", troco));

        }
        this.quantStoque -= quantidade;
        return "Venda realizada!\n Valor final: R$" + String.format("%.2f", valorTotal) + " ." +
                "\n estoque atualizado: "+this.quantStoque + " Unidades.";

    }
    public String adicionarEstoque (int quantStoque){
        this.quantStoque += quantStoque;
        return "Novo Estoque: " + this.quantStoque + " Unidades.";

    }
}

