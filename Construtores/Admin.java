package Construtores;

public class Admin extends Users{

    int idade;


    public Admin(String email, String password, int idade){
        this.email = email;
        this.password = password;
        this.idade = idade;

    }
}