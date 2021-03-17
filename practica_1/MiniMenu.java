import java.util.Scanner;

class MiniMenu {
    static Scanner scanner = new Scanner(System.in);
    static int select = -1;
    static int[] calificaciones = new int[3];

    public static void main(String[] args) {
        while (select != 5) {
            try {
                System.out.println("1) Captura de nombre y calificaciones");
                System.out.println("2) Imprimir calificaciones y promedio de calificaciones");
                System.out.println("3) Imprimir calificaciones y calificación más baja");
                System.out.println("4) Imprimir calificaciones y calificación más alta");
                System.out.println("5) Salir");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        nombre_y_calificaciones();
                        break;
                    case 2:
                        Imprimir_resultados();
                        break;
                    case 3:
                        baja();
                        break;
                    case 4:
                        alta();

                        break;
                    case 5:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }

    public static void nombre_y_calificaciones() {
        System.out.println("Captura el nombre:");
        String nombre = scanner.nextLine();
        System.out.print("Tu nombre es: " + nombre + "\n");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Captura la calificación " + i);
            calificaciones[i] = scanner.nextInt();
        }

    }

    public static void Imprimir_resultados() {
        int suma = 0;
        double promedio;
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("La calificacion " + i + " es : " + calificaciones[i]);
        }
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }
        promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);
    }

    public static void baja() {
        int min = 100;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
        }
        System.out.println("La calificacion mas baja es:" + min);
    }

    public static void alta() {
        int max = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
        }
        System.out.println("La calificacion mas alta es:" + max);
    }
}
