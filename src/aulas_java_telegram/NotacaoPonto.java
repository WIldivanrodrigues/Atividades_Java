package aulas_java_telegram;

public class NotacaoPonto {
    public static void main(String[] args) {


        String s = "Bom dia Will!";

        s = s.replace("Will", "Carol");  // Altera  o valor da String.
        s = s.toUpperCase();  //deixa todas as Strings em maiúsculo.
        s = s.concat("##"); //concatena outra String a variável.

        System.out.println(s);

        String y = "Bom dia will! ".replace("will",  "Carol");
        System.out.println(y);


        //Tipos primitivos não tem o operador ".".




    }
}
