package calc_medias;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(teclado.nextLine());
        System.out.print("Digite a primeira nota: ");
        aluno.setNota1(teclado.nextDouble());
        System.out.print("Digite a segunda nota: ");
        aluno.setNota2(teclado.nextDouble());
        System.out.print("Digite a terceira nota: ");
        aluno.setNota3(teclado.nextDouble());

        double media = aluno.calcularMedia();
        String situacao = aluno.verificarSituacao();

        System.out.println("\nAluno: " + aluno.getNome());
        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Situação: " + situacao);

        teclado.close();
    }
}