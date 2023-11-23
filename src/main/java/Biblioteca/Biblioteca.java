package Biblioteca;
import Livro.Livro;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Biblioteca {
    private List<Livro> livros;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Biblioteca.class);

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);
        logger.debug("Livro adicionado: {}", livro.getTitulo());
    }

    public void listarLivros() {
        for (Livro livro : this.livros) {
            logger.info("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
        logger.error("Erro ao listar os livros");
    }
}


