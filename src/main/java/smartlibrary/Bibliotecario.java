package smartlibrary;

import java.util.Objects;

public class Bibliotecario extends Usuario {
    private final String codigoEmpleado;
    private final String turno;

    public Bibliotecario(String identificacion, String nombre, String correo,
                         String codigoEmpleado, String turno) {
        super(identificacion, nombre, correo);
        this.codigoEmpleado = Objects.requireNonNull(codigoEmpleado, "El código de empleado es obligatorio.");
        this.turno = Objects.requireNonNull(turno, "El turno es obligatorio.");
    }

    public String getCodigoEmpleado() { return codigoEmpleado; }
    public String getTurno() { return turno; }
}
