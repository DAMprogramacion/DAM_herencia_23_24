package ejercicios;

import java.time.LocalDate;
import java.util.StringJoiner;

public class ProfesorInterino extends Profesor {
    private int mesesContratacion;

    public ProfesorInterino(String nombrePersona, LocalDate fechaNacimiento, String dni,
                            Especialidad especialidad, int mesesContratacion) {
        super(nombrePersona, fechaNacimiento, dni, especialidad);
        this.mesesContratacion = mesesContratacion;
    }

    public int getMesesContratacion() {
        return mesesContratacion;
    }

    public void setMesesContratacion(int mesesContratacion) {
        this.mesesContratacion = mesesContratacion;
    }

    @Override
    public String toString() {
        return String.format("%s,%d", super.toString(), mesesContratacion);
    }
}
