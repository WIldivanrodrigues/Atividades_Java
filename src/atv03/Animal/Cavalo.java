package atv03.Animal;

public class Cavalo extends Animal {

    private String raca;


    public Cavalo() {}


    public Cavalo(float tamanho, String cor, String raca) {
        super(tamanho, cor);
        this.raca = raca;
    }

    public void fugir() {
        System.out.println("Está fugindo!");
    }

  
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
}
