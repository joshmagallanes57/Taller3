package clinicaveterinaria.model;

public class Pez extends Animal implements Nadador{
    public Pez(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void nadar() {
        System.out.println(nombre + "nada sin parar");
    }

}
