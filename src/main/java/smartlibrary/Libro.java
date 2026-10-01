package smartlibrary;

import java.util.Objects;

public class Libro {
    private final String isbn;
    private final String titulo;

    public Libro(String isbn, String titulo) {
        this.isbn = Objects.requireNonNull(isbn, "El ISBN es obligatorio.");
        this.titulo = Objects.requireNonNull(titulo, "El título es obligatorio.");
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
}
