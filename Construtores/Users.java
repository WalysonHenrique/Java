package Construtores;

class Users {
   
    //Atributes of the users
    String name;
    String email;
    String password;



    //Constructors
    public Users(String email, String password){
        System.out.println("Constructor is calling");
        this.email = email;
        this.password = password;
    }

    public Users(){

    }
    

    //methods

    void verifyUserSigin(){

    };

}

