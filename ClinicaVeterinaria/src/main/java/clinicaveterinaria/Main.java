package clinicaveterinaria;

import clinicaveterinaria.model.*;
import clinicaveterinaria.interfaces.*;


public class Main {
    public static void main(String[] args) {
        Perro Spike = new Perro(10, "Spike");
        Pez Dori = new Pez(11, "Dori");
        Pajaro Zazu = new Pajaro(12, "Zazu");

        Spike.caminar();
        Spike.comer();

        Dori.comer();
        Dori.nadar();

        Zazu.volar();
        Zazu.caminar();
        Zazu.comer();
    }

}