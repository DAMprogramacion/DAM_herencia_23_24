package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Claustro {
    private String nombreCentro;
    private List<Profesor> profesores = new ArrayList<>();

    public Claustro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }
    public boolean addProfesor(Profesor profesor) {
        return profesores.add(profesor);
    }
    public boolean eliminarProfesor(Profesor profesor) {
        return profesores.remove(profesor);
    }
    public Optional<Profesor> buscarProfesor(Profesor profesor){
        for (Profesor profesorBuscado : profesores)
            if (profesorBuscado.equals(profesor))
                return Optional.of(profesorBuscado);
        return Optional.empty();
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
    public double obtenerEdadMediaProfesores() {
       /* double sumaEdad = 0;
        for (Profesor profesor : profesores)
            sumaEdad += Helper.calcularAnnos(profesor);
        return sumaEdad / profesores.size();*/
        return profesores.stream()
                .mapToDouble(Helper::calcularAnnos)
                .average()
                .getAsDouble();
    }
    public Profesor obtenerProfesorTitularMasAntiguo () {
       /* ProfesorTitular profesorMasAntiguo = new ProfesorTitular(
                null, null, null,
                null, LocalDate.now()
        );
        for (Profesor profesor : profesores){
            if (profesor instanceof ProfesorTitular){
                ProfesorTitular profesorTitular = (ProfesorTitular) profesor;
                if (profesorTitular.getFechaIncorporacion()
                        .isBefore(profesorMasAntiguo.getFechaIncorporacion()))
                    profesorMasAntiguo = profesorTitular;
            }
        }
        return profesorMasAntiguo;*/
        return profesores.stream()
                .filter(profesor -> profesor instanceof ProfesorTitular)
                .min(Comparator.comparing(profesor -> ((ProfesorTitular) profesor).getFechaIncorporacion()))
                .get();
    }
    public long obtenerNumeroProfesoresPorEspecialidad (Especialidad especialidad){
        /*int numeroProfesores = 0;
        for (Profesor profesor : profesores)
            if (profesor.getEspecialidad().equals(especialidad))
                numeroProfesores++;
        return  numeroProfesores;*/
        return profesores.stream()
                .filter(profesor -> profesor.getEspecialidad().equals(especialidad))
                .count();
    }








}
