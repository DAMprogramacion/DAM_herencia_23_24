package teoria.introduccion.poligonosRegulares;

public class Cuadrado extends PoligonoRegular{
    public Cuadrado(  float longitudLado) {
        super("cuadrado", 4, longitudLado);
    }
    public float calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }

    @Override
    public String toString() {
        return String.format("%s y superficie %.2f", super.toString(), calcularArea());
    }
}
