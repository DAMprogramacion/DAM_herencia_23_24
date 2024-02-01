package teoria.packageTest;

import teoria.visibilidad.Telefono;

public final class Movil extends Telefono {
    private String marca;

    public Movil(String numeroTelefono, String marca) {
        super(numeroTelefono); //constructor public Telefono
        this.marca = marca;
    }

    public void cambiarNumeroTelefono(String numeroTelefeno) {
        setNumeroTelefono(numeroTelefeno);  //es protected
    }
    public void obtenerInformacion() {
        super.darInformacion();
    }

//    @Override
//    public void darInformacion() {
//        super.darInformacion();
//    } NO SE PUEDE HACER PORQUE EL MÉTODO ESTÁ DECLARADO FINAL EN EL PADRE
}
