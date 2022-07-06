package model;

public class Asignatura {
    int idAsignaturas;
String nombre;
int creditos;

    public Asignatura() {
    }

    public Asignatura(int idAsignaturas,String nombre, int creditos) {
        this.idAsignaturas=idAsignaturas;
        this.nombre = nombre;
        this.creditos=creditos;
    }

    public int getIdAsignaturas() {
        return idAsignaturas;
    }

    public void setIdAsignaturas(int idAsignaturas) {
        this.idAsignaturas = idAsignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "idAsignaturas=" + idAsignaturas +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}

