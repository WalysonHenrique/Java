import java.util.Scanner;


public class ContaTerminal{

    static class Usuario{
        String Nome, Agencia;
        Integer Numero;
        Double Saldo;

        public Usuario(String Nome, String Agencia, Integer Numero, Double Saldo ) {
            this.Nome = Nome;
            this.Agencia = Agencia;
            this.Numero = Numero;
            this.Saldo = Saldo;
        }


        
    }

    public static void main(String[] args){
        
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Digite o nome do usuario : ");
        String nome = objScanner.next();
        System.out.println("Digite a agencia do usuario : ");
        String agencia = objScanner.next();
        System.out.println("Digite o numero do usuario : ");
        Integer numero = objScanner.nextInt();
        System.out.println("Digite o saldo do usuario : ");
        Double saldo = objScanner.nextDouble();




        Usuario objUsuario = new Usuario(nome, agencia, numero, saldo);



        System.out.println("Olá" +  objUsuario.Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +  objUsuario.Agencia + ", conta " + objUsuario.Numero + "e seu saldo " + objUsuario.Saldo + " já está disponível para saque");



    }
}