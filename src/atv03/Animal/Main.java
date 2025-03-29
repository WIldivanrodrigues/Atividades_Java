package atv03.Animal;

public class Main {
    public static void main(String[] args) {


        Cavalo cavalo = new Cavalo(1.6f, "Marrom", "Quarto de milha");
        System.out.println("Cavalo criado: Raça = " + cavalo.getRaca() + ", Cor = " + cavalo.getCor() + ", Tamanho = " + cavalo.getTamanho());
        cavalo.comer();
        cavalo.fugir();

        System.out.println();


        Leao leao = new Leao(1.2f, "Amarelo", false);
        System.out.println("Leão criado: Cor = " + leao.getCor() + ", Tamanho = " + leao.getTamanho() + ", Tem juba? " + leao.getJuba());
        leao.comer();
        leao.cacar();
    }
}
