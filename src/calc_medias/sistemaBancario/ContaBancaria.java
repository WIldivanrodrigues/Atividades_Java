package calc_medias.sistemaBancario;

public class ContaBancaria {

    private double consultSaldo;

    public ContaBancaria(){
        this.consultSaldo = 0.0;
    }

    public double getConsultSaldo(){
        return consultSaldo;
    }

    public void depositar (double valor){
        if (valor > 0){
             consultSaldo = valor;
            System.out.println("Depósito do R$: " + valor + "Realizado com sucesso!");
        }else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    public boolean sacar(double valor){
        if (valor > 0 && valor <= consultSaldo){
            consultSaldo -= valor;
            System.out.println("Saque de R$: " + valor + "realizado com sucesso!");
            return true;
        }else{
            System.out.println("Saldo insuficiente em conta.");
            return false;
        }
    }

    public boolean transferir (ContaBancaria Destino, double valor) {
        if (this.sacar(valor)) {
            Destino.depositar(valor);
            System.out.println("Transferência de R$: " + valor + "realizada com sucesso!");
            return true;
        } else {
            System.out.println("Transferência não realizada.");
            return false;


        }
    }
}
