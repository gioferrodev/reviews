package dev.gioferro;

public class App {
    public static void main(String[] args) {
        Filme starWars = new Filme("Star Wars", 1977);
        Usuario usuario1 = new Usuario("gioferro");
        Usuario teste = new Usuario("teste");
        Review review1 = new Review(usuario1, 10, "Ótimo Filme");
        Review review27 = new Review(teste, 7, "Gosto muito");
        
        starWars.adicionaReview(review1);
        starWars.adicionaReview(review27);
    }
}
