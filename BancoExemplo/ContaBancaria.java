package BancoExemplo;

public class ContaBancaria {
    
    int numero;
    double saldo;

    void depositar(double valor){
        try{
            saldo = saldo + valor;
        }
        catch(Exception e){
            System.out.println("Erro ao depositar saldo.");
        }


    }

    void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
        }
        else{
            saldo = saldo - valor;
        }


    }

    void consultarSaldo(){
        System.out.println("Saldo atual : " + saldo);
    }




}
