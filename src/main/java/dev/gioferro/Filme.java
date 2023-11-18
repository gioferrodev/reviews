package dev.gioferro;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int anoLancamento;
    private String categoria;
    private double mediaReviews;
    private List<Review> reviews;

    public Filme(String titulo, int anoLancamento){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.mediaReviews = 0;
        this.reviews = new ArrayList<>();
    }

    public String getTitulo(){
        return titulo;
    }
}
