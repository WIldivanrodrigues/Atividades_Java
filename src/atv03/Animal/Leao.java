package atv03.Animal;

public class Leao extends Animal {

    private boolean juba;


    public Leao() {}


    public Leao(float tamanho, String cor, boolean juba) {
        super(tamanho, cor);
        this.juba = juba;
    }

    public void cacar() {
        if (juba) {
            System.out.println("Estou caçando!");
        } else {
            System.out.println("Sou filhote.");
        }
    }

    // Getters e Setters
    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public boolean getJuba() {
        return juba;
    }
}
