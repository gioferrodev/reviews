package dev.gioferro;

public class Usuario {
    private String login;

    public Usuario(String login){
        this.login = login;
    }

    @Override
    public String toString(){
        return login;
    }

}
