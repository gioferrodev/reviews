package dev.gioferro;

public class Usuario {
    private String nome;
    private int idade;
    private char sexo;

    public Usuario(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return nome;
    }

}
