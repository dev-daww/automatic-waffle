import java.util.Scanner;
//     1. Crear una clase llamada "Persona" que contenga un nombre, CURP, y RFC.

public class Persona {
        private Scanner scanner = new Scanner(System.in);
        public String RFC;
        public String CURP;
        private String nombre_completo;
        private String fecha_de_nacimiento;

    public Persona() {
        // this.nombre_completo = nombre_completo;
        // this.fecha_de_nacimiento = fecha_de_nacimiento;
        System.out.println("Introduce tu nombre completo: ");
        this.nombre_completo = scanner.nextLine();

        System.out.println("Introduce to fecha de nacimiento: ");
        this.fecha_de_nacimiento = scanner.nextLine();
    }
}
