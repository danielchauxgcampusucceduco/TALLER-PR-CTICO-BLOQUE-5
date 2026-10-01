package smartlibrary;

import java.util.Objects;

public class Ejemplar {
    private final String codigoBarra;
    private final Libro libro;
    private String estado;

    public Ejemplar(String codigoBarra, Libro libro, String estado) {
        this.codigoBarra = Objects.requireNonNull(codigoBarra, "El código de barras es obligatorio.");
        this.libro = Objects.requireNonNull(libro, "Todo ejemplar debe corresponder a un libro.");
        this.estado = Objects.requireNonNull(estado, "El estado es obligatorio.");
    }

    public String getCodigoBarra() { return codigoBarra; }
    public Libro getLibro() { return libro; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = Objects.requireNonNull(estado, "El estado es obligatorio."); }
}
