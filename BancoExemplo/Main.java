package BancoExemplo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        ContaBancaria walyson = new ContaBancaria();
        int choose;
        double valor;

        do{
        System.out.println("\nDigite 1 para consultar\n2 para depositar\n3 para sacar ou 4 para encerrar");
        choose = objScanner.nextInt();
        switch (choose) {
            case 1:
            walyson.consultarSaldo();
                break;
            case 2:
            System.out.println("Digite um valor para depositar:");
            valor = objScanner.nextDouble();
            walyson.depositar(valor);

                break;
            case 3:
            System.out.println("Digite um valor para sacar:");
            valor = objScanner.nextDouble();
            walyson.sacar(valor);
                break;
                
            default:
                break;
        }
    }while(choose != 4);
        
        
    objScanner.close();
    }
    
}
