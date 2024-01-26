package teoria.introduccion.vehiculos;

public class Coche extends Vehiculo{
    private TipoCoche tipoCoche;
    private boolean descapotable;

    public Coche(String propietario, int numeroPasajeros,
                 TipoCoche tipoCoche, boolean descapotables) {
        super(4, propietario, numeroPasajeros);
        this.tipoCoche = tipoCoche;
        this.descapotable = descapotables;
    }

    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setTipoCoche(TipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public String toString() {
        return String.format("%sTipo de coche: %s\nDescapotable: %B\n",
                super.toString(), tipoCoche, descapotable);
    }
}
