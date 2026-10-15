package clinicaveterinaria.model;


public abstract class Animal{
    protected int edad;
    protected String nombre;
    

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println(nombre + "esta comiendo");
    }
    
    public String getnombre(){
        return nombre;
    }
    public int getedad(){
        return edad;
    }
}
