package smartlibrary;

/** Contrato para los usuarios que pueden recibir avisos del sistema. */
public interface Notificable {
    void notificar(String mensaje);
}
