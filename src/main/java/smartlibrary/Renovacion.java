package smartlibrary;

import java.time.LocalDate;
import java.util.Objects;

public class Renovacion {
    private final LocalDate fechaRenovacion;
    private final LocalDate fechaAnterior;
    private final LocalDate nuevaFecha;

    public Renovacion(LocalDate fechaRenovacion, LocalDate fechaAnterior, LocalDate nuevaFecha) {
        this.fechaRenovacion = Objects.requireNonNull(fechaRenovacion, "La fecha de renovación es obligatoria.");
        this.fechaAnterior = Objects.requireNonNull(fechaAnterior, "La fecha anterior es obligatoria.");
        this.nuevaFecha = Objects.requireNonNull(nuevaFecha, "La nueva fecha es obligatoria.");
    }

    public LocalDate getFechaRenovacion() { return fechaRenovacion; }
    public LocalDate getFechaAnterior() { return fechaAnterior; }
    public LocalDate getNuevaFecha() { return nuevaFecha; }
}
