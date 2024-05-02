package aprendendoob;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        Calculadora calcular = new Calculadora();


        System.out.println("Digite o valor numero um :");
        int num1 = obj.nextInt();
        System.out.println("Digite o valor numero dois :");        
        int num2 = obj.nextInt();

        calcular.somar(num1, num2);
        obj.close();
    }
}