import Livro.Livro;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void testLivroConstructor() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            new Livro(null, "Nome do Autor");
        });

        assertEquals("O título não pode ser nulo ou vazio", exception.getMessage());
    }

    @Test
    @DisplayName("Teste para verificar o título do livro")
    public void testGetTitle() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");
        assertEquals("Dom Casmurro", livro.getTitulo());
    }

    @Test
    @DisplayName("Teste para verificar o autor do livro")
    public void testGetAuthor() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");
        assertEquals("Machado de Assis", livro.getAutor());
    }
}