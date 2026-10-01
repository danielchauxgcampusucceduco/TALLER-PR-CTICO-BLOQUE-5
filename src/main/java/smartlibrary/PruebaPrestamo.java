package smartlibrary;

import java.time.LocalDate;

public class PruebaPrestamo {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "1001", "Ana Pérez", "ana@ucc.edu.co", "20261234", "Ingeniería de Sistemas");
        Libro libro = new Libro("978-958-000-001-1", "Diseño orientado a objetos");
        Ejemplar ejemplar = new Ejemplar("EJ-001", libro, "Disponible");
        Prestamo prestamo = new Prestamo(estudiante, ejemplar, LocalDate.of(2026, 10, 10));

        prestamo.renovar(LocalDate.of(2026, 10, 15));
        estudiante.notificar("Su préstamo fue renovado.");
        System.out.println("Nueva fecha: " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Cantidad de renovaciones: " + prestamo.getRenovaciones().size());

        try {
            prestamo.renovar(LocalDate.of(2026, 10, 15));
        } catch (IllegalArgumentException e) {
            System.out.println("Renovación inválida rechazada: " + e.getMessage());
        }
    }
}
