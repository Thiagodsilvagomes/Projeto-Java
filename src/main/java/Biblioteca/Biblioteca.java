package Biblioteca;
import Livro.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : this.livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }
}

