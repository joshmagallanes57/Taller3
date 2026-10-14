package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.Caminador;

public class Gato extends Animal implements Caminador {
    public Gato(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void caminar() {
        System.out.println(nombre + "camina por el lugar");
    }
}
