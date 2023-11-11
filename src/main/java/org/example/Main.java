package org.example;

import Biblioteca.Biblioteca;
import Livro.Livro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis");

        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);

        biblioteca.listarLivros();

    }
}
