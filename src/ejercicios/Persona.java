package ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona {
    private String nombrePersona;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona(String nombrePersona, LocalDate fechaNacimiento, String dni) {
        this.nombrePersona = nombrePersona;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(dni).append(',');
        builder.append(nombrePersona).append(',');
        builder.append(fechaNacimiento.getDayOfMonth()).append('-');
        builder.append(fechaNacimiento.getMonthValue()).append('-');
        builder.append(fechaNacimiento.getYear());
        return builder.toString();
    }   //12345678H,juan garcía colmenero,10-12-1999

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }









}
