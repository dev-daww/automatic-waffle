public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //métodos
    public void Dormir() {
        System.out.println(nombre + ": duerme");
    }

    public void Comer() {
        System.out.println(nombre + ": esta comiendo");
    }

    //getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(int edad) {
        this.edad = edad;
    }
}
