package clinicaveterinaria.model;

import java.util.Objects;
import clinicaveterinaria.interfaces.ITratamiento;

public class Tratamiento {
    private int id;
    private TipoTratamiento tipo;
    private String descripcion;
    private double costo;
    private ITratamiento tratamiento;

    public Tratamiento(int id, TipoTratamiento tipo,
                       String descripcion, double costo,
                       ITratamiento tratamiento) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.tratamiento = tratamiento;
    }

    public double calcularCostoFinal() {
        return tratamiento.calcularCostoFinal();
    }

    public String obtenerIndicaciones() {
        return tratamiento.obtenerIndicaciones();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoTratamiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoTratamiento tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public ITratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(ITratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tratamiento)) return false;
        Tratamiento that = (Tratamiento) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                '}';
    }
}