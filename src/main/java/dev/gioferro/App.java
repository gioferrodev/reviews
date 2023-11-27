package dev.gioferro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Filme starWars = new Filme("Star Wars", 1977);
        Usuario gioferro = new Usuario("gioferro");
        Usuario teste = new Usuario("teste");
        Review review1 = new Review(gioferro, 10, "Ótimo Filme");
        Review review2 = new Review(teste, 7, "Gosto muito");
        starWars.adicionaReview(review1);
        starWars.adicionaReview(review2);
        
        System.out.println("** APP DE REVIEW DE FILMES **");
    }
}
