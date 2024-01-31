package teoria.introduccion.poligonosRegulares;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

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
        double sumaPerimetrosCuadrados = obtenerSumaPerimetrosDeCuadrados(poligonoRegulares);
        System.out.println("===Suma perímetros cuadrados====");
        System.out.printf("La suma de los périmetros de los cuadrados vale %.3f%n",
                sumaPerimetrosCuadrados);

        PoligonoRegular poligonMayorArea = obtenerPoligonoMenorPerimetro(poligonoRegulares);
        System.out.println("===Polígono menor perímetro====");
        System.out.println(poligonMayorArea);
    }

    private static PoligonoRegular obtenerPoligonoMenorPerimetro(List<PoligonoRegular> poligonoRegulares) {
        return poligonoRegulares.stream()
                .min(Comparator.comparing(PoligonoRegular::calcularPerimetro))
                .get();
    }
    private static double obtenerSumaPerimetrosDeCuadrados(List<PoligonoRegular> poligonoRegulares) {
        return poligonoRegulares.stream()
                .filter(poligonoRegular -> poligonoRegular.getNumeroLados() == 4)
                .mapToDouble(PoligonoRegular::calcularPerimetro)
                .sum();
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
