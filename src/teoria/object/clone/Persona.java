package teoria.object.clone;

import java.util.Objects;
import java.util.StringJoiner;

public class Persona implements Cloneable{
    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Persona.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nombre='" + nombre + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
