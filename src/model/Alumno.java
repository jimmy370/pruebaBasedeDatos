package model;

public class Alumno {
    int idAlumno;
    String nombre ;
    String apellido ;
    int edad;

    public Alumno() {
    }

    public Alumno(int idAlumno,String nombre, String apellido, int edad) {
        this.idAlumno= idAlumno;
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(){
        this.nombre=nombre;
    }

    public void setApellido(){
        this.apellido=apellido;
    }
    public void setEdad(){
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
