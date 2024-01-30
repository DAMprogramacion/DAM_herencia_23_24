package teoria.introduccion.poligonosRegulares;

public class TrianguloEquilatero extends PoligonoRegular{
    public TrianguloEquilatero( float longitudLado) {
        super("Triángulo equilatero", 3, longitudLado);
    }
    public float calcularArea() {
        return (float) (Math.pow(getLongitudLado(), 2) * Math.sqrt(3) / 4);
    }
    @Override
    public String toString() {
        return String.format("%s y superficie %.2f", super.toString(), calcularArea());
    }

}
