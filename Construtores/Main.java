package Construtores;

public class Main {
    public static void main(String[] args) {
        Users usuario = new Users("joaquim@gmail.com", "12345");
        System.out.println("Email : " + usuario.email + "\n" +"Senha : " + usuario.password); 
    }
}
