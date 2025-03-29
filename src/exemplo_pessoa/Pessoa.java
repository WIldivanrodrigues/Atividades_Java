
package exemplo_pessoa;

public class Pessoa {

    protected String nome;

    protected int idade;

    protected double altura;


    public Pessoa(String nome){
        this.nome = nome;
    }



    public  Pessoa() {
    }

    public void aniversario(){
        idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}





