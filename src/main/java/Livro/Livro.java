package Livro;


public class Livro {
    private String Titulo;
    private String Autor;

    public Livro(String titulo, String autor) {
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

