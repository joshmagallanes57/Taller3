package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.Caminador;
import clinicaveterinaria.interfaces.Volador;

public class Pajaro extends Animal implements Volador, Caminador {
    public Pajaro(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void volar() {
        System.out.println(nombre + "vuela entre las nubes");
    }

    public void caminar() {
        System.out.println(nombre + "camina tranquilamente");
    }

}
