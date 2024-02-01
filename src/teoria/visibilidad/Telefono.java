package teoria.visibilidad;

public class  Telefono {
    private String numeroTelefono;

    public Telefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    String getNumeroTelefono() {
        return numeroTelefono;
    }

    protected void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public final void darInformacion() {
        System.out.println("Nº teléfono: " + numeroTelefono);
    }
}
