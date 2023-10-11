import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        
        int n1, n2;
        int choose = 0;
        do {
            System.out.println("Menu :\n\n1 Para soma\n2 Para subtração\n3 Para divisao\n4 para multiplication\n0 para sair");
            choose = input.nextInt();
        switch (choose)
        {
            case 1:
                System.out.println("Soma selecionado :\n");
                System.out.println("\nDigite o primeiro numero");
                n1 = input.nextInt();
                System.out.println("\nDigite o segundo numero");
                n2 = input.nextInt();
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtração selecionada :\n");
                System.out.println("\nDigite o primeiro numero");
                n1 = input.nextInt();
                System.out.println("\nDigite o segundo numero");
                n2 = input.nextInt();
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Divisao selecionada :\n");
                System.out.println("\nDigite o primeiro numero :");
                n1 = input.nextInt();
                System.out.println("\nDigite o segundo numero :");
                n2 = input.nextInt();
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Nao e possivel divisao por zero");
                    break;
                }
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            case 4:
                System.out.println("Multiplicação selecionada : \n");
                System.out.println("\nDigite o primeiro numero :");
                n1 = input.nextInt();
                System.out.println("\nDigite o segundo numero :");
                n2 = input.nextInt();
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
                case 0:
                System.out.println("Saindo ...");
                break;
                default: 
                System.out.println("Opcion invalida");
        }
        } while (choose != 0);
    }
}
