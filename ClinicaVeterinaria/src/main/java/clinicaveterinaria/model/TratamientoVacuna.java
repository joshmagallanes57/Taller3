public class TratamientoVacuna implements ITratamiento {
    private final double costo;

    public TratamientoVacuna(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCostoFinal() {
        return costo + 5.0;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Observar fiebre durante 24 horas.";
    }
}