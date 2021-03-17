import java.util.Scanner;

public class Estudiante {
    String nombre;
    int id;
    String materia;
    int calificacion;
    private String estado; // activo = 1; dado de baja = 0

    public Estudiante(String nombre, int id, String materia, int calificacion) {
        this.nombre = nombre;
        this.id = id;
        this.materia = materia;
        this.calificacion = calificacion;

        if (calificacion <= 60) {
            this.estado = "Reprobado";
        } else {
            this.estado = "Aprobado";
        }
    }

    public void setInfo(int id) {
        Scanner scanner = new Scanner(System.in);
        this.nombre = scanner.nextLine();
        this.id = id;
        this.materia = scanner.nextLine();
        this.calificacion = scanner.nextInt();

        if (calificacion <= 60) {
            this.estado = "Reprobado";
        } else {
            this.estado = "Aprobado";
        }

        scanner.close();
    }

    public void printInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.id);
        System.out.println("Materia: " + this.materia);
        System.out.println("calificacion: " + this.calificacion);
        System.out.println("Estado: " + this.estado);
    }

}
