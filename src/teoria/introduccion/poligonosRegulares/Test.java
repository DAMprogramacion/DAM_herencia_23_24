package teoria.introduccion.poligonosRegulares;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<PoligonoRegular> poligonoRegulares = List.of(new Cuadrado(4.2f),
                new Cuadrado(3.3f), new TrianguloEquilatero(2),
                new TrianguloEquilatero(1.1f), new Hexagono(4),
                new Hexagono(7.1f), new Hexagono(5.8f));
        mostrarPoligonoEnConsola(poligonoRegulares);
        List<PoligonoRegular> hexagonos = obtenerHexagonos(poligonoRegulares);
        System.out.println("=======Hexágonos=========");
        mostrarPoligonoEnConsola(hexagonos);
        float sumaPerimetrosDeCuadrados = obtenerSumaPerimetrosDeCuadrados(poligonoRegulares);
        PoligonoRegular poligonMayorArea = obtenerPoligonMayorArea(poligonoRegulares);

    }

    private static List<PoligonoRegular> obtenerHexagonos(List<PoligonoRegular> poligonoRegulares) {
        return poligonoRegulares.stream()
                .filter( poligono -> poligono.getNumeroLados() == 6 )
                .toList();
    }

    private static void mostrarPoligonoEnConsola(List<PoligonoRegular> poligonoRegulares) {
        poligonoRegulares.forEach(System.out::println);
       /* poligonoRegulares.forEach(p -> System.out.println(p));
        for (PoligonoRegular poligonoRegular : poligonoRegulares)
            System.out.println(poligonoRegular);*/
    }
}
