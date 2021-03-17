import java.util.Scanner;

class Escuela {
    public static void main(String[] args) {
        String nombre;
        int id;
        String materia;
        int calificacion;

        Scanner scanner = new Scanner(System.in);
        Estudiante estudiantes[] = new Estudiante[10];

        estudiantes[0] = new Estudiante("John", 1, "Matematicas", 60);
        estudiantes[1] = new Estudiante("Juan", 2, "Ingles", 100);
        estudiantes[2] = new Estudiante("Luis", 3, "Programacion", 80);
        estudiantes[3] = new Estudiante("Miguel", 4, "Calculo", 12);
        estudiantes[4] = new Estudiante("Andres", 5, "Matematicas", 40);

        for (int i = 0; i < 5; i++) {
            id = i + 6;

            System.out.println("Captura datos para Estudiante:" + id);
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Materia: ");
            materia = scanner.nextLine();
            System.out.print("Calificacion: ");
            calificacion = scanner.nextInt();
            scanner.nextLine();

            estudiantes[i + 5] = new Estudiante(nombre, id, materia, calificacion);

            System.out.println();
        }

        System.out.println("...Resultados...\n");
        for (int i = 0; i < 10; i++) {
            estudiantes[i].printInfo();
            System.out.println();
        }

        scanner.close();
    }
}
