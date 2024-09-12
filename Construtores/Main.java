package Construtores;

public class Main {
    public static void main(String[] args) {
        Users usuario = new Users("joaquim@gmail.com", "12345");
        System.out.println("Email : " + usuario.email + "\n" +"Senha : " + usuario.password); 
        Admin ademe = new Admin("Joasoasod", "333333", 10);

       
       
        System.out.println("\n"); 
        System.out.println("Dados do admin"); 
        System.out.println("Email : " + ademe.email + "\n" +"Senha : " + ademe.password + "\n" + "Idade : " + ademe.idade); 


    }
}
