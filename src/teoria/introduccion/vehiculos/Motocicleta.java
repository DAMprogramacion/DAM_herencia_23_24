package teoria.introduccion.vehiculos;

public class Motocicleta extends Vehiculo{
    private int cilindrada;

    public Motocicleta(String propietario, int numeroPasajeros, int cilindrada) {

        super(2, propietario, numeroPasajeros);
        this.cilindrada = cilindrada;

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return String.format("%sCilindrada: %d%n", super.toString(), cilindrada);
    }
}
