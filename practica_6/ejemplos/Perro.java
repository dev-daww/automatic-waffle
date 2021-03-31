public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void Comer() {
        System.out.println(nombre + " Esta comiendo pedigree");
    }

}
