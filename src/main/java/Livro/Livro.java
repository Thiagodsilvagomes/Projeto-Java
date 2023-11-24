package Livro;


public class Livro {
    private String Titulo;
    private String Autor;

    public Livro(String titulo, String autor) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio");
        }

        this.Titulo = titulo;
        this.Autor = autor;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public String getAutor() {
        return this.Autor;
    }
}



