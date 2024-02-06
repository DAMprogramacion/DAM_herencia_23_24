package ejercicios;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {
    private LocalDate fechaIncorporacion;

    public ProfesorTitular(String nombrePersona, LocalDate fechaNacimiento, String dni,
                           Especialidad especialidad, LocalDate fechaIncorporacion) {
        super(nombrePersona, fechaNacimiento, dni, especialidad);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString()).append(',');
        builder.append(fechaIncorporacion.getYear());
        return builder.toString();
    }



}
