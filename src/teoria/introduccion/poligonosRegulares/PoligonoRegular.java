package teoria.introduccion.poligonosRegulares;

public class PoligonoRegular {
    private String nombrePoligono;
    private int numeroLados;
    private float longitudLado;

    public PoligonoRegular(String nombrePoligono, int numeroLados, float longitudLado) {
        this.nombrePoligono = nombrePoligono;
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public String getNombrePoligono() {
        return nombrePoligono;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public float getLongitudLado() {
        return longitudLado;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public void setLongitudLado(float longitudLado) {
        this.longitudLado = longitudLado;
    }
    public float calcularPerimetro() {
        return numeroLados * longitudLado;
    }

    @Override
    public String toString() {
        return String.format("%S de longitud %.2f, de perímetro %.2f",
                nombrePoligono, longitudLado, calcularPerimetro());
    }
}
