package teoria.object.equalsANDhashcode;

import java.util.Objects;

public record Ordenador(String numeroSerie, int ram, double cpu, String placa) {
    public Ordenador(String numeroSerie) {
        this(numeroSerie, 0, 0, null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordenador ordenador = (Ordenador) o;
        return Objects.equals(numeroSerie, ordenador.numeroSerie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroSerie);
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%.1f,%S", numeroSerie, ram, cpu, placa);
    }
}
