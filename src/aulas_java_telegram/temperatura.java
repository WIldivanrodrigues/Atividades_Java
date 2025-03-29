package aulas_java_telegram;

public class temperatura {
    public static void main(String[] args) {

        //(°f - 32) x 5/9 = °c

        final double FATOR = 5.0/9.0;
        final int AJUSTE = 32;

        double fahrenheit = 90;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println(fahrenheit + "°f, convertido para celsius é: " + celsius + "°c.");









    }
}
