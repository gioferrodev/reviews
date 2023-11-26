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

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getMediaReviews(){
        return mediaReviews;
    }

    public void adicionaReview(Review r){
        reviews.add(r);
        calcularMediaReview();
    }

    private void calcularMediaReview(){
        if(!reviews.isEmpty()){
            double soma = 0;
            for(Review r : reviews){
                soma += r.getNota();
            }
            mediaReviews = soma / reviews.size();
        }
    }
}
