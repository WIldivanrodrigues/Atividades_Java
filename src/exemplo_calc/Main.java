package exemplo_calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        calculadora.n1 = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        calculadora.n2 = scanner.nextInt();

        calculadora.total = calculadora.n1 + calculadora.n2;

        System.out.println("A soma entre o número " + calculadora.n1 + "e " + calculadora.n2 + " é " + calculadora.total);
        calculadora.total = scanner.nextInt();



    }





}




