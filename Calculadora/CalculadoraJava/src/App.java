import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner objScanner = new Scanner(System.in);
        Calculadora objCalculadora = new Calculadora();
        int choose, numero1, numero2;

        do {
            System.out.println("--- 1 Somar\n--- 2 Subtrair\n--- 3 Multiplicar\n--- 4 Dividir\n--- 0 Sair");
            System.out.println("Escolha uma opção :");
            choose = objScanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Digite o primeiro número");
                    numero1 = objScanner.nextInt();
                    System.out.println("Digite o segundo número");
                    numero2 = objScanner.nextInt();
                    objCalculadora.somar(numero1, numero2);
                    break;

                case 2:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Digite o primeiro número");
                    numero1 = objScanner.nextInt();
                    System.out.println("Digite o segundo número");
                    numero2 = objScanner.nextInt();
                    objCalculadora.subtrair(numero1, numero2);

                    break;
                case 3:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Digite o primeiro número");
                    numero1 = objScanner.nextInt();
                    System.out.println("Digite o segundo número");
                    numero2 = objScanner.nextInt();
                    objCalculadora.multiplicar(numero1, numero2);

                    break;
                case 4:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Digite o primeiro número");
                    numero1 = objScanner.nextInt();
                    System.out.println("Digite o segundo número");
                    numero2 = objScanner.nextInt();
                    objCalculadora.dividir(numero1, numero2);

                    break;

                case 0:
                    break;

                default:
                    break;
            }
        } while (choose != 0);

        objScanner.close();

    }
}
