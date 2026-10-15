package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.Caminador;

public class Perro extends Animal implements Caminador{
    public Perro(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void caminar() {
        System.out.println(nombre + "esta caminando con sus cuatro patas");
    }
}
