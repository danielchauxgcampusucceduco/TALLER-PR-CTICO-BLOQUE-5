package smartlibrary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prestamo {
    private final Estudiante estudiante;
    private final Ejemplar ejemplar;
    private LocalDate fechaPrevistaDevolucion;
    private final List<Renovacion> renovaciones = new ArrayList<>();

    public Prestamo(Estudiante estudiante, Ejemplar ejemplar, LocalDate fechaPrevistaDevolucion) {
        this.estudiante = Objects.requireNonNull(estudiante, "El estudiante es obligatorio.");
        this.ejemplar = Objects.requireNonNull(ejemplar, "El ejemplar es obligatorio.");
        this.fechaPrevistaDevolucion = Objects.requireNonNull(fechaPrevistaDevolucion, "La fecha prevista es obligatoria.");
    }

    public void renovar(LocalDate nuevaFecha) {
        Objects.requireNonNull(nuevaFecha, "La nueva fecha es obligatoria.");
        if (!nuevaFecha.isAfter(fechaPrevistaDevolucion)) {
            throw new IllegalArgumentException(
                    "La nueva fecha debe ser posterior a la fecha prevista de devolución vigente.");
        }

        Renovacion renovacion = new Renovacion(LocalDate.now(), fechaPrevistaDevolucion, nuevaFecha);
        renovaciones.add(renovacion);
        fechaPrevistaDevolucion = nuevaFecha;
    }

    public Estudiante getEstudiante() { return estudiante; }
    public Ejemplar getEjemplar() { return ejemplar; }
    public LocalDate getFechaPrevistaDevolucion() { return fechaPrevistaDevolucion; }
    public List<Renovacion> getRenovaciones() { return List.copyOf(renovaciones); }
}
