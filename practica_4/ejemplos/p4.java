public class p4 {
    public static void main(String[] args) {

        persona pe1 = new persona("MARIA", "MARIA@UABC,COM");
        alumno a1 = new alumno("ana", "ana@uabc.com", 85.5);
        profesor p1 = new profesor("jose", "jose@uabc.com", 1208229);

        System.out.println("Alumno: " + a1.getNombre() + " " + a1.getCalificacion());
        //System.out.println("Profesor: " + p1.getNombre() + " "+ p1.getNumero());


        alumno a2 = new alumno("pepe", "pepe@uabc.com", 85.5);
        alumno a3 = new alumno("paco", "paco@uabc.com", 88.9);
        alumno a4 = new alumno("karen", "karen@uabc.com", 90);

        alumno[] misAlumnos = {
            a1,
            a2,
            a3,
            a4
        };

        System.out.println("Alumno: " + misAlumnos[1].getNombre() + "  " + misAlumnos[1].getCalificacion());




    }



}
