package teoria.introduccion.poligonosRegulares;

public class Hexagono extends PoligonoRegular {
    public Hexagono( float longitudLado) {
        super("Hexágono", 6, longitudLado);
    }
    public float calcularArea() {
        return 1.72f * getLongitudLado() * getLongitudLado();
    }

    @Override
    public String toString() {
        return String.format("%s y superficie %.2f", super.toString(), calcularArea());
    }
}
