package teoria.introduccion.vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(
                8, "pedro martínez", 2);
        System.out.println(vehiculo);
        System.out.println("======================");

        Coche coche1 = new Coche(
                "isidro gonzález", 5, TipoCoche.ELECTRICO,
                true);
        System.out.println(coche1);
        System.out.println("======================");

        Motocicleta motocicleta1 = new Motocicleta(
                "felisa romero",2, 250);
        System.out.println(motocicleta1);
        System.out.println("=======================");

        Vehiculo coche2 = new Coche( "isabel fernández", 5,
                TipoCoche.DIESEL, false);
        Vehiculo motocicleta2 = new Motocicleta(
                "marisa perales", 2, 500);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo);
        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(motocicleta1);
        vehiculos.add(motocicleta2);

        vehiculos.forEach(System.out::println);


    }
}
