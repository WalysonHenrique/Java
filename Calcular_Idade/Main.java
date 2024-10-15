import java.util.Scanner;


public class Main {

  public static void main(String[] args){

  Scanner objScanner = new Scanner(System.in);
  System.out.println("Digite o ano do seu nascimento : ");
  Integer day = objScanner.nextInt();
  Calcular objCalcular = new Calcular(day);

  objCalcular.Math(day);
  System.out.println("Voce esta vivo a " + objCalcular.days + " dias !");

  }
  
}
