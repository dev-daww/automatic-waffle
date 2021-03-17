import java.util.Scanner;

public class idk {
    public static void main(final String[] args) {
        final String nombre;
        final float cal;

        Scanner comando = new Scanner(System.in);
        System.out.println("Captura tu nombre");
        nombre = comando.nextLine();

		System.out.println("Captura calificacion");
		cal = comando.nextFloat();
		System.out.println(nombre + "-" + cal);
    }
}
