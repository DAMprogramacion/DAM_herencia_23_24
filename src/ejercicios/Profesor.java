package ejercicios;

import java.time.LocalDate;

public class Profesor extends Persona{
    private Especialidad especialidad;

    public Profesor(String nombrePersona, LocalDate fechaNacimiento,
                    String dni, Especialidad especialidad) {
        super(nombrePersona, fechaNacimiento, dni);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), especialidad);
    }

}
