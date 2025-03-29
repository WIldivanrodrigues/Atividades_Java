package atv03;

public class Cavalo extends Animal{

    public Cavalo() {

    }

    private String raca;

    public void fugir(){
        System.out.println("Estou fugindo!");
    }
    public void SetRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }

}