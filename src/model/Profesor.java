package model;

public class Profesor {
    int idProfesores;
    String nombre;
    String apellido;
    String dni;

    public Profesor() {
    }

    public Profesor(int idProfesores,String nombre, String apellido, String dni) {
        this.idProfesores=idProfesores;
        this.nombre = nombre;
        this.apellido=nombre;
        this.dni=dni;
    }

    public int getIdProfesores() {
        return idProfesores;
    }

    public void setIdProfesores(int idProfesores) {
        this.idProfesores = idProfesores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idProfesores=" + idProfesores +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
