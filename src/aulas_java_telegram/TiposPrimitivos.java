package aulas_java_telegram;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionário:

        //Tipos numéricos inteiros:

        byte anosdeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789; //utilizando o Int.
        long pontosAcumulados = 3_234_845_223L;   //utilizando o long.

    //Tipos numéricos reais:

        float salario = 11_445.44f;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano:

        boolean estaDeFerias = false; //Ou true;

        //tipo caraxctere:
        char status = 'A'; //ativo

        System.out.println("Dias de empresa: " + anosdeEmpresa * 365);

        System.out.println("Quantidade de viagens: " + numerosDeVoos /2);  //Divide-se por 2, representando ida e volta.

        System.out.println("Pontos em milhas acumulados: " + pontosAcumulados / vendasAcumuladas);

        System.out.println( id + ": ganha -> " + salario + " de salário mensalmente.");
        System.out.println("Está de férias ? " + estaDeFerias);
        System.out.println("Status: " + status);


    }
}
