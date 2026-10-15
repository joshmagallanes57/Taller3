package clinicaveterinaria.model;
import clinicaveterinaria.interfaces.ITratamiento;

public class TratamientoMedicamento implements ITratamiento {
    private final double costo;

    public TratamientoMedicamento(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCostoFinal() {
        return costo * 1.10;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Administrar segun receta.";
    }
    @Override
    public String prepararSala() {
        return "Preparar receta y dosis.";
    }
}