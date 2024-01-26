package teoria.introduccion.vehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehiculo {
    private int numeroRuedas;
    private String propietario;
    private LocalDate fechaCompra;
    private int numeroPasajeros;

    public Vehiculo(int numeroRuedas, String propietario, int numeroPasajeros) {
        this.numeroRuedas = numeroRuedas;
        this.propietario = propietario;
        this.numeroPasajeros = numeroPasajeros;
        this.fechaCompra = LocalDate.now();
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public String getPropietario() {
        return propietario;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        //DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        return String.format(
                "numeroRuedas : %d\npropietario : " +
                        "%s\nfechaCompra : %s\nnumeroPasajeros : %d\n",
                numeroRuedas, propietario, fechaCompra, numeroPasajeros);
    }

    public static void main(String[] args) {
        System.out.println(new Vehiculo(
                4, "jacinto garcía", 4));
    }
}
