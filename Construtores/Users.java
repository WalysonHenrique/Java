package Construtores;

public class Users {
   
    //Atributes of the users
    String name;
    String email;
    String password;


    //Constructors
    Users(String email, String password){
        System.out.println("Constructor is calling");
        this.email = email;
        this.password = password;
    }


    //methods

    void verifyUserSigin(){

    };

}
