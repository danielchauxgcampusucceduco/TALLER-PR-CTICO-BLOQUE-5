package smartlibrary;

import java.util.Objects;

public class Estudiante extends Usuario implements Notificable {
    private final String codigoEstudiantil;
    private final String programaAcademico;

    public Estudiante(String identificacion, String nombre, String correo,
                      String codigoEstudiantil, String programaAcademico) {
        super(identificacion, nombre, correo);
        this.codigoEstudiantil = Objects.requireNonNull(codigoEstudiantil, "El código estudiantil es obligatorio.");
        this.programaAcademico = Objects.requireNonNull(programaAcademico, "El programa académico es obligatorio.");
    }

    public String getCodigoEstudiantil() { return codigoEstudiantil; }
    public String getProgramaAcademico() { return programaAcademico; }

    @Override
    public void notificar(String mensaje) {
        System.out.printf("Notificación para %s: %s%n", getNombre(), mensaje);
    }
}
