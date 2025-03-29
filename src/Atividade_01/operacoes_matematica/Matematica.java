package Atividade_01.operacoes_matematica;


public class Matematica {

    public double somar (double num_1, double num_2 ){
    return num_1 + num_2;
    }
    public double subtrair (double num_1, double num_2){
        return num_1 - num_2;
    }
    public double dividir (double num_1, double num_2){
        if (num_2 == 0){
            System.out.println("Erro: divisão por zero, reinicie o programa.");
            return Double.NaN;
        }
        return num_1 / num_2;
    }
    public double multiplicar(double num_1, double num_2){
        return num_1 * num_2;
    }

}
