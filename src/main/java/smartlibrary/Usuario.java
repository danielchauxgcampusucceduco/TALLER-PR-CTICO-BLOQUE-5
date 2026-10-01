package smartlibrary;

import java.util.Objects;

public abstract class Usuario {
    private final String identificacion;
    private final String nombre;
    private final String correo;

    protected Usuario(String identificacion, String nombre, String correo) {
        this.identificacion = Objects.requireNonNull(identificacion, "La identificación es obligatoria.");
        this.nombre = Objects.requireNonNull(nombre, "El nombre es obligatorio.");
        this.correo = Objects.requireNonNull(correo, "El correo es obligatorio.");
    }

    public String getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
}
