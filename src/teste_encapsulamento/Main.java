package teste_encapsulamento;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Insira seu peso: ");
        pessoa.setPeso(sc.nextDouble());

        System.out.println("Insira sua altura: ");
        pessoa.setAltura(sc.nextDouble());


        System.out.println("Resultado do imc: " + pessoa.calcularImc());










    }
}