package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Factura;
import clinicaveterinaria.model.Tratamiento;
import clinicaveterinaria.model.Veterinario;


public interface IFacturaService {
    
    void crearTratamiento(Tratamiento tratamiento);

    double calcularTratamiento(Tratamiento tratamiento);

    void actualizarVeterinario(Veterinario veterinario);

    void eliminarVeterinario(int id);

    void crearFactura(Factura factura);

    void pagarFactura(int id);

}