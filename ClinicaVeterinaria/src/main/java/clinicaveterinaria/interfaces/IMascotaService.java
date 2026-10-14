package clinicaveterinaria.interfaces;


import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Veterinario;


public interface IMascotaService {
    
    void crearMascota(Mascota mascota);

    Mascota obtenerMascota(int id);

    void actualizarMascota(Mascota mascota);

    void eliminarMascota(int id);

    void crearVeterinario(Veterinario veterinario);

    Veterinario obtenerVeterinario(int id);

}