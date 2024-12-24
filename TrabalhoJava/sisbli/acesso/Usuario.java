package sisbli.acesso;

public class Usuario{
    private String nome;
    private String login;
    private String senha;
    private List<Funcionalidade> funcionalidades;
    private List<Usuario> usuarios;




    public Usuario(String nome, String login, String senha, List<Funcionalidade> funcionalidades){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.funcionalidades = funcionalidades;
    }

    public String getNome(){
        return this.nome;
    }

    public List<Funcionalidade> getFuncionalidades(){
        return this.funcionalidades;
    }

    public String sair(){
        return "Saindo...";
    }

}