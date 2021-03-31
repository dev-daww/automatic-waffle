public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void Comer() {
        System.out.println(nombre + " Esta comiendo whiskas");
    }
}
