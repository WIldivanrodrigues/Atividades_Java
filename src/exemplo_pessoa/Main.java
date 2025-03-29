package exemplo_pessoa;



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno("joão");
        Aluno aluno3 = new Aluno("will");
        Aluno aluno4 = new Aluno();
        Professor professor = new Professor();



        System.out.println("Nome: ");
        aluno.setNome(sc.next());





        System.out.println("informe sua idade: ");
        aluno.setIdade(sc.nextInt());

        System.out.println("Informe sua altura: ");
        aluno.setAltura(sc.nextDouble());

        aluno.aniversario();
        System.out.println();

        System.out.println("você se chama " + aluno.getNome() + ", você tem "+ aluno.getIdade() +"anos "+ "e "+ "você tem "+ aluno.getAltura() + " de altura." );

        int opcao = Integer.parseInt(sc.nextLine());





        System.out.println("Insira sua primeira nota: ");
        aluno.setNota_1(sc.nextDouble());

        System.out.println("Insira sua segunda nota: ");
        aluno.setNota_2(sc.nextDouble());

        System.out.println("Insira sua terceira nota: ");
        aluno.setNota_3(sc.nextDouble());
        System.out.print("Baseados em suas notas, sua média é: ");
        aluno.calcularMedia();






    }
}





