package atv03;

public class Leao extends Animal {

    private boolean juba;

    public void carcar(){

        if (juba == true){
            System.out.println("Estou caçando!");
        }else{
            System.out.println("Sou filhote.");
        }

        }
    public void setJuba(boolean juba){
        this.juba = juba;
    }
    public boolean getJuba(){
        return juba;
    }











}
