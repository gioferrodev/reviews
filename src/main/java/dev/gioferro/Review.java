package dev.gioferro;

public class Review {
    private Usuario usuario;
    private double nota;
    private String comentario;

    public Review(Usuario usuario, double nota, String comentario){
        this.usuario = usuario;
        this.nota = nota;
        this.comentario = comentario;
    }

    public double getNota(){
        return nota;
    }

    public String getComentario(){
        return comentario;
    }

    @Override
    public String toString(){
        return usuario+"deu a nota "+nota+"/5.";
    }
}
