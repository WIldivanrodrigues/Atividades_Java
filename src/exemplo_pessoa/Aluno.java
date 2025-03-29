package exemplo_pessoa;

public class Aluno extends Pessoa {
    private  int matricula;
    private double nota_1, nota_2, nota_3, media;


    public Aluno(String nome, int matricula, double nota_1, double nota_2, double nota_3, double media) {
        super(nome);
        this.matricula = matricula;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
        this.media = media;
    }

    public Aluno(int matricula, double nota_1, double nota_2, double nota_3, double media) {
        this.matricula = matricula;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
        this.media = media;
    }

    public Aluno(String nome){
        super(nome);
    }

    public Aluno(){


    }


    public void calcularMedia(){

        media = (nota_1 + nota_2 + nota_3)/3;
        System.out.printf("%.2f", media);

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota_1() {
        return nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_2() {
        return nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    public double getNota_3() {
        return nota_3;
    }

    public void setNota_3(double nota_3) {
        this.nota_3 = nota_3;



    }
}
