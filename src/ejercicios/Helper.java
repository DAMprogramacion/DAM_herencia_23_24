package ejercicios;

import java.time.LocalDate;
import java.time.Period;

public class Helper {
    public static int calcularAnnos(Persona persona){
        Period periodo = Period.between(persona.getFechaNacimiento(), LocalDate.now());
        return periodo.getYears();
    }
}
