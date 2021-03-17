public class alumno extends persona {
    double calificacion;

    public alumno(String nombre, String correo, double calificacion) {
        super(nombre, correo);
        this.calificacion = calificacion;
    }


    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;


    }

    public double getCalificacion() {
        return calificacion;
    }


}
