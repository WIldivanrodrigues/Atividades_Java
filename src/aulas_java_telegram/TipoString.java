package aulas_java_telegram;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá Will.".charAt(1));
        //Verificando o index da String.
        String s = "Bom dia.";
        int idade = 26;
        double salario = 3.000;

        System.out.println(s.length()); // length é utilizado para demonstrar a quantidade de index da variável.
        System.out.println(s.equalsIgnoreCase("BOA TARDE"));
        System.out.println("Olá " + s +"você tem " + idade + " anos e recebe R$: " + salario + " reais de salário.");






    }
}
